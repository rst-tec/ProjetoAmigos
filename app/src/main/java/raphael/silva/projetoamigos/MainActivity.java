package raphael.silva.projetoamigos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btApp01;
    private Button btApp02;
    private Button btApp03;
    private Button btApp04;
    private Button btApp05;
    private Button btApp06;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btApp01 = findViewById(R.id.btApp01);
        btApp01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent intent = new Intent(getApplicationContext(), Tela01Activity.class);
            startActivity(intent);
            }
        });

        btApp02 = findViewById(R.id.btApp02);
        btApp02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Tela02Activity.class);
                startActivity(intent);
            }
        });

        btApp03 = findViewById(R.id.btApp03);
        btApp03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Tela03Activity.class);
                startActivity(intent);
            }
        });
    }
}
