package com.example.hw_6_6;

public class MusicAbaiViewAdapter {

    class MusicViewAdapter( var musicList: ArrayList<Music>,  val onItemClick:(position:Int) -> Unit ):
            RecyclerView.Adapter<MusicAbaiViewAdapter.MusicAbaiHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicHolder {
            return MusicAbaiHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context),parent,false))
        }

        override fun onBindViewHolder(holder: MusicHolder, position: Int) {
            holder.bind(musicList[position])
        }

        override fun getItemCount(): Int{
            return musicList.size
        }

        inner class MusicHolder(private var binding: ItemMusicBinding) : ViewHolder(binding.root) {
            fun bind(music: Music){

                binding.apply {
                    tvAbaiMusic.text=music.nameMusic
                    tvAbaiAvtor.text=music.nameAvtor
                    tvTimeMusic.text=music.timeMusic

                }
                itemView.setOnClickListener {
                    onItemClick(adapterPosition)
                }

            }
        }
    }

}
