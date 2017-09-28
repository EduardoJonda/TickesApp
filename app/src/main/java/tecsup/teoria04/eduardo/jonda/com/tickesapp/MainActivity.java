package tecsup.teoria04.eduardo.jonda.com.tickesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    User us1 = new User("user","1234");
    User admi1 = new User("admi","1234");
    User tec1 = new User("tec1","1234");

    EditText txtuser, txtpass;
    Button btninit ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btninit = (Button) findViewById(R.id.btnInicioSession);
        txtuser = (EditText) findViewById(R.id.txtname);
        txtpass = (EditText) findViewById(R.id.txtpaass);
    }

    public void Validation(View view){
        String usuario = txtuser.getText().toString();
        String password = txtpass.getText().toString();

        if(usuario.isEmpty() || password.isEmpty()){
            Toast.makeText(this, "Complete los campus para ingresar", Toast.LENGTH_SHORT).show();
            return;
        }

        if(usuario.equals(us1.getUsername()) || password.equals(password.equals(us1.getPassward()))){

            Intent intent1 = new Intent(this,MainActivityUser.class);
            startActivity(intent1);

        } if(usuario.equals(admi1.getUsername()) || password.equals(password.equals(admi1.getPassward()))){

            Intent intent1 = new Intent(this,MainActivityAdmi.class);
           startActivity(intent1);

        }if(usuario.equals(tec1.getUsername()) || password.equals(password.equals(tec1.getPassward()))){

            Intent intent2 = new Intent(this,MainActivityTecn.class);
            startActivity(intent2);

        }else{
            Toast.makeText(this,"Nombre de usuario o contraseña invalido", Toast.LENGTH_LONG).show();
        }

    }

}
