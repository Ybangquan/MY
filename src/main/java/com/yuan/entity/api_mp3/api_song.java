package com.yuan.entity.api_mp3;
import java.util.List;

/**
 * Created by ZeiDiao on 2017/6/22.
 */

public class api_song {
    private int id;
    private String name;
    private List<api_aro> ar;//歌手信息
    private api_al al;//专辑

    public api_al getAl() {
        return al;
    }

    public void setAl(api_al al) {
        this.al = al;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<api_aro> getAr() {
        return ar;
    }

    public void setAr(List<api_aro> ar) {
        this.ar = ar;
    }
}

