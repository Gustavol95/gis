package com.metas.iesoluciones.productogis.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.flipboard.bottomsheet.BottomSheetLayout;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.metas.iesoluciones.productogis.ObservableHelper;
import com.metas.iesoluciones.productogis.R;
import com.metas.iesoluciones.productogis.interfaces.NavigationInterface;

import org.w3c.dom.Text;

/**
 * Created by iedeveloper on 19/07/17.
 */

public class MapFragment extends Fragment implements OnMapReadyCallback {

    private SupportMapFragment supportMapFragment;
    private GoogleMap mMap;
    protected BottomSheetLayout bottomSheetLayout;
    private BottomSheetBehavior mBottomSheetBehavior2;
    private AppCompatButton btnMarcadores,btnCirculos;
    private View view;
    private TextView tvIzquierda;
    private NavigationInterface navigationInterface;

    public MapFragment() {

    }


    public static MapFragment newInstance(NavigationInterface navigationInterface) {
        MapFragment fragment = new MapFragment();
        fragment.setNavigationInterface(navigationInterface);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_map, container, false);
        bottomSheetLayout = (BottomSheetLayout) rootView.findViewById(R.id.bottomsheet);
        btnMarcadores=(AppCompatButton) rootView.findViewById(R.id.btnMarcadores);
        btnCirculos=(AppCompatButton) rootView.findViewById(R.id.btnCirculos);

        supportMapFragment=(SupportMapFragment)getChildFragmentManager().findFragmentById(R.id.map);
        supportMapFragment.getMapAsync(this);
        view=rootView.findViewById(R.id.view);

        tvIzquierda=(TextView)rootView.findViewById(R.id.tvIzquierda);
        final View bottomSheet2 = rootView.findViewById(R.id.bottom_sheet2);
        mBottomSheetBehavior2 = BottomSheetBehavior.from(bottomSheet2);
        mBottomSheetBehavior2.setHideable(true);
        mBottomSheetBehavior2.setPeekHeight(300);
        mBottomSheetBehavior2.setHideable(false);
        mBottomSheetBehavior2.setState(BottomSheetBehavior.STATE_DRAGGING);
        btnMarcadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObservableHelper.getMarcadores().subscribe(ObservableHelper.getMarcadoresCallback(mMap));
            }
        });

        btnCirculos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObservableHelper.getCirculos().subscribe(ObservableHelper.getCirculosCallback(mMap));
            }
        });
        tvIzquierda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigationInterface.goToPage(0);
            }
        });
        mBottomSheetBehavior2.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                Log.i("TAG","new State "+newState);
                switch(newState){
                    case 1:
                        view.setVisibility(View.VISIBLE);
                        view.setAlpha(0f);
                        break;
                }

            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {
                Log.i("TAG","SlideOffSet +"+slideOffset);
                view.setAlpha(slideOffset);
                //bottomSheet.setBackgroundColor(Color.argb((int)((slideOffset*100)*2.55),0,0,0));
            }
        });
        return rootView;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap=googleMap;
    }

    public void setNavigationInterface(NavigationInterface navigationInterface){
        this.navigationInterface=navigationInterface;
    }
}
