package com.fadhil.tugas_final_android.UI.ListFish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.fadhil.tugas_final_android.Model.DataFishItem
import com.fadhil.tugas_final_android.R
import kotlinx.android.synthetic.main.fragment_lish_fish.*
import kotlinx.coroutines.launch

class LishFishFragment : Fragment() {

    private lateinit var viewModel: LishFishViewModel
    private lateinit var adapter: FishAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        viewModel = ViewModelProvider(this)[LishFishViewModel::class.java]
        return inflater.inflate(R.layout.fragment_lish_fish, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = FishAdapter(object : FishAdapter.Listener {
            override fun onItemClick(fish: DataFishItem) {
                TODO("Not yet implemented")
            }
        })

        rcView_list_fish.setHasFixedSize(true)
        rcView_list_fish.layoutManager = LinearLayoutManager(requireContext())
        rcView_list_fish.adapter = adapter

        lifecycleScope.launch {
            viewModel.getListFish(adapter)
        }

    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) = LishFishFragment()
    }
}