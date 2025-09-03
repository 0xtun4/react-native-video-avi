package com.brentvatnefork.react

import com.brentvatnefork.exoplayer.DefaultReactExoplayerConfig
import com.brentvatnefork.exoplayer.ReactExoplayerConfig
import com.brentvatnefork.exoplayer.ReactExoplayerViewManager
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.JavaScriptModule
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager

class ReactVideoPackage(private val config: ReactExoplayerConfig? = null) : ReactPackage {

    override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> =
        listOf(
            VideoDecoderInfoModule(reactContext),
            VideoManagerModule(reactContext)
        )

    // Deprecated RN 0.47
    fun createJSModules(): List<Class<out JavaScriptModule>> = emptyList()

    override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
        val effectiveConfig = config ?: DefaultReactExoplayerConfig(reactContext)
        return listOf(ReactExoplayerViewManager(effectiveConfig))
    }
}
