package com.example.age;

import static java.util.Calendar.getInstance;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edit_enter;
    TextView txtview,txtage;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_enter=(EditText) findViewById(R.id.edit_enter);
        txtage=(TextView) findViewById(R.id.txtage);
        txtview =(TextView) findViewById(R.id.txtview);
        button =(Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                String userDOB= edit_enter.getText().toString().trim();
                String Year = getInstance().getCalendarType();
                int year = 0;
                if (userDOB.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please enter year",Toast.LENGTH_SHORT).show();

                }
                else if (userDOB.compareTo(String.valueOf(year))>0)
                {
                    Toast.makeText(MainActivity.this,"Age should be less than year",Toast.LENGTH_SHORT).show();
                }
                else {
                    int myage =year - Integer.parseInt(userDOB);
                    txtage.setText("Your age is"+myage+"year");
                }

            }

        });

    }
}