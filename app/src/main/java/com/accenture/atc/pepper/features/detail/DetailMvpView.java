package com.accenture.atc.pepper.features.detail;

import com.accenture.atc.pepper.data.model.response.Pokemon;
import com.accenture.atc.pepper.data.model.response.Statistic;
import com.accenture.atc.pepper.features.base.MvpView;

public interface DetailMvpView extends MvpView {

    void showPokemon(Pokemon pokemon);

    void showStat(Statistic statistic);

    void showProgress(boolean show);

    void showError(Throwable error);
}
