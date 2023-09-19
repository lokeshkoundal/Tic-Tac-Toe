package com.example.tixtaxtox;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,resetBtn,resultBtn;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int flag = 0 ;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    reset2();

                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(), "An Exception occured ", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
    public void check(View view) throws Exception{


        Button currentBtn = (Button) view;

        if(currentBtn.getText().toString().equals("")){
        counter++;

        if (flag == 0) {
            currentBtn.setText("X");
            flag = 1;
        }else{
            currentBtn.setText("O");
            flag = 0;
        }

        if(counter > 4) {
            b1 = btn1.getText().toString();
            b2 = btn2.getText().toString();
            b3 = btn3.getText().toString();
            b4 = btn4.getText().toString();
            b5 = btn5.getText().toString();
            b6 = btn6.getText().toString();
            b7 = btn7.getText().toString();
            b8 = btn8.getText().toString();
            b9 = btn9.getText().toString();

            if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                setter("The winner is "+b1);

                Toast.makeText(getApplicationContext(), "The Winner is " + b1, Toast.LENGTH_LONG).show();

                reset();

            } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                setter("The winner is "+b4);

                Toast.makeText(getApplicationContext(), "The Winner is " + b4, Toast.LENGTH_LONG).show();

                reset();


            } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                setter("The winner is "+b7);

                Toast.makeText(getApplicationContext(), "The Winner is " + b7, Toast.LENGTH_LONG).show();
                reset();


            } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                setter("The winner is "+b1);
                Toast.makeText(getApplicationContext(), "The Winner is " + b1, Toast.LENGTH_LONG).show();
                reset();

            } else if (b2.equals(b5) && b5.equals(b8) && !b4.equals("")) {
                setter("The winner is "+b2);

                Toast.makeText(getApplicationContext(), "The Winner is " + b2, Toast.LENGTH_LONG).show();
                reset();

            } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                setter("The winner is "+b3);

                Toast.makeText(getApplicationContext(), "The Winner is " + b3, Toast.LENGTH_LONG).show();
                reset();

            } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                setter("The winner is "+b1);

                Toast.makeText(getApplicationContext(), "The Winner is " + b1, Toast.LENGTH_LONG).show();
                reset();

            } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                setter("The winner is "+b3);

                Toast.makeText(getApplicationContext(), "The Winner is " + b3, Toast.LENGTH_LONG).show();
                reset();

            } else if(counter == 9 ){
                setter("The game is drawn");
                Toast.makeText(getApplicationContext(), "THE GAME IS TIED", Toast.LENGTH_LONG).show();
                reset();
            }
        }
        }
    }


    private void init(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        resultBtn = findViewById(R.id.result);
        resetBtn = findViewById(R.id.rest);


    }
    private void reset()throws Exception{
        Thread.sleep(1000);
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        counter = 0;
        flag = 0;
    }
    public void reset2(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        counter = 0;
        flag = 0;
    }

    private void setter(String s){
        resultBtn.setText(s);
    }
}
