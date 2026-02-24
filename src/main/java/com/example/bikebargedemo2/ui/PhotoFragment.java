package com.example.bikebargedemo2.ui;

import static android.os.Build.VERSION_CODES.R;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.bikebargedemo2.R;

public class PhotoFragment extends Fragment {
    public PhotoFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R, container, false);
    }
}


