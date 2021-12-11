package com.fadhil.tugas_final_android.UI.DetailFish

import android.os.Build
import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.fadhil.tugas_final_android.Model.DataFishItem
import com.fadhil.tugas_final_android.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_detail_fish.*

class DetailFishFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_fish, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Picasso.get()
            .load(selectedFish!!.Species_Illustration_Photo.src)
            .placeholder(R.color.white)
            .into(detailThumb)

        detailName.text  = selectedFish!!.Species_Name
        getStringFromHtml(detailHabitat, selectedFish!!.Habitat)
        getStringFromHtml(detailDesc, selectedFish!!.Physical_Description)
        getStringFromHtml(detailLocation, selectedFish!!.Location)
        getStringFromHtml(detailPopulation, selectedFish!!.Population_Status)

    }

    private fun getStringFromHtml(view: TextView, txt: String) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            view.text = Html.fromHtml(txt, Html.FROM_HTML_MODE_LEGACY)
        } else {
            view.text = Html.fromHtml(txt)
        }
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) = DetailFishFragment()
        var selectedFish : DataFishItem? = null
    }
}