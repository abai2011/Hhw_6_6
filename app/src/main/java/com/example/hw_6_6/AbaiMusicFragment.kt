package com.example.hw_6_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AbaiMusicFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_abai_music, container, false)
    }

    private lateinit var binding: FragmentAbaiMusicBinding
    private var resultFragment:AbaiFragment = AbaiFragment()
    private  var bundle: Bundle= Bundle()
    private  var musicList= ArrayList<AbaiMusic>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding= FragmentAbaiMusicBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()
        val musicViewAdapter= MusicAbaiViewAdapter(musicList,this::onItemClick)
        binding.rvMusic.adapter=musicViewAdapter

    }
    private fun onItemClick(position:Int){
        bundle.putSerializable("txt",musicList[position])
        AbaiFragment.arguments=bundle
        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container,AbaiFragment).addToBackStack(null).commit()
    }
    private fun loadData() {
        musicList.add(AbaiMusic("Pass Out","Tinie Tempah","3:57"))
        musicList.add(AbaiMusic("We dance on","N-Dubz","3:06"))
        musicList.add(AbaiMusic("Work It Out","Lighbulb Theives","3:33"))
        musicList.add(AbaiMusic("Tiny Dancer","Ironik","3:23"))
        musicList.add(AbaiMusic("Strong Again","N-Dubz","3:14"))
        musicList.add(AbaiMusic("Live fo the moment","Pixie Lott","2:47"))
        musicList.add(AbaiMusic("Candy","Aggro Santos","3:00"))
        musicList.add(AbaiMusic("Beggin","Madcon","3:35"))
        musicList.add(AbaiMusic("Champion Sound","Fatboy Slim","2:55"))
        musicList.add(AbaiMusic("live is Beatiful","Vega4","4:34"))

    }


}
}