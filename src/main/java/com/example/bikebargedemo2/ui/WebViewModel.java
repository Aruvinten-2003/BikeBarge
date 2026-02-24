package com.example.bikebargedemo2.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WebViewModel extends ViewModel {
    private final MutableLiveData<String> text = new MutableLiveData<>();

    public WebViewModel() {
        text.setValue("This is Web Fragment");
    }

    public LiveData<String> getText() {
        return text;
    }
}