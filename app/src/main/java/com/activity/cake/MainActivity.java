package com.activity.cake;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radio1, radio2, radio3;
    RadioButton radioButton1, getRadioButton2, getGetRadioButton3;
    EditText message;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void displayToastMsg(View v) {

        message = findViewById(R.id.message);
        RadioGroup radio1 = (RadioGroup) findViewById(R.id.radioShape);
        int selectedID = radio1.getCheckedRadioButtonId();
        RadioButton radioButton1 = (RadioButton) findViewById(selectedID);

        RadioGroup radio2 = (RadioGroup) findViewById(R.id.radioFlavor);
        int selectedID2 = radio2.getCheckedRadioButtonId();
        RadioButton radioButton2 = (RadioButton) findViewById(selectedID2);

        RadioGroup radio3 = (RadioGroup) findViewById(R.id.radioTop);
        int selectedID3 = radio3.getCheckedRadioButtonId();
        RadioButton radioButton3 = (RadioButton) findViewById(selectedID3);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Your message is: "+message.getText().toString() + "\n" + "Your cake shape is: " + radioButton1.getText().toString() + "\n" + "Your cake flavor is : " + radioButton2.getText().toString() + "\n" + "Your cake topping is: " + radioButton3.getText().toString());
                alertDialogBuilder.setPositiveButton("yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                Toast.makeText(MainActivity.this,"You clicked yes button",Toast.LENGTH_LONG).show();
                            }
                        });

        alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                recreate();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}

