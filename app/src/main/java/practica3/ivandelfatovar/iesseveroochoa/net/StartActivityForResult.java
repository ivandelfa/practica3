package practica3.ivandelfatovar.iesseveroochoa.net;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//Implementamos nuestra clase principal con el método Click
public class StartActivityForResult extends AppCompatActivity implements View.OnClickListener {
    //Con estas constantes indentificamos los valores extra
    public static final String EXTRA_DATOS_RESULTADO ="practica3.ivandelfatovar.iesseveroochoa.net.StartActivityForResult.resultado";
    public static final String EXTRA_DATOS ="practica3.ivandelfatovar.iesseveroochoa.net.StartActivityForResult.datos";

    EditText etForResult;
    Button btForResultOk;
    Button btForResultCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_for_result);

        etForResult = findViewById(R.id.etForResult);
        btForResultOk = findViewById(R.id.btForResultOk);
        btForResultCancel = findViewById(R.id.btForResultCancel);
        //manejo de los eventos del boton clicklistener
        findViewById(R.id.etForResult).setOnClickListener(this);
        findViewById(R.id.btForResultCancel).setOnClickListener(this);
        findViewById(R.id.btForResultOk).setOnClickListener(this);
        //se le asigna el valor recibido por el activity
        etForResult.setText(getIntent().getStringExtra(EXTRA_DATOS));

    }
    //Con este metodo implementamos la respuesta de los botones del actibity (Ok y Cancel)
    @Override
    public void onClick(View view) {
         switch (view.getId()){
             //BotonOK
             case R.id.btForResultOk:
                 //Si el EditText esta vacío enviamos el resultado
                 if(etForResult.getText().length()!=0){
                    //Guardamos el resultado
                     Intent it = getIntent();
                     it.putExtra(EXTRA_DATOS_RESULTADO, etForResult.getText().toString());
                     //Si se ha pulsado aceptar enviamos el intent
                     setResult(RESULT_OK,it);
                     //Cerramos actividad
                     finish();
                 }
                 break;
                 //Boton Cancel
             case R.id.btForResultCancel:
                 //Indicamos al usuario que ha pulsado Cancel
                 setResult(RESULT_CANCELED);
                 //Cerramos actividad
                 finish();
                 break;
         }

    }
}