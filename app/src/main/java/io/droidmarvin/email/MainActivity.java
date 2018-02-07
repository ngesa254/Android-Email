package io.droidmarvin.email;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button sendEmailButton;
    EditText emailAddress;
    EditText emailSubject;
    EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //grab from layout
        emailAddress =  findViewById(R.id.email);
        emailSubject = findViewById(R.id.subject);
        message =  findViewById(R.id.message);
        sendEmailButton =  findViewById(R.id.send_button);
    }
}
