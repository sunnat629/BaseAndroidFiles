package dev.sunnat629.baseAndroidFiles.ui.main

import android.os.Bundle
import dev.sunnat629.baseAndroidFiles.R
import dev.sunnat629.baseAndroidFiles.ui.base.BaseActivity

class MainActivity : BaseActivity<MainViewModel>() {

    override val layoutResId: Int = R.layout.activity_main

    override val screenName: String? = MainActivity::class.java.simpleName

    override fun getViewModel(): Class<MainViewModel> = MainViewModel::class.java

    override fun onInitialize(instance: Bundle?, viewModel: MainViewModel) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}