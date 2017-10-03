package com.bp.pruebaviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by borja on 2/10/17.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private String[] tab;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        //Representa el nombre de las pestañas.
        tab = new String[] {"Pos 1", "Pos 2", "Pos 3"};
    }

    /* Devuelve el elemento situado en la posición determinada. */
    @Override
    public Fragment getItem(final int pos) {
        /* Al seleccionar una pestaña se crea una instancia de MyFragment y se le pasa
        la posición correspondiente, Pos1, Pos2 o Pos3. */
        return MyFragment.newInstance(tab[pos]);

        /* En esta parte se puede hacer un switch y dependiendo de la pos u opción elegida
        * llamar a una actividad u otra. */
    }

    /* Devuelve el numero de vistas disponibles de la interfaz. En otras palabras, el
    * numero de pestañas. */
    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tab[position];
    }
}
