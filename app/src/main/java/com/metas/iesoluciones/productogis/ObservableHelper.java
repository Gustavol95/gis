package com.metas.iesoluciones.productogis;

import android.graphics.Color;
import android.util.Log;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.metas.iesoluciones.productogis.models.Circulo;
import com.metas.iesoluciones.productogis.models.Marcador;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.observers.ResourceObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by iedeveloper on 14/07/17.
 */

public class ObservableHelper  {

    public static Observable<List<Marcador>> getMarcadores(){
        return App.getShareInstance().getApi().login()
                .map(new Function<List<Marcador>, List<Marcador>>() {
                    @Override
                    public List<Marcador> apply(List<Marcador> marcadors) throws Exception {

                        return marcadors;
                    }
                })
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());

    }

    public static ResourceObserver<List<Marcador>> getMarcadoresCallback(final GoogleMap googleMap){
        return new ResourceObserver<List<Marcador>>() {
            @Override
            public void onNext(List<Marcador> value) {
                for(Marcador m: value){
                    googleMap.addMarker(new MarkerOptions()
                            .title(m.getTitulo())
                            .snippet(m.getSnippet())
                            .position(new LatLng(m.getLatitud(),m.getLongitud()))
                            .flat(m.getFlat()==1)
                            .rotation(m.getRotation())
                            .zIndex(Float.parseFloat(m.getZIndex()+""))
                    );
                }
            }

            @Override
            public void onError(Throwable e) {
            }

            @Override
            public void onComplete() {
            }
        };
    }

    public static Observable<List<Circulo>> getCirculos(){
        return  App.getShareInstance().getApi().getCirculos()
                .map(new Function<List<Circulo>, List<Circulo>>() {
                    @Override
                    public List<Circulo> apply(List<Circulo> circulos) throws Exception {
                        for(Circulo c:circulos){
                            Log.i("TAG",c.toString());
                        }
                        return circulos;
                    }
                })
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
    }
    public static ResourceObserver<List<Circulo>> getCirculosCallback(final GoogleMap googleMap){
        return new ResourceObserver<List<Circulo>>() {
            @Override
            public void onNext(List<Circulo> value) {
                for(Circulo c:value){
                    googleMap.addCircle(new CircleOptions()
                            .center(new LatLng(c.getLatitud(),c.getLongitud()))
                            .radius(c.getRadio())
                    .fillColor(Color.HSVToColor(Math.round(Float.parseFloat((c.getAlpha()*255)+"")),new float[]{c.getHue(),c.getSaturation(),c.getValue()})));
                }
            }



            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
    }
}
