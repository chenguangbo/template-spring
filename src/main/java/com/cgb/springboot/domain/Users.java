package com.cgb.springboot.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Users {

    private int id;
    private String name;
    private String nickname;
    private String content;
    private String head_img_url;
    private int status_id;
    private int enabled_id;
    private String description;

}
