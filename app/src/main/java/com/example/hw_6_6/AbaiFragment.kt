package com.example.hw_6_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class AbaiFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_abai, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataFromMusicFragment=arguments?.getSerializable("txt") as AbaiMusic
        binding.apply {
            tvNameAbaiMusic.text=dataFromMusicAbaiFragment.nameMusic
            tvNameAbaiAvtor.text=dataFromMusicAbaiFragment.nameAvtor
            tvTimeAbaiMusic.text=dataFromMusicAbaiFragment.timeMusic
        }
    }

}