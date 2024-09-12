package vn.edu.usth.weather;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    private String[] titles = new String[]{"PARIS, FRANCE", "HANOI, VIETNAM","HO CHI MINH CITY, VIETNAM"};

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ParisWeatherAndForecastFragment();
            case 1:
                return new HanoiWeatherAndForecastFragment();
            case 2:
                return new HCMWeatherAndForecastFragment();
            default:
                return new ParisWeatherAndForecastFragment();
        }
    }

}
