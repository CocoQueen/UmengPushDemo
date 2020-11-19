package com.example.umengpushdemo

import android.app.Application
import android.util.Log
import com.umeng.commonsdk.UMConfigure
import com.umeng.message.IUmengRegisterCallback
import com.umeng.message.PushAgent

/**
 *@Author Coco
 *@ClassName MyApplication
 *@Date 2020/11/19 13:38
 *@Description TODO
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        //初始化友盟推送
        UMConfigure.init(
            this,
            "5fb6036073749c24fd9cb380",
            "Umeng",
            UMConfigure.DEVICE_TYPE_PHONE,
            "f191bd7c7563d4ba325798a15019fba2"
        )
        val pushAgent = PushAgent.getInstance(this)
        //注册推送服务
        pushAgent.register(listener)
    }

    private val listener = object : IUmengRegisterCallback {
        override fun onSuccess(p0: String?) {
            Log.e("================", p0)
        }

        override fun onFailure(p0: String?, p1: String?) {
            Log.e("================", p0 + p1)
        }

    }
}