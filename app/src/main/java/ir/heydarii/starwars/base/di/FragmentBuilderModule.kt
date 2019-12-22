package ir.heydarii.starwars.base.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ir.heydarii.starwars.features.searchname.SearchCharacterFragment

@Module
abstract class FragmentBuilderModule {

    @ContributesAndroidInjector
    abstract fun contributeSearchCharacterFragment(): SearchCharacterFragment
}