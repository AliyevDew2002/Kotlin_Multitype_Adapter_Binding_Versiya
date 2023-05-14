package com.example.kotlin_simple_adapter.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.kotlin_multitype_adapter_binding_versiya.R
import com.example.kotlin_multitype_adapter_binding_versiya.databinding.ActivityDetailBinding
import com.example.kotlin_simple_adapter.adapter.User_Adapter
import com.example.kotlin_simple_adapter.model.User


class DetailActivity : AppCompatActivity() {

    lateinit var detailBinding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        detailBinding= ActivityDetailBinding.inflate(layoutInflater)
        val view: View =detailBinding.root
        setContentView(view)

        initViews()
    }
    fun initViews(){
        detailBinding.recyclerView.setLayoutManager(GridLayoutManager(this, 1))
        RefreshAdapter(prepareList())
    }
    fun prepareList():ArrayList<User>{
        var user:ArrayList<User> = ArrayList()

       for (i in 30 downTo   1){
           user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"+i))
       }




        return user
    }

    fun RefreshAdapter(user:ArrayList<User>){
        var adapter = User_Adapter(this, user)
        detailBinding.recyclerView.adapter=adapter
    }
}