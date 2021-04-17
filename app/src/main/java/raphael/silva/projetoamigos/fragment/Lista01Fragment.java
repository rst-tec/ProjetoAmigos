package raphael.silva.projetoamigos.fragment;


import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import raphael.silva.projetoamigos.R;
import raphael.silva.projetoamigos.Tela01Activity;
import raphael.silva.projetoamigos.Tela02Activity;
import raphael.silva.projetoamigos.Tela03Activity;
import raphael.silva.projetoamigos.Tela04Activity;
import raphael.silva.projetoamigos.Tela05Activity;
import raphael.silva.projetoamigos.Tela06Activity;

/**
 * A simple {@link Fragment} subclass.
 */
public class Lista01Fragment extends Fragment {
    private Button btApp01;
    private Button btApp02;
    private Button btApp03;
    private Button btApp04;
    private Button btApp05;
    private Button btApp06;

    public Lista01Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lista01, container, false);

        btApp01 = view.findViewById(R.id.btApp01);
        btApp01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(getActivity(), Tela01Activity.class);
            startActivity(intent);
            }
        });

        btApp02 = view.findViewById(R.id.btApp02);
        btApp02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Tela02Activity.class);
                startActivity(intent);
            }
        });

        btApp03 = view.findViewById(R.id.btApp03);
        btApp03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Tela03Activity.class);
                startActivity(intent);
            }
        });

        btApp04 = view.findViewById(R.id.btApp04);
        btApp04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Tela04Activity.class);
                startActivity(intent);
            }
        });

        btApp05 = view.findViewById(R.id.btApp05);
        btApp05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Tela05Activity.class);
                startActivity(intent);
            }
        });

        btApp06 = view.findViewById(R.id.btApp06);
        btApp06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Tela06Activity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
