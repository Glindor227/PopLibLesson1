package com.geekbrains.popliblesson1.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.geekbrains.popliblesson1.R;
import com.geekbrains.popliblesson1.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainView{

    Button button;
    TextView resultText;
    EditText oneWord;
    MainPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);
        initUserView();
    }

    private void initUserView() {
        oneWord = findViewById(R.id.tv_one_word);
        resultText = findViewById(R.id.tv_result_text);
        button = findViewById(R.id.textOperation);

        button.setOnClickListener(view -> presenter.addTest(oneWord.getText().toString()));
    }

    @Override
    public void setResultText(String string) {
        resultText.setText(string);
    }
}
