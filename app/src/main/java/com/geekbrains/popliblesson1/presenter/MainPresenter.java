package com.geekbrains.popliblesson1.presenter;

import com.geekbrains.popliblesson1.model.MainModel;
import com.geekbrains.popliblesson1.view.MainView;

public class MainPresenter{
    private MainModel model;
    private MainView view;

    public MainPresenter(MainView view) {
        this.view = view;
        model = new MainModel();
    }

    private String myLogic(String str1, String str2){
        return str1.concat(str2); // наращиваемая логика
    }

    public void addTest(String newText){
        String resultText = myLogic(model.getText(),newText);

        model.setText(resultText);
        view.setResultText(resultText);
    }
}
