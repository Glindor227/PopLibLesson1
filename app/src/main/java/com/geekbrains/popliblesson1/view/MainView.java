package com.geekbrains.popliblesson1.view;

import moxy.MvpView;
import moxy.viewstate.strategy.alias.AddToEndSingle;

public interface MainView extends MvpView {
    @AddToEndSingle
    void setResultText(String string);
}
