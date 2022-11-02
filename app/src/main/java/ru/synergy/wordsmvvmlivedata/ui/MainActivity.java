package ru.synergy.wordsmvvmlivedata.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.synergy.wordsmvvmlivedata.R;
import ru.synergy.wordsmvvmlivedata.domain.WordViewModel;

public class MainActivity extends AppCompatActivity {

    public static final int NEW_WORD_ACTIVITY_REQUEST_CODE = 1;

    public WordViewModel mWordViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}