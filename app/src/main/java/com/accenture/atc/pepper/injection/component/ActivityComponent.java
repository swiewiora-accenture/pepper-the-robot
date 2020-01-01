package com.accenture.atc.pepper.injection.component;

import dagger.Subcomponent;
import com.accenture.atc.pepper.features.detail.DetailActivity;
import com.accenture.atc.pepper.features.main.MainActivity;
import com.accenture.atc.pepper.injection.PerActivity;
import com.accenture.atc.pepper.injection.module.ActivityModule;

@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

    void inject(DetailActivity detailActivity);
}
