package com.cgb.springboot.sdk.util;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonMapUtil {

    public static Map<String, Object> json2map(String json) {
        JSONObject jsonObject = new JSONObject(json);
        return jsonObject.toMap();
    }

    public static Map<String,Object> json2map(byte data[], Charset charset){
        String json=null;
        if(charset == null){
            json=new String(data);
        }else{
            json=new String(data,charset);
        }
        return json2map(json);
    }

    public static List<Object> json2list(String json) {
        JSONArray jsonArray = new JSONArray(json);
        return jsonArray.toList();
    }

    public static String map2json(Map<?, ?> map) {
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }

    public static String list2json(List<?> list) {
        JSONArray jsonArray = new JSONArray(list);
        return jsonArray.toString();
    }
}
