package br.com.marcossilvajnr.lotr.guide.core

import android.app.Application
import br.com.marcossilvajnr.lotr.guide.BuildConfig
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import timber.log.Timber.DebugTree


@HiltAndroidApp
class LOTRGuideApplication: Application() {

    override fun onCreate() {
        Timber.d("LOTRGuideApplication - onCreate")
        super.onCreate()
    }

    private fun setupTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        }
    }
}