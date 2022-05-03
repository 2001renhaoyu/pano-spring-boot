package com.example.panospringboot.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 郝欣然
 * @since 2022-05-03
 */
public class Framework_qjmy implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer user_id;

    private String user_name;

    private String view_name;

    private Integer view_id;


    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getView_name() {
        return view_name;
    }

    public void setView_name(String view_name) {
        this.view_name = view_name;
    }

    public Integer getView_id() {
        return view_id;
    }

    public void setView_id(Integer view_id) {
        this.view_id = view_id;
    }

    @Override
    public String toString() {
        return "Framework_qjmy{" +
        "user_id=" + user_id +
        ", user_name=" + user_name +
        ", view_name=" + view_name +
        ", view_id=" + view_id +
        "}";
    }
}
