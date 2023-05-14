package com.example.kotlin_simple_adapter.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kotlin_multitype_adapter_binding_versiya.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var bindingMain: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingMain=ActivityMainBinding.inflate(layoutInflater)
        var view: View =bindingMain.root
        setContentView(view)

        initViews()

    }
    fun initViews(){
        bindingMain.btMain.setOnClickListener{
            openDetailActivity()
        }
    }
    fun openDetailActivity(){
       var intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }
}