package com.accenture.atc.pepper.injection.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import com.accenture.atc.pepper.data.DataManager;
import com.accenture.atc.pepper.injection.ApplicationContext;
import com.accenture.atc.pepper.injection.module.AppModule;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    @ApplicationContext
    Context context();

    Application application();

    DataManager apiManager();
}
