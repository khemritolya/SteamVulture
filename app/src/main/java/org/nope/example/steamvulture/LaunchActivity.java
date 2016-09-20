package org.nope.example.steamvulture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Print a hello message
        print("Steam Vulture Active!");

    }

    private void print(Object in) {
        Log.d("MSG",in.toString());
    }
}
