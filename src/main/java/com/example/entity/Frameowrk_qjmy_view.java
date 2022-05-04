package com.example.entity;

import java.sql.Blob;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 郝星然
 * @since 2022-05-04
 */
public class Frameowrk_qjmy_view implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer view_id;

    private String view_name;

    private Blob view_image;


    public Integer getView_id() {
        return view_id;
    }

    public void setView_id(Integer view_id) {
        this.view_id = view_id;
    }

    public String getView_name() {
        return view_name;
    }

    public void setView_name(String view_name) {
        this.view_name = view_name;
    }

    public Blob getView_image() {
        return view_image;
    }

    public void setView_image(Blob view_image) {
        this.view_image = view_image;
    }

    @Override
    public String toString() {
        return "Frameowrk_qjmy_view{" +
        "view_id=" + view_id +
        ", view_name=" + view_name +
        ", view_image=" + view_image +
        "}";
    }
}
