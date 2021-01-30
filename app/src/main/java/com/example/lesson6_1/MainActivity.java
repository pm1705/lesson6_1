package com.example.lesson6_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6;
    EditText e1,e2,e3;
    ImageView i1,i2,i3;
    int sum1,sum2,sum3,num1,num2,num3,num4,score;
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();

        t1 = (TextView)findViewById(R.id.t1);
        t2 = (TextView)findViewById(R.id.t2);
        t3 = (TextView)findViewById(R.id.t3);
        t4 = (TextView)findViewById(R.id.t4);
        t5 = (TextView)findViewById(R.id.t5);
        t6 = (TextView)findViewById(R.id.t6);

        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        e3 = (EditText) findViewById(R.id.e3);

        i1 = (ImageView) findViewById(R.id.i1);
        i2 = (ImageView) findViewById(R.id.i2);
        i3 = (ImageView) findViewById(R.id.i3);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);

        t3.setVisibility(View.INVISIBLE);
        t4.setVisibility(View.INVISIBLE);
        t5.setVisibility(View.INVISIBLE);
        t6.setVisibility(View.INVISIBLE);



        num1 = rand.nextInt(90)+10;
        num2 = rand.nextInt(90)+10;
        sum1=num1+num2;
        num3 = rand.nextInt(90)+10;
        sum2=sum1+num3;
        num4 = rand.nextInt(90)+10;
        sum3=sum2+num4;
        t1.setText(""+num1);
        t2.setText(""+num2);
        t3.setText(""+sum1);
        t4.setText(""+num3);
        t5.setText(""+sum2);
        t6.setText(""+num4);
    }

    public void click1(View view) {
        String k = e1.getText().toString();
        int answer = Integer.parseInt(k);
        if (answer == sum1) {
            i1.setImageResource(R.drawable.happy);
            score++;
        }
        else {
            i1.setImageResource(R.drawable.sad);
        }
        t3.setVisibility(View.VISIBLE);
        t4.setVisibility(View.VISIBLE);
        e1.setVisibility(View.INVISIBLE);
        b1.setVisibility(View.INVISIBLE);
    }

    public void click2(View view) {
        String k = e2.getText().toString();
        int answer = Integer.parseInt(k);
        if (answer == sum2) {
            i2.setImageResource(R.drawable.happy);
            score++;
        }
        else {
            i2.setImageResource(R.drawable.sad);
        }
        t5.setVisibility(View.VISIBLE);
        t6.setVisibility(View.VISIBLE);
        e2.setVisibility(View.INVISIBLE);
        b2.setVisibility(View.INVISIBLE);
    }

    public void click3(View view) {
        String k = e3.getText().toString();
        int answer = Integer.parseInt(k);
        if (answer == sum3) {
            i3.setImageResource(R.drawable.happy);
            score++;
        }
        else {
            i3.setImageResource(R.drawable.sad);
        }
        t5.setVisibility(View.VISIBLE);
        t6.setVisibility(View.VISIBLE);
        e3.setVisibility(View.INVISIBLE);
        b3.setVisibility(View.INVISIBLE);
        Toast.makeText(this, "your final is "+score+"/3", Toast.LENGTH_LONG).show();
    }

    public void new_round(View view) {
        score=0;

        Random rand = new Random();
        num1 = rand.nextInt(90)+10;
        num2 = rand.nextInt(90)+10;
        sum1=num1+num2;
        num3 = rand.nextInt(90)+10;
        sum2=sum1+num3;
        num4 = rand.nextInt(90)+10;
        sum3=sum2+num4;
        t1.setText(""+num1);
        t2.setText(""+num2);
        t3.setText(""+sum1);
        t4.setText(""+num3);
        t5.setText(""+sum2);
        t6.setText(""+num4);

        t3.setVisibility(View.INVISIBLE);
        t4.setVisibility(View.INVISIBLE);
        t5.setVisibility(View.INVISIBLE);
        t6.setVisibility(View.INVISIBLE);
        e1.setVisibility(View.VISIBLE);
        b1.setVisibility(View.VISIBLE);
        e2.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
        e3.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);

        i1.setImageResource(0);
        i2.setImageResource(0);
        i3.setImageResource(0);

        e1.setText("");
        e2.setText("");
        e3.setText("");
    }
}