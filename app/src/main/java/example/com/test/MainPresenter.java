package example.com.test;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import java.lang.ref.WeakReference;

/**
 * Created by cdhillon on 6/13/18.
 */

public class MainPresenter {

    WeakReference<AppCompatActivity> activityWeakReference;

    public MainPresenter(MainActivity mainActivity) {
        activityWeakReference = new WeakReference<AppCompatActivity>(mainActivity);
    }

    public void onResume() {
        showHomeFragment();
    }

    public void showHomeFragment() {
        Fragment fragment = new HomeFragment();
        showFragment(fragment, HomeFragment.TAG, "Home");
    }

    public void showNotificationFragment() {
        Fragment fragment = new NotificationFragment();
        showFragment(fragment, NotificationFragment.TAG, "Notifications");
    }

    private void showFragment(Fragment fragment, String tag, String title) {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_main, fragment, tag)
                    .addToBackStack(null)
                    .setBreadCrumbShortTitle(title)
                    .commit();
        }
    }

    FragmentManager getFragmentManager() {
        if (activityWeakReference.get() != null) {
            return activityWeakReference.get().getSupportFragmentManager();
        }
        return null;
    }
}
