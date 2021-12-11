package com.fadhil.tugas_final_android.UI.ListFish

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fadhil.tugas_final_android.Model.DataFishItem
import com.fadhil.tugas_final_android.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_fish.view.*

class FishAdapter(private val listener: FishAdapter.Listener): RecyclerView.Adapter<FishAdapter.Holder>() {

    interface Listener {
        fun onItemClick(fish: DataFishItem)
    }

    private var listFish = mutableListOf<DataFishItem>()

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(fish: DataFishItem, listener: Listener) {
            with(itemView) {
                Picasso.get()
                    .load(fish.Species_Illustration_Photo.src)
                    .into(fishThumb)

                fishName.text = fish.Species_Name
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_fish, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(listFish[position], listener)
    }

    override fun getItemCount(): Int {
        return listFish.size
    }


}