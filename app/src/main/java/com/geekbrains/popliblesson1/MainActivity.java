package com.geekbrains.popliblesson1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView resultText;
    EditText oneWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUserView();
    }

    private void initUserView() {
        oneWord = findViewById(R.id.tv_one_word);
        resultText = findViewById(R.id.tv_result_text);
        button = findViewById(R.id.textOperation);
        button.setOnClickListener(view -> {
            String oldText = resultText.getText().toString();
            resultText.setText(oldText.concat(oneWord.getText().toString()));
        });
    }
}
