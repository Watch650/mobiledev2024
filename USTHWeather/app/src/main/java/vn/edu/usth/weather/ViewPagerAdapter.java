package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import vn.edu.usth.weather.fragments.HCMWeatherAndForecastFragment;
import vn.edu.usth.weather.fragments.HanoiWeatherAndForecastFragment;
import vn.edu.usth.weather.fragments.ParisWeatherAndForecastFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    private String titles[] = new String[] {"PARIS, FRANCE", "HANOI, VIETNAM", "HO CHI MINH CITY, VIETNAM"};

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
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
        }
        return new ParisWeatherAndForecastFragment();
    }

    @Override
    public int getItemCount() {
        return titles.length;       // return number of pages fot ViewPager
    }

}
