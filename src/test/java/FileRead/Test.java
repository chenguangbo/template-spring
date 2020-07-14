package com.example.parse.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.example.parse.utils.JsonMapUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/ins")
public class InsertController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public static List<Map<String, Object>> read() {
//        File file = new File("C:\\Users\\zhiguofa\\Downloads\\cpc\\city.json");
//        File file = new File("C:\\Users\\zhiguofa\\Downloads\\cpc\\country.json");
        File file = new File("C:\\Users\\zhiguofa\\Downloads\\cpc\\region.json");
        List<Map<String, Object>> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            //构造一个BufferedReader类来读取文件
            String s = null;
            while ((s = br.readLine()) != null) {//使用readLine方法，一次读一行
                Map<String, Object> map = JsonMapUtil.json2map(s);
                list.add(map);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("______________________________");
        return list;
    }


    @RequestMapping(value = "/insert_region")
    public String index3() {
        List<Map<String, Object>> read = read();
        read.forEach((map) -> {

            Object region_id = map.get("id");
            Object countryId = map.get("countryId");
            Object country_iso_code = map.get("countryIsoCode");
            Object cnCode = map.get("cnCode");
            Object iso_code = map.get("isoCode");
            Object isoName = map.get("isoName");
            Object region_name = map.get("name");
            Object eng_name = map.get("nameEn");

            String sql = "INSERT INTO yd_ty_region (region_id,country_Id,country_iso_code,cn_code,iso_code,iso_name," + "region_name,eng_name)" + " VALUE " + "(?,?,?,?,?,?,?,?)";
            int update = jdbcTemplate.update(sql, region_id == null ? 0 : region_id, countryId == null ? 0 : countryId, country_iso_code == null ? "" : country_iso_code, cnCode == null ? "" : cnCode, iso_code == null ? "" : iso_code, isoName == null ? "" : isoName, region_name == null ? "" : region_name, eng_name == null ? "" : eng_name);
        });
        System.out.println("end");
        return "Hello ";
    }


    //http://localhost:8080/ins/insert_country
    @RequestMapping(value = "/insert_country")
    public String index2() {
        List<Map<String, Object>> read = read();
        read.forEach((map) -> {
            Object country_id = map.get("id");
            Object iso_code = map.get("isoCode");
            Object country_name = map.get("name");
            Object eng_name = map.get("nameEn");
            String sql = "INSERT INTO yd_ty_country (country_id,iso_code,country_name,eng_name) VALUE (?,?,?,?)";
            int update = jdbcTemplate.update(sql, country_id == null ? 0 : country_id, iso_code == null ? "" : iso_code, country_name == null ? "" : country_name, eng_name == null ? "" : eng_name);
        });
        System.out.println("end");
        return "Hello ";
    }


    // http://localhost:8080/ins/insert
    @RequestMapping(value = "/insert")
    public String index() {
        List<Map<String, Object>> read = read();
        read.forEach((map) -> {
            Object city_id = map.get("id");
            Object cn_code = map.get("cnCode");
            Object country_id = map.get("countryId");
            Object city_name = map.get("name");
            Object eng_name = map.get("nameEn");
            Object region_id = map.get("regionId");
            String sql = "INSERT INTO yd_ty_city (city_id,cn_code,country_id,city_name,eng_name,region_id) VALUE (?,?,?,?,?,?)";
            int update = jdbcTemplate.update(sql, city_id == null ? 0 : city_id, cn_code == null ? "" : cn_code, country_id == null ? 0 : country_id, city_name == null ? "" : city_name, eng_name == null ? "" : eng_name, region_id == null ? 0 : region_id);
        });
        System.out.println("end");
        return "Hello ";
    }


}
