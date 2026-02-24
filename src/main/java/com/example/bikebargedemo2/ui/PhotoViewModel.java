package com.example.bikebargedemo2.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PhotoViewModel extends ViewModel {
    private final MutableLiveData<String> text = new MutableLiveData<>();

    public PhotoViewModel() {
        text.setValue("This is Photo Fragment");
    }

    public LiveData<String> getText() {
        return text;
    }
}
