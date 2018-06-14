package example.com.test;

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

public class NotificationFragment extends Fragment implements View.OnClickListener {
    public static final String TAG = "NotificationFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.notification_fragment, container, false);
        view.findViewById(R.id.button1).setOnClickListener(this);
        view.findViewById(R.id.button2).setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                addNotification();
                break;

            case R.id.button2:
                removeNotification();
                break;

            default:
                Log.w(TAG, "not sure what was clicked!!!");
        }

    }

    private void addNotification() {

    }


    private void removeNotification() {

    }
}
