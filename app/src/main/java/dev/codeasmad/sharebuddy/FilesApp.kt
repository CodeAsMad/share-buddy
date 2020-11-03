package dev.codeasmad.sharebuddy

import android.app.Application
import dev.codeasmad.logging.Logger

class FilesApp: Application() {
    override fun onCreate() {
        super.onCreate()

        Logger.Builder().build().plant()
    }
}