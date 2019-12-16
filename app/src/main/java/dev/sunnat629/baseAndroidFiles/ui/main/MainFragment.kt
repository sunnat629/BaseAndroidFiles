package dev.sunnat629.baseAndroidFiles.ui.main

import android.os.Bundle
import dev.sunnat629.baseAndroidFiles.R
import dev.sunnat629.baseAndroidFiles.ui.base.BaseFragment

class MainFragment : BaseFragment<MainViewModel>(){

    override val layoutResId: Int = R.layout.fragment_main

    override val screenName: String? = MainFragment::class.java.simpleName

    override fun getViewModel(): Class<MainViewModel> = MainViewModel::class.java

    override fun onInitialize(instance: Bundle?, viewModel: MainViewModel) {
        initToolbar()
        initUI()
        initButtons()
        initObservers()
    }

    override fun initToolbar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initUI() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initButtons() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initObservers() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}