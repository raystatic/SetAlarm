package com.example.rahul.setalarm.adapters;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.rahul.setalarm.R;

import java.util.List;

/**
 * Created by rahul on 21/6/18.
 */

public class MusicListAdapter extends RecyclerView.Adapter<MusicListAdapter.MusicViewHolder>{

    Context context;
    List<String> musicNames;
    List<MediaPlayer> mediaPlayers;

    public MusicListAdapter(Context context, List<String> musicNames, List<MediaPlayer> mediaPlayers) {
        this.context = context;
        this.musicNames = musicNames;
        this.mediaPlayers = mediaPlayers;
    }

    @Override
    public MusicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.music_list_adapter_layout,parent,false);

        return new MusicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MusicViewHolder holder, final int position) {

        holder.musicName.setText(musicNames.get(position));
        holder.play.setImageResource(R.drawable.ic_action_play);
        holder.play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayers.get(position).isPlaying())
                {
                    mediaPlayers.get(position).stop();
                    holder.play.setImageResource(R.drawable.ic_action_play);
                }
                else
                {
                    mediaPlayers.get(position).start();
                    holder.play.setImageResource(R.drawable.ic_action_pause);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return musicNames.size();
    }

    public class MusicViewHolder extends RecyclerView.ViewHolder
    {
        TextView musicName;
        ImageButton play;
        public MusicViewHolder(View itemView) {
            super(itemView);

            musicName=itemView.findViewById(R.id.music_name);
            play=itemView.findViewById(R.id.playbtn);

        }
    }

}
