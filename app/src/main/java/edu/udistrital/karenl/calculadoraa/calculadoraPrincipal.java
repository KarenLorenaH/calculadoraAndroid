package edu.udistrital.karenl.calculadoraa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class calculadoraPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_principal);
    }

    public void sumar (View vista){
        EditText Numero1=(EditText) findViewById(R.id.Etiqueta1);
        EditText Numero2=(EditText) findViewById(R.id.Etiqueta2);
        TextView resultado=(TextView) findViewById(R.id.respuesta);
        int num1=Integer.parseInt(Numero1.getText().toString());
        int num2=Integer.parseInt(Numero2.getText().toString());
        int suma=num1+num2;
        resultado.setText("El resultado de la suma es:"+suma);

    }
    public void resta (View vista){
        EditText Numero1=(EditText) findViewById(R.id.Etiqueta1);
        EditText Numero2=(EditText) findViewById(R.id.Etiqueta2);
        TextView resultado=(TextView) findViewById(R.id.respuesta);
        int num1=Integer.parseInt(Numero1.getText().toString());
        int num2=Integer.parseInt(Numero2.getText().toString());
        int resta=num1-num2;
        resultado.setText("El resultado de la resta es:"+resta)
    }

}
