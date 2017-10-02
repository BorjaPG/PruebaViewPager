package com.bp.pruebaviewpager;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by borja on 2/10/17.
 */

public class MyFragment extends Fragment {

    public static final String EXTRA_TEXT = "EXTRA_TEXT";
    private String msg;

    /* Crea Fragmentos que contienen un TextView que representa la opción elegida. */
    public static Fragment newInstance(final String msg) {
        MyFragment f = new MyFragment();
        Bundle bdl = new Bundle(1);
        bdl.putString(EXTRA_TEXT, msg);
        f.setArguments(bdl);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            //Obtiene el texto que representa la opción elegida.
            msg = getArguments().getString(EXTRA_TEXT, "");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /* Rellena el fragmento que ocupa la vista, es decir el contenido de cada pestaña. */
        final View v = inflater.inflate(R.layout.activity_view_pager, container, false);
        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        /* El fragmento muestra un TextView con el nombre de la pestaña seleccionada. Se define...*/
        final TextView messageTextView = (TextView) view.findViewById(R.id.msg_txt);
        /*... y se le establece un texto. */
        messageTextView.setText(msg);
    }
}
