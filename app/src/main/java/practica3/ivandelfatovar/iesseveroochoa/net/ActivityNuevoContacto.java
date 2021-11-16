package practica3.ivandelfatovar.iesseveroochoa.net;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

//
public class ActivityNuevoContacto extends AppCompatActivity implements View.OnClickListener {
    public final static String EXTRA_NUEVOS_DATOS = "practica3.ivandelfatovar.iesseveroochoa.net.ActivityNuevoContacto.datos";
    public final static int OPTION_REQUEST_NOMBRE=1;
    public final static int OPTION_REQUEST_APELLIDOS=2;
    public final static int OPTION_REQUEST_EMPRESA=3;
    //Declaramos los botones, textview, radiogroup...
    Button btOk;
    Button btCancel;
    EditText etTelefono;
    TextView tvNombre;
    TextView tvApellidos;
    TextView tvEmpresa;
    TextView tvEdad;
    RadioGroup rgEmpresa;
    ImageView ivEmpresa;
    ImageView ivMujer;
    ImageView ivHombre;
    ImageView ivParticular;
    ImageView ivTelefono;
    Switch schFavoritos;
    ImageView ivFavorito;
    RadioButton rbEmpresa;
    RadioButton rbParticular;
    RadioGroup rgSexo;
    RadioButton rbHombre;
    RadioButton rbMujer;
    SeekBar skbLlamar;
    CheckBox cbRecordarLLamar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_contacto);

        btOk = findViewById(R.id.btOk);
        btCancel = findViewById(R.id.btCancel);
        etTelefono = findViewById(R.id.etTelefono);
        tvNombre = findViewById(R.id.tvNombre);
        tvApellidos = findViewById(R.id.tvApellidos);
        tvEmpresa = findViewById(R.id.tvEmpresa);
        schFavoritos = findViewById(R.id.schFavoritos);
        ivFavorito = findViewById(R.id.ivFavorito);
        ivHombre = findViewById(R.id.ivHombre);
        ivTelefono = findViewById(R.id.ivTelefono);
        rgEmpresa = findViewById(R.id.rgEmpresa);
        rgSexo = findViewById(R.id.rgSexo);
        rbEmpresa = findViewById(R.id.rbEmpresa);
        rbParticular = findViewById(R.id.rbParticular);
        rbHombre = findViewById(R.id.rbHombre);
        rbMujer = findViewById(R.id.rbMujer);
        ivEmpresa = findViewById(R.id.ivEmpresa);
        ivParticular = findViewById(R.id.ivParticular);
        skbLlamar = findViewById(R.id.skbLlamar);
        tvEdad = findViewById(R.id.tvEdad);
        cbRecordarLLamar = findViewById(R.id.cbRecordarLLamar);
        ivMujer = findViewById(R.id.ivMujer);


        findViewById(R.id.btOk).setOnClickListener(this);
        findViewById(R.id.btCancel).setOnClickListener(this);
        findViewById(R.id.tvNombre).setOnClickListener(this);
        findViewById(R.id.etTelefono).setOnClickListener(this);
        findViewById(R.id.tvApellidos).setOnClickListener(this);
        findViewById(R.id.tvEmpresa).setOnClickListener(this);
        findViewById(R.id.tvEdad).setOnClickListener(this);
        findViewById(R.id.schFavoritos).setOnClickListener(this);
        findViewById(R.id.ivMujer).setOnClickListener(this);
        findViewById(R.id.ivFavorito).setOnClickListener(this);
        findViewById(R.id.ivHombre).setOnClickListener(this);
        findViewById(R.id.ivTelefono).setOnClickListener(this);
        findViewById(R.id.rgEmpresa).setOnClickListener(this);
        findViewById(R.id.rgSexo).setOnClickListener(this);
        findViewById(R.id.rbEmpresa).setOnClickListener(this);
        findViewById(R.id.rbParticular).setOnClickListener(this);
        findViewById(R.id.rbHombre).setOnClickListener(this);
        findViewById(R.id.rbMujer).setOnClickListener(this);
        findViewById(R.id.ivEmpresa).setOnClickListener(this);
        findViewById(R.id.ivParticular).setOnClickListener(this);
        findViewById(R.id.skbLlamar).setOnClickListener(this);
        findViewById(R.id.cbRecordarLLamar).setOnClickListener(this);

        //BotonOK
        /*btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityNuevoContacto.this, MainActivity.class);
                //Con el intentextra enviamos el contenido de los textview al activity main junto con el telefono
                intent.putExtra("NOMBRE", tvNombre.getText().toString());
                intent.putExtra("APELLIDOS", tvApellidos.getText().toString());
                intent.putExtra("TELEFONO", etTelefono.getText().toString());
                //empieza la actividad
                startActivity(intent);
            }
        });
        //Declaramos el boton con el metodo onclicklistener
        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View f) {
                //Si se pulsa se cierra la actividad
                finish();
            }
        });*/

        //Declaramos el radiogroup con el metodo checkedchangelistener para elegir entre una imagen
        rgEmpresa.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rbEmpresa: //si se presiona el boton aparece la imagen
                        ivEmpresa.setImageDrawable(getResources().getDrawable(R.drawable.empresa));
                    break;
                    case R.id.rbParticular: //si se presiona la imagen aparece la imagen
                        ivParticular.setImageDrawable(getResources().getDrawable(R.drawable.contacto));
                    break;
                }
            }
            });

            
        //Declaramos el radiogroup con el metodo checkedchangelistener para elegir entre una imagen u otra
        rgSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int e){
                switch (e){
                    case R.id.rbMujer: // si se presiona el boton aparece la imagen
                        ivMujer.setImageDrawable(getResources().getDrawable(R.drawable.simbolomujer));
                        break;
                    case R.id.rbHombre: //si se presiona el boton aparece la imagen.
                        ivHombre.setImageDrawable(getResources().getDrawable(R.drawable.simbolohombre));
                        break;
                }
            }
        });
            //Boton favorito
        schFavoritos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    //si seleccionamos el boton se hace visible
                    ivFavorito.setVisibility(View.VISIBLE);
                }
                else {
                    //se hace invisable si lo dejamos de seleccionar
                    ivFavorito.setVisibility(View.INVISIBLE);
                }
            }
        });
        //Boton recordar llamar
        cbRecordarLLamar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean c) {
                if (c){
                    //lo hace visible si lo seleccionamos
                    ivTelefono.setVisibility(View.VISIBLE);
                }
                else{
                    //lo oculta si dejamos de seleccionarlo
                    ivTelefono.setVisibility(View.INVISIBLE);
                }
            }
        });
        //declaramos una variable para acceder al recurso
        int edadMax = getResources().getInteger(R.integer.maximaedad);
        //valor inicial
        skbLlamar.setProgress(edadMax/2);
        //valor final
        skbLlamar.setMax(edadMax);
        //definimos el listener del seekbar para cambiar el textview
        skbLlamar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tvEdad.setText(String.valueOf(i));
            }
            //llama cuando se toca la barra
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            //llama cuando se detiene la barra
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }


    @Override
    public void onClick(View view) {

        Intent e;
        //creamos el intent para llamar a la actividad StartActivityResult
        e = new Intent(this,StartActivityForResult.class);
        switch (view.getId()) {
            //enviamos tanto el nombre, apellidos y empresa
            case R.id.tvNombre:
                //llamamos a la actividad, a la espera de recibir el resultado
                e.putExtra(StartActivityForResult.EXTRA_DATOS,tvNombre.getText().toString());
                //enviamos el resultado
                startActivityForResult(e,OPTION_REQUEST_NOMBRE);
                break;
            case R.id.tvApellidos:
                e.putExtra(StartActivityForResult.EXTRA_DATOS,tvApellidos.getText().toString());
                startActivityForResult(e,OPTION_REQUEST_APELLIDOS);
                break;
            case R.id.tvEmpresa:
                e.putExtra(StartActivityForResult.EXTRA_DATOS,tvEmpresa.getText().toString());
                startActivityForResult(e,OPTION_REQUEST_EMPRESA);
                break;

            case R.id.btOk:
                if(tvApellidos.getText().length()!=0 || tvNombre.getText().length()!=0){
                    Intent f = new Intent();

                    if(tvNombre.getText() != getResources().getString(R.string.nombre) && tvApellidos.getText() != getResources().getString(R.string.apellidos)){
                        f.putExtra(EXTRA_NUEVOS_DATOS, (tvNombre.getText().toString()+ " " + tvApellidos.getText().toString() + " " + etTelefono.getText().toString()));
                        setResult(RESULT_OK, f);

                        finish();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Introduce un nombre y apellido, por favor", Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            case R.id.btCancel:
                finish();
                break;
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //Comprobamos si el resultado no es canceled
        if (resultCode != RESULT_CANCELED){
            //recogemos el resultado de la segunda actividad
            String resultado = data.getStringExtra(StartActivityForResult.EXTRA_DATOS_RESULTADO);

            switch (requestCode){
                case OPTION_REQUEST_NOMBRE:
                    tvNombre.setText(resultado);
                    break;
                case OPTION_REQUEST_APELLIDOS:
                    tvApellidos.setText(resultado);
                    break;
                case OPTION_REQUEST_EMPRESA:
                    tvEmpresa.setText(resultado);
                    break;
            }
        }
    }

}