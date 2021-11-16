package practica3.ivandelfatovar.iesseveroochoa.net;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public final static int OPTION_REQUEST_ACEPTAR =4;

    //Declaramos los botones salir, nuevo y el textview agenda
    Button btNuevo;
    Button btSalir;
    TextView tvAgenda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAgenda = findViewById(R.id.tvAgenda);
        //manejamos los eventos con el listener
        findViewById(R.id.btNuevo).setOnClickListener(this);
        findViewById(R.id.btSalir).setOnClickListener(this);

    }
        @Override
        protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data ){
            super.onActivityResult(requestCode, resultCode, data);
            //Comprobamos el resultado
            if(resultCode == RESULT_OK){
                //Creamos una variable que nos almacene los datos de los textviews
                String result = tvAgenda.getText().toString() + "\n";
                //Recogemos los datos obtenidos
                String rest = data.getExtras().getString(ActivityNuevoContacto.EXTRA_NUEVOS_DATOS);
                //Mostramos los datos en pantalla
                tvAgenda.setText(new StringBuilder().append(result).append(rest).toString());

            }
        }
    //Con el metodo onClick usamos el boton nuevo para llamar a la segunda actividad con el metodo intent, y el boton salir para salir de la actividad.
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, ActivityNuevoContacto.class);

        switch (view.getId()){
            case R.id.btNuevo:
                startActivityForResult(intent,OPTION_REQUEST_ACEPTAR);
                break;
            case R.id.btSalir:
                finish();
                break;
        }

    }
}



