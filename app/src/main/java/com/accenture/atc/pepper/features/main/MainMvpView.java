package com.accenture.atc.pepper.features.main;

import java.util.List;

import com.accenture.atc.pepper.features.base.MvpView;

public interface MainMvpView extends MvpView {

    void showPokemon(List<String> pokemon);

    void showProgress(boolean show);

    void showError(Throwable error);
}
