package com.bp.pruebaviewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private ViewPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* ViewPagerActivity muesta una actividad que consiste en un ViewPager y un TabLayout con varias pestañas. */
        setContentView(R.layout.view_pager);

        //ViewPager.
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        //Adaptador del tipo ViewPagerAdapter.
        mAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        //Gestiona la navegación entre pestañas.
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        //Relaciona el ViewPager con el Adaptador.
        mViewPager.setAdapter(mAdapter);
        //Declara el tabLayout haciendo referencia al definido en view_pager.
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        //Indica al tablayout cuál es el viewpager que debe escuchar.
        tabLayout.setupWithViewPager(mViewPager);
    }

    /* Gestiona el menu settings de la barra superior. */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_view_pager, menu);
        return true;
    }

    /* Define las posibles opciones del menú anterior. */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //En este caso solo tendrá una opción.
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
