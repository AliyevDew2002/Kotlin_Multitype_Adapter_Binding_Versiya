package com.example.kotlin_simple_adapter.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_multitype_adapter_binding_versiya.databinding.MemberListQolipBinding
import com.example.kotlin_simple_adapter.model.User


class User_Adapter(private val context: Context, user: ArrayList<User>) : RecyclerView.Adapter<User_Adapter.CustomViewHolder>() {
    var binding: MemberListQolipBinding? = null
    private val user: ArrayList<User>

    init {
        this.user = user
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = MemberListQolipBinding.inflate(layoutInflater)
        return CustomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val users: User = user[position]
        if (holder is CustomViewHolder) {
            val profile = holder.binding.ivProfile
            val fullname = holder.binding.tvFullname
            profile.setImageResource(users.getProfile())
            fullname.setText(users.getfullname())
        }
    }

    override fun getItemCount(): Int {
        return user.size
    }

    inner class CustomViewHolder(val binding: MemberListQolipBinding) :
        RecyclerView.ViewHolder(binding.root)
}
