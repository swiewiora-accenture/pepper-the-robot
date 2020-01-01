package com.accenture.atc.pepper.common.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import com.accenture.atc.pepper.common.injection.module.ApplicationTestModule;
import com.accenture.atc.pepper.injection.component.AppComponent;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends AppComponent {
}
