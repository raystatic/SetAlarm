package com.example.rahul.setalarm.fragments;

import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rahul.setalarm.R;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by rahul on 17/6/18.
 */

public class TabFragment3 extends Fragment {

    public TabFragment3() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tab3_fragment_layout,container,false);

        ArrayList<HashMap<String,String>> songList=getPlaylist(Environment.getExternalStorageDirectory().getAbsolutePath());

        if (songList!=null)
        {
            for (int i=0; i<songList.size(); i++)
            {
                String filename=songList.get(i).get("file_name");
                String filePath=songList.get(i).get("file_path");

                Log.d("File details ","Name= "+filename+"\nPath= "+filePath);
            }
        }

        return view;
    }

    public ArrayList<HashMap<String, String>> getPlaylist(String rootPath)
    {
        ArrayList<HashMap<String,String>> fileList=new ArrayList<>();

        try {
            File rootFolder=new File(rootPath);
            File[] files=rootFolder.listFiles();
            for (File file: files)
            {
                if (file.isDirectory())
                {
                    if (getPlaylist(file.getAbsolutePath())!=null)
                    {
                        fileList.addAll(getPlaylist(file.getAbsolutePath()));
                    }
                    else
                    {
                        break;
                    }
                }else if (file.getName().endsWith("mp3"))
                {
                    HashMap<String,String> song=new HashMap<>();
                    song.put("file_path",file.getAbsolutePath());
                    song.put("file_name",file.getName());
                    fileList.add(song);
                }
            }
            return fileList;
        }catch (Exception e)
        {
            return null;
        }
    }

}
