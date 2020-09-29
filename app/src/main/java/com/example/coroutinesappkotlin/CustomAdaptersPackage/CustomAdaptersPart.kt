package com.example.coroutinesappkotlin.CustomAdaptersPackage

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.coroutinesappkotlin.ModelPackage.Results
import com.example.coroutinesappkotlin.R
import kotlinx.android.synthetic.main.adapter_part.view.*

class CustomAdaptersPart(private var partItemList: List<Results>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.adapter_part, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(partItemList[position])
    }

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(part: Results) {
            itemView.title.text = "Title: " + part.title
            itemView.overview.text = "Overview: " + part.overview
        }
    }

    override fun getItemCount() = partItemList.size

}
