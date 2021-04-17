package raphael.silva.projetoamigos.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import raphael.silva.projetoamigos.R;
import raphael.silva.projetoamigos.fragment.Lista01Fragment;
import raphael.silva.projetoamigos.fragment.Lista02Fragment;

public class MainActivity extends AppCompatActivity {

    private Button btTela01;
    private Button btTela02;
    private Button btLinhaCor1;
    private Button btLinhaCor2;

    private Lista01Fragment lista01Fragment;
    private Lista02Fragment lista02Fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btTela01 = findViewById(R.id.btTela01);
        btTela02 = findViewById(R.id.btTela02);

        btLinhaCor1 = findViewById(R.id.btLinhaCor1);
        btLinhaCor2 = findViewById(R.id.btLinhaCor2);

        lista01Fragment = new Lista01Fragment();
        lista02Fragment = new Lista02Fragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, lista01Fragment);
        transaction.commit();

        btTela02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, lista02Fragment);
                btLinhaCor2.setBackgroundResource(R.drawable.linhaverde);
                btLinhaCor1.setBackgroundResource(R.drawable.linhapreta);
                transaction.commit();
            }
        });

        btTela01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, lista01Fragment);
                btLinhaCor1.setBackgroundResource(R.drawable.linhaverde);
                btLinhaCor2.setBackgroundResource(R.drawable.linhapreta);
                transaction.commit();
            }
        });
    }
}
