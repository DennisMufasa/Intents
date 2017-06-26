package com.mufasa.intents_reloaded;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//declaring variables from actity_main.xml
    EditText name;
    Button Send;
    //
public static final String Extra_Name="com.mufasa.intents_reloaded";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name =(EditText) findViewById(R.id.txtName);
        Send=(Button)findViewById(R.id.btnSend);

        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getMessage();
            }
        });

    }

    public void getMessage(){
        Intent intent= new Intent(this, DisplayAcvtivity.class);
        String Name=name.getText().toString();
        if (Name.equals("Dennis")){
            intent.putExtra(Extra_Name, Name );
            startActivity(intent);
        }else   {
            Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
        }



    }

}
