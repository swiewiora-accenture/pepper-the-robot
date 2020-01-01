package com.accenture.atc.pepper.injection.component;

import dagger.Subcomponent;
import com.accenture.atc.pepper.injection.PerFragment;
import com.accenture.atc.pepper.injection.module.FragmentModule;

/**
 * This component inject dependencies to all Fragments across the application
 */
@PerFragment
@Subcomponent(modules = FragmentModule.class)
public interface FragmentComponent {
}
