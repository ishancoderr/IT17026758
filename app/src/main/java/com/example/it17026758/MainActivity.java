package com.example.it17026758;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Lifecycle", "Oncreate() invoked");
        textView2 = findViewById(R.id.textview2);
        textView2.setText(R.string.Msg2);
    }

    public void onRestart()
    {
        super.onRestart();
        Log.i("Lifecycle", "onRestart() invoked" );
        }

    public void onStart()
    {

        super.onStart();
        Log.i("Lifecycle", "Oncreate() invoked" );
    }
    public void onResume()
    {

        super.onResume();
        Log.i("Lifecycle", "onResume() invoked" );
    }
    public void onPause()
    {

        super.onPause();
        Log.i("Lifecycle", "onPause() invoked" );
    }
    public void onStop()
    {

        super.onStop();
        Log.i("Lifecycle", "onStop() invoked" );
    }
    public void onDestroy()
    {

        super.onDestroy();
        Log.i("Lifecycle", "onDestroy() invoked" );
    }
}
