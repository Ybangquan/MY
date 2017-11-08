package com.yuan.utils;
/**
 * 
 * @author Ybangquan
 *
 */

import com.google.gson.reflect.TypeToken;
import com.yuan.entity.api_mp3.api_mp3;
import com.yuan.entity.api_mp3.api_song;
import com.yuan.entity.api_wmp3.a_w_mp3;
import com.yuan.entity.api_wmp3.w_mp3;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;

@Component
public class api{
	//根据歌曲 id 查询歌曲信息
	public w_mp3 getGeQuXinXi_ByGeQuId(int gq_id) throws Exception{
		String URL_SOUSUOGQ="https://api.imjad.cn/cloudmusic/?id=";
		String json = getJson.readJsonFromUrl(URL_SOUSUOGQ+gq_id).toString();
		a_w_mp3 a_w_mp3=GosnUtils.fromJson(json, new TypeToken<a_w_mp3>() {});
		w_mp3 w_mp3=new w_mp3();
		w_mp3=a_w_mp3.getData().get(0);
		return w_mp3;
	}


	//搜索
	public List<api_song> sousuo(String sousuo,String search_type) throws Exception{
		String url_sousuo="https://api.imjad.cn/cloudmusic/?type=search&s=";
		if(StringUtils.isEmpty(sousuo)){
			url_sousuo=url_sousuo+"薛之谦";
		}else{
			url_sousuo=url_sousuo+sousuo;
		}
		System.out.println(url_sousuo);
		String json = getJson.readJsonFromUrl(url_sousuo).toString();
		api_mp3 api_mp3=GosnUtils.fromJson(json, new TypeToken<api_mp3>() {});
		List<api_song> songs=api_mp3.getResult().getSongs();
		System.out.println(songs.size());
		return songs;
	}
}
