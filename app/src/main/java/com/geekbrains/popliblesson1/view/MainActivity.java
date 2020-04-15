package com.geekbrains.popliblesson1.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.geekbrains.popliblesson1.R;
import com.geekbrains.popliblesson1.presenter.MainPresenter;

import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;

public class MainActivity extends MvpAppCompatActivity implements MainView{

    private TextView resultText;

    @InjectPresenter
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUserView();
    }

    private void initUserView() {
        EditText oneWord = findViewById(R.id.tv_one_word);
        resultText = findViewById(R.id.tv_result_text);
        Button button = findViewById(R.id.textOperation);

        button.setOnClickListener(view -> presenter.addTest(oneWord.getText().toString()));
    }

    @Override
    public void setResultText(String string) {
        resultText.setText(string);
    }
}
