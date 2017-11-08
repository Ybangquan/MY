package com.yuan.utils;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Created by ZeiDiao on 2017/6/19.
 */

public class GosnUtils {
    static Gson gson=new Gson();

    public static <T> T  fromJson(String json, TypeToken tTypeToken){
        return gson.fromJson(json, tTypeToken.getType());
    }
}
