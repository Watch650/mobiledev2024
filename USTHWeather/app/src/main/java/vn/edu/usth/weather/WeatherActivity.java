package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
//        EdgeToEdge.enable(this);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        WeatherFragment secondFragment = new WeatherFragment();
        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.main, firstFragment).commit();
//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.main, secondFragment, "second_layout")
//                .setReorderingAllowed(true)
//                .addToBackStack("main_layout").commit();
//        getSupportFragmentManager().beginTransaction().add(R.id.main, secondFragment).commit();
    }
}