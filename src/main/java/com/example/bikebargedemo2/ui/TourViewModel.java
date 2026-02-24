package com.example.bikebargedemo2.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TourViewModel extends ViewModel {
    private final MutableLiveData<String> text = new MutableLiveData<>();

    public TourViewModel() {
        text.setValue("This is Tour Fragment");
    }

    public LiveData<String> getText() {
        return text;
    }
}