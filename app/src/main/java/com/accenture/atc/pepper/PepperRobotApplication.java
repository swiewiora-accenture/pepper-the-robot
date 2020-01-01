package com.accenture.atc.pepper;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;
import com.singhajit.sherlock.core.Sherlock;
import com.squareup.leakcanary.LeakCanary;
import com.tspoon.traceur.Traceur;

import com.accenture.atc.pepper.injection.component.AppComponent;
import com.accenture.atc.pepper.injection.component.DaggerAppComponent;
import com.accenture.atc.pepper.injection.module.AppModule;
import com.accenture.atc.pepper.injection.module.NetworkModule;
import timber.log.Timber;

public class PepperRobotApplication extends Application {

    private AppComponent appComponent;

    public static PepperRobotApplication get(Context context) {
        return (PepperRobotApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
            Stetho.initializeWithDefaults(this);
            LeakCanary.install(this);
            Sherlock.init(this);
            Traceur.enableLogging();
        }
    }

    public AppComponent getComponent() {
        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder()
                    .networkModule(new NetworkModule(this, BuildConfig.POKEAPI_API_URL))
                    .appModule(new AppModule(this))
                    .build();
        }
        return appComponent;
    }

    // Needed to replace the component with a test specific one
    public void setComponent(AppComponent appComponent) {
        this.appComponent = appComponent;
    }
}
