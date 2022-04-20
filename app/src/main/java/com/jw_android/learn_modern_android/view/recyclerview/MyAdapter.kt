package com.jw_android.learn_modern_android.view.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jw_android.learn_modern_android.databinding.RecylcerviewLayoutBinding

class MyAdapter(private val listData : MutableList<Memo>) : RecyclerView.Adapter<MyAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = RecylcerviewLayoutBinding.inflate(LayoutInflater.from(parent.context) , parent , false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val data = listData[position]
        holder.binding.item1.text = data.title
//        holder.setMemo(data)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    inner class Holder(val binding: RecylcerviewLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun setMemo(memo : Memo) {
            binding.item1.text = memo.title
        }
    }
}

