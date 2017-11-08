package com.yuan.service;

import com.yuan.entity.api_mp3.api_song;
import com.yuan.entity.api_wmp3.w_mp3;

import java.util.List;

public interface apiService {
    public List<api_song> getSongs(String sousuo, String seach_type)throws Exception;

    public w_mp3 find_GQ_xinxi(int gq_id) throws Exception;
}
