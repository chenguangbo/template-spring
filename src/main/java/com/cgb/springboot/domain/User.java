package com.cgb.springboot.domain;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    private Integer id;
    private String nickname;
    private String content;

    public User() {
    }

    public User(String nickname, String content) {
        this.nickname = nickname;
        this.content = content;
    }

    public User(Integer id, String nickname, String content) {
        this.id = id;
        this.nickname = nickname;
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(nickname, user.nickname) && Objects.equals(content, user.content);
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nickname='" + nickname + '\'' + ", content='" + content + '\'' + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, content);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
