package vn.edu.usth.weather;

import static vn.edu.usth.weather.R.*;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.app.Fragment;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);
//        View v = findViewById(id.main);
        ForecastFragment frag = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.main, frag).commit();
        Log.i("Weather","Create here");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Weather","Start here");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Weather","Resume here");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Weather","Pause here");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Weather","Stop here");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Weather","Destroy here");
    }

}
