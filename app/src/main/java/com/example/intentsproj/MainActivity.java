package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        public void showTost(View v){
            switch (v.getId()){
                case R.id.button_tost:
                    Context context = getApplicationContext(); //The context to
                    use. Usually your Application or Activity object
                    CharSequence message = "You just clicked the OK button";
                    //Display string
                    int duration = Toast.LENGTH_SHORT; //How long the toast
                    //message will lasts
                    Toast toast = Toast.makeText(context, message, duration);
                    toast.show();
                    Toasty.error(context:this,message )
            }
        }


        @Override
        protected void onCreate(Bundle savedInstanceState)
        { super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //Creating the LayoutInflater instance
            LayoutInflater li = getLayoutInflater();
            //Getting the View object as defined in the customtoast.xml file
            View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                    findViewById(R.id.custom_toast_layout));
            //Creating the Toast object
            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setView(layout);//setting the view of custom toast layout
            toast.show();
        }

    }
}