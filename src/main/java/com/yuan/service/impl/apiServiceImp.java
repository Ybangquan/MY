package com.yuan.service.impl;

import com.yuan.entity.api_mp3.api_song;
import com.yuan.entity.api_wmp3.w_mp3;
import com.yuan.service.apiService;
import com.yuan.utils.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class apiServiceImp implements apiService{
    @Autowired
    public api api;

    @Override
    public List<api_song> getSongs(String sousuo,String seach_type) throws Exception {
        return api.sousuo(sousuo,seach_type);
    }

    //查歌曲信息
    public w_mp3 find_GQ_xinxi(int gq_id) throws Exception{
        return api.getGeQuXinXi_ByGeQuId(gq_id);
    }
}
