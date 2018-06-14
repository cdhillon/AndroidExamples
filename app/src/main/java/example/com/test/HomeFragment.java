package example.com.test;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by cdhillon on 6/13/18.
 */

public class HomeFragment extends Fragment implements View.OnClickListener {

    public static final String TAG = "HomeFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);
        view.findViewById(R.id.button1).setOnClickListener(this);
        view.findViewById(R.id.button1).setOnClickListener(this);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                showNotifications();
                break;

            case R.id.button2:
                break;

            default:
                Log.w(TAG, "not sure what was clicked!!!");

        }
    }

    private void showNotifications() {
        Activity activity = getActivity();
        if (activity instanceof  MainActivity) {
            MainPresenter mainPresenter = ((MainActivity) activity).getMainPresenter();
            mainPresenter.showNotificationFragment();
        }
    }
}
