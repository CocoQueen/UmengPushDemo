package com.example.umengpushdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.umeng.message.PushAgent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //日活统计
        PushAgent.getInstance(this).onAppStart()
    }
}
