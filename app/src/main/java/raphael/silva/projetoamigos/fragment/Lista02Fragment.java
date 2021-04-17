package raphael.silva.projetoamigos.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import raphael.silva.projetoamigos.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Lista02Fragment extends Fragment {


    public Lista02Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lista02, container, false);

        return view;
    }

}
