package com.geekbrains.popliblesson1.presenter;

import com.geekbrains.popliblesson1.model.MainModel;
import com.geekbrains.popliblesson1.view.MainView;

import moxy.MvpPresenter;

public class MainPresenter extends MvpPresenter<MainView> {
    private MainModel model;


    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        model = new MainModel();
    }

    private String myLogic(String str1, String str2){
        return str1.concat(str2); // наращиваемая логика
    }

    public void addTest(String newText){
        String resultText = myLogic(model.getText(),newText);

        model.setText(resultText);
        getViewState().setResultText(resultText);
    }
}
