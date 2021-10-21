package practica3.ivandelfatovar.iesseveroochoa.net;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Declaramos los botones salir y nuevo
    Button btNuevo;
    Button btSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //BOTON NUEVO
        btNuevo = (Button) findViewById(R.id.btNuevo);

        btNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityNuevoContacto.class);
                startActivity(intent);
            }
        });
        //BOTON SALIR

        btSalir = (Button)findViewById(R.id.btSalir);
        btSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View f) {
                finish();
            }
        });


    }
}