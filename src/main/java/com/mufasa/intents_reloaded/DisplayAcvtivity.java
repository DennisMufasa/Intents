package com.mufasa.intents_reloaded;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static com.mufasa.intents_reloaded.MainActivity.Extra_Name;

public class DisplayAcvtivity extends AppCompatActivity {
    //declaring variables from actity_main.xml


    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_acvtivity);
        //connects to the intent initialized in activity_main.xml
        Intent intent = getIntent();

        String Display = intent.getStringExtra(MainActivity.Extra_Name);

        TextView display=(TextView) findViewById(R.id.txtDisplay);
        display.setText("Hello " + Display + ". Please enter your password below.");

        button= (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editText=(EditText)findViewById(R.id.txtPassword);
                String pass = editText.getText().toString();

                if (pass.equals("dennis")) {
                    Toast.makeText(DisplayAcvtivity.this, "Login Successful", Toast.LENGTH_SHORT).show();

                    showImage();


                } else {
                    Toast.makeText(DisplayAcvtivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }




    public void showImage(){
        Intent intent= new Intent(getApplicationContext(),ImageDisplay.class);
        startActivity(intent);

    }
}
