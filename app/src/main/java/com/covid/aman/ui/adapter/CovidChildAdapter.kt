package com.covid.aman.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.covid.aman.R
import com.covid.aman.data.model.CovidDataView
import com.covid.aman.databinding.LayoutCovidChildBinding

class CovidChildAdapter(
    private val list: List<CovidDataView>
) : RecyclerView.Adapter<CovidChildAdapter.CovidChildViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CovidChildViewHolder {
        return CovidChildViewHolder(
            DataBindingUtil.bind<LayoutCovidChildBinding>(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.layout_covid_child, parent, false
                )
            ) as LayoutCovidChildBinding
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CovidChildViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class CovidChildViewHolder(private val viewBinding: LayoutCovidChildBinding)
        : RecyclerView.ViewHolder(viewBinding.root) {

        fun bind(list: CovidDataView) {
            viewBinding.data = list
        }
    }
}