package com.yuan.action;

import com.yuan.entity.api_mp3.api_song;
import com.yuan.entity.api_wmp3.w_mp3;
import com.yuan.service.apiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@Controller
public class apiAction {
   @Autowired
   public  apiService apiService;
   @RequestMapping("/apisousuo")
   @ResponseBody
   public List<com.yuan.entity.api_mp3.api_song> getSousuo(String sousuo,String type) throws Exception {
      System.out.println(sousuo);
      return  apiService.getSongs(sousuo,type);
   }


   @RequestMapping("/get_gequ")
   @ResponseBody
   public w_mp3 get_gequ(int gq_id) {
      w_mp3 mp3=null;
      try {
         mp3 = apiService.find_GQ_xinxi(gq_id);
      } catch (Exception e) {

      }
      return mp3;
   }
}
