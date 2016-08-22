package com.example.juniver.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i = 1;

    int prueba = 1;

    int b1 = 10;
    int b2 = 12;
    int b3 = 33;
    int b4 = 4;
    int b5 = 5;
    int b6 = 6;
    int b7 = 7;
    int b8 = 8;
    int b9 = 9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtCambiado = (TextView)findViewById(R.id.textView1);
        txtCambiado.setText("JUGADOR 1");

        Button button = (Button) findViewById(R.id.button10);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartActivity(MainActivity.this);
            }
        });
    }

    public void comprobar(){
        if  ((b1==b2)&&(b1==b3)) {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("GANADOR JUGADOR " + b1);
            prueba = 0;
        }
        if  ((b4==b5)&&(b4==b6)) {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("GANADOR JUGADOR " + b4);
            prueba = 0;
        }
        if  ((b7==b8)&&(b7==b9)) {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("GANADOR JUGADOR " + b7);
            prueba = 0;
        }
        if  ((b1==b4)&&(b1==b7)) {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("GANADOR JUGADOR " + b1);
            prueba = 0;
        }
        if  ((b2==b5)&&(b2==b8)) {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("GANADOR JUGADOR " + b2);
            prueba = 0;
        }
        if  ((b3==b6)&&(b3==b9)) {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("GANADOR JUGADOR " + b3);
            prueba = 0;
        }
        if  ((b1==b5)&&(b1==b9)) {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("GANADOR JUGADOR " + b1);
            prueba = 0;
        }
        if  ((b3==b5)&&(b3==b7)) {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("GANADOR JUGADOR " + b3);
            prueba = 0;
        }

        if (prueba == 0){
            Button button = (Button) findViewById(R.id.button);
            Button button2 = (Button) findViewById(R.id.button2);
            Button button3 = (Button) findViewById(R.id.button3);
            Button button4 = (Button) findViewById(R.id.button4);
            Button button5 = (Button) findViewById(R.id.button5);
            Button button6 = (Button) findViewById(R.id.button6);
            Button button7 = (Button) findViewById(R.id.button7);
            Button button8 = (Button) findViewById(R.id.button8);
            Button button9 = (Button) findViewById(R.id.button9);
            button.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }

        if ((i == 10)&& (prueba == 1)){
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("NADIE GANÓ :( ");
        }
    }

    public void cambiarMensaje(View v){
        i += 1;
        if ((i % 2)== 0) {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("JUGADOR 2");
            Button button = (Button) findViewById(R.id.button);
            button.setText("X");
            button.setEnabled(false);
            b1 = 1;
        } else{
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("JUGADOR 1");
            Button button = (Button) findViewById(R.id.button);
            button.setText("O");
            button.setEnabled(false);
            b1 = 2;
        }
        comprobar();
    }

    public void cambiarMensaje2(View v) {
        i += 1;
        if ((i % 2) == 0) {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("JUGADOR 2");
            Button button2 = (Button) findViewById(R.id.button2);
            button2.setText("X");
            button2.setEnabled(false);
            b2 = 1;
        } else {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("JUGADOR 1");
            Button button2 = (Button) findViewById(R.id.button2);
            button2.setText("O");
            button2.setEnabled(false);
            b2 = 2;
        }
        comprobar();
    }

    public void cambiarMensaje3(View v) {
        i += 1;
        if ((i % 2) == 0) {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("JUGADOR 2");
            Button button3 = (Button) findViewById(R.id.button3);
            button3.setText("X");
            button3.setEnabled(false);
            b3 = 1;
        } else {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("JUGADOR 1");
            Button button3 = (Button) findViewById(R.id.button3);
            button3.setText("O");
            button3.setEnabled(false);
            b3 = 2;
        }
        comprobar();
    }

    public void cambiarMensaje4(View v) {
        i += 1;
        if ((i % 2) == 0) {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("JUGADOR 2");
            Button button4 = (Button) findViewById(R.id.button4);
            button4.setText("X");
            button4.setEnabled(false);
            b4 = 1;
        } else {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("JUGADOR 1");
            Button button4 = (Button) findViewById(R.id.button4);
            button4.setText("O");
            button4.setEnabled(false);
            b4 = 2;
        }
        comprobar();
    }

    public void cambiarMensaje5(View v) {
        i += 1;
        if ((i % 2) == 0) {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("JUGADOR 2");
            Button button5 = (Button) findViewById(R.id.button5);
            button5.setText("X");
            button5.setEnabled(false);
            b5 = 1;
        } else {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("JUGADOR 1");
            Button button5 = (Button) findViewById(R.id.button5);
            button5.setText("O");
            button5.setEnabled(false);
            b5 = 2;
        }
        comprobar();
    }

    public void cambiarMensaje6(View v) {
        i += 1;
        if ((i % 2) == 0) {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("JUGADOR 2");
            Button button6 = (Button) findViewById(R.id.button6);
            button6.setText("X");
            button6.setEnabled(false);
            b6 = 1;
        } else {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("JUGADOR 1");
            Button button6 = (Button) findViewById(R.id.button6);
            button6.setText("O");
            button6.setEnabled(false);
            b6 = 2;
        }
        comprobar();
    }

    public void cambiarMensaje7(View v) {
        i += 1;
        if ((i % 2) == 0) {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("JUGADOR 2");
            Button button7 = (Button) findViewById(R.id.button7);
            button7.setText("X");
            button7.setEnabled(false);
            b7 = 1;
        } else {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("JUGADOR 1");
            Button button7 = (Button) findViewById(R.id.button7);
            button7.setText("O");
            button7.setEnabled(false);
            b7 = 2;
        }
        comprobar();
    }

    public void cambiarMensaje8(View v) {
        i += 1;
        if ((i % 2) == 0) {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("JUGADOR 2");
            Button button8 = (Button) findViewById(R.id.button8);
            button8.setText("X");
            button8.setEnabled(false);
            b8 = 1;
        } else {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("JUGADOR 1");
            Button button8 = (Button) findViewById(R.id.button8);
            button8.setText("O");
            button8.setEnabled(false);
            b8 = 2;
        }
        comprobar();
    }

    public void cambiarMensaje9(View v) {
        i += 1;
        if ((i % 2) == 0) {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("JUGADOR 2");
            Button button9 = (Button) findViewById(R.id.button9);
            button9.setText("X");
            button9.setEnabled(false);
            b9 = 1;
        } else {
            TextView txtCambiado = (TextView)findViewById(R.id.textView1);
            txtCambiado.setText("JUGADOR 1");
            Button button9 = (Button) findViewById(R.id.button9);
            button9.setText("O");
            button9.setEnabled(false);
            b9 = 2;
        }
        comprobar();
    }

    public void restartActivity(Activity activity) {
        if (Build.VERSION.SDK_INT >= 11) {
            activity.recreate();
        } else {
            activity.finish();
            activity.startActivity(getIntent());
        }
    }

}
