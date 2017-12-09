package com.metas.iesoluciones.productogis;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import com.metas.iesoluciones.productogis.adapters.PageAdapter;
import com.metas.iesoluciones.productogis.fragments.MapFragment;
import com.metas.iesoluciones.productogis.fragments.PlaceHolderFragment;
import com.metas.iesoluciones.productogis.interfaces.NavigationInterface;
import java.util.ArrayList;

public class MapsActivity extends FragmentActivity  implements NavigationInterface{

    private ViewPager viewPager;
    private PageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        this.viewPager = (ViewPager) findViewById(R.id.viewPager);
        adapter = new PageAdapter(getSupportFragmentManager(), addFragments());
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(1);
        //viewPager.setPageTransformer(true,new BackgroundToForegroundTransformer());

    }

    private ArrayList<Fragment> addFragments() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(PlaceHolderFragment.newInstance("TRANQUI IZQUIERDO"));
        fragments.add(MapFragment.newInstance(this));
        fragments.add(PlaceHolderFragment.newInstance("TRANQUI DERECHO"));
        return fragments;
    }


    @Override
    public void goToPage(int position) {
       viewPager.setCurrentItem(position,true);
    }
}
