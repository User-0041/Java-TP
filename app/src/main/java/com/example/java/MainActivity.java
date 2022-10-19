package com.example.java;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox chkAndro;
    CheckBox chkMicro;
    Button btnAffich;
    RadioGroup radSpecialityType;
    RadioButton radDSI;
    RadioButton radRSI;
    RadioButton radSEM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkAndro = (CheckBox) findViewById(R.id.chkAndro);
        chkMicro = (CheckBox) findViewById(R.id.chkMicro);
        btnAffich = (Button) findViewById(R.id.btnAffich);
        radSpecialityType = (RadioGroup) findViewById(R.id.radSpecialityType);
        radDSI = (RadioButton) findViewById(R.id.radDSI);
        radRSI = (RadioButton) findViewById(R.id.radRSI);
        radSEM = (RadioButton) findViewById(R.id.radSEM);
        btnAffich.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "Spécialité ";
                String option="club ";
                if (chkAndro.isChecked())  msg = option + "Androide " ;
                if (chkMicro.isChecked())  msg =  msg + "Microsft  " ;
                int radioId = radSpecialityType.getCheckedRadioButtonId();
                if (radSEM.getId() == radioId)
                    msg = msg +  "Spécialité SEM" ;
                if (radRSI.isChecked())
                    msg = msg + "Spécialité RSI" ;

                if (radDSI.isChecked())
                    msg =msg + "Spécialité DSI" ;
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
            }
        });
    }
}