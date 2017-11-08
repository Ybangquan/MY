package com.yuan.entity.api_mp3;

import java.util.List;

/**
 * Created by ZeiDiao on 2017/6/22.
 */

public class api_result {
    public List<api_song> songs;

    public List<api_song> getSongs() {
        return songs;
    }

    public void setSongs(List<api_song> songs) {
        this.songs = songs;
    }
}
