package com.covid.aman.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.covid.aman.R
import com.covid.aman.data.model.DistrictData
import com.covid.aman.data.model.StateData
import com.covid.aman.databinding.LayoutCovidParentBinding

class CovidParentAdapter(
    private val list: List<StateData>
) : RecyclerView.Adapter<CovidParentAdapter.CovidParentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CovidParentViewHolder {
        return CovidParentViewHolder(
            DataBindingUtil.bind<LayoutCovidParentBinding>(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.layout_covid_parent, parent, false
                )
            ) as LayoutCovidParentBinding
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CovidParentViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class CovidParentViewHolder(private val viewBinding: LayoutCovidParentBinding)
        : RecyclerView.ViewHolder(viewBinding.root) {

        private var adapter: CovidChildAdapter? = null

        fun bind(data: StateData) {
            viewBinding.data = data
            adapter = CovidChildAdapter(data.districtData ?: mutableListOf())
            viewBinding.rvCovidChild.adapter = adapter
        }
    }
}