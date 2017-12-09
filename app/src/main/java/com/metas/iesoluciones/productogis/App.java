package com.metas.iesoluciones.productogis;

import android.app.Application;

import com.metas.iesoluciones.productogis.models.Circulo;
import com.metas.iesoluciones.productogis.models.DaoSession;
import com.metas.iesoluciones.productogis.models.Marcador;

import org.greenrobot.greendao.database.Database;

import java.util.List;

import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by iedeveloper on 14/07/17.
 */

public class App extends Application {

        private static App shareInstance;

        Api api;
     DaoSession daoSession;



    @Override
    public void onCreate() {
        super.onCreate();
        shareInstance = this;
        OkHttpClient client = new OkHttpClient.Builder()
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl("http://10.112.32.184/productogis/public/api/")
                .build();

        api = retrofit.create(Api.class);
    }


    public static App getShareInstance() {
        return shareInstance;
    }

    public Api getApi() {
        return api;
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }

    public interface Api{

        @GET("marcadores")
        Observable<List<Marcador>> login();

        @GET("circulos")
        Observable<List<Circulo>> getCirculos();
    }




}
