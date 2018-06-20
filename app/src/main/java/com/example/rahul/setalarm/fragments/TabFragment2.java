package com.example.rahul.setalarm.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rahul.setalarm.R;
import com.example.rahul.setalarm.adapters.MusicListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rahul on 17/6/18.
 */

public class TabFragment2 extends Fragment {

    RecyclerView musics;
    MusicListAdapter adapter;

    public TabFragment2() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tab2_fragment_layout,container,false);

        musics=view.findViewById(R.id.musics);

        setMusics();

        return view;
    }

    private void setMusics() {

        List<MediaPlayer> mediaPlayers=new ArrayList<>();
        mediaPlayers.add(MediaPlayer.create(getActivity(),R.raw.beep));
        mediaPlayers.add(MediaPlayer.create(getActivity(),R.raw.classic));
        mediaPlayers.add(MediaPlayer.create(getActivity(),R.raw.cobra));
        mediaPlayers.add(MediaPlayer.create(getActivity(),R.raw.cool_alarm));
        mediaPlayers.add(MediaPlayer.create(getActivity(),R.raw.cool_rock));
        mediaPlayers.add(MediaPlayer.create(getActivity(),R.raw.digital_phone));
        mediaPlayers.add(MediaPlayer.create(getActivity(),R.raw.error));
        mediaPlayers.add(MediaPlayer.create(getActivity(),R.raw.horn));
        mediaPlayers.add(MediaPlayer.create(getActivity(),R.raw.morning_beat));
        mediaPlayers.add(MediaPlayer.create(getActivity(),R.raw.ringing_clock));
        mediaPlayers.add(MediaPlayer.create(getActivity(),R.raw.rock));
        mediaPlayers.add(MediaPlayer.create(getActivity(),R.raw.rocky));
        mediaPlayers.add(MediaPlayer.create(getActivity(),R.raw.slow));
        mediaPlayers.add(MediaPlayer.create(getActivity(),R.raw.twin_bell));
        mediaPlayers.add(MediaPlayer.create(getActivity(),R.raw.upbeat));
    //    mediaPlayers.add(MediaPlayer.create(getActivity(),R.raw.wake_up));
        mediaPlayers.add(MediaPlayer.create(getActivity(),R.raw.warn));

        List<String> musicNames=new ArrayList<>();
        musicNames.add("Beep");
        musicNames.add("Classic");
        musicNames.add("Cobra");
        musicNames.add("Cool Alarm");
        musicNames.add("Cool Rock");
        musicNames.add("Digital Phone");
        musicNames.add("Error");
        musicNames.add("Horn");
        musicNames.add("Morning Beat");
        musicNames.add("Ringing Clock");
        musicNames.add("Rock");
        musicNames.add("Rocky");
        musicNames.add("Slow");
        musicNames.add("Twin Bell");
        musicNames.add("Upbeat");
    //    musicNames.add("Wake Up");
        musicNames.add("Warn");

        adapter=new MusicListAdapter(getActivity(),musicNames,mediaPlayers);
        musics.setAdapter(adapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        musics.setLayoutManager(layoutManager);

    }


}
