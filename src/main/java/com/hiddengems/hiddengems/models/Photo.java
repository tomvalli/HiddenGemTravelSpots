package com.hiddengems.hiddengems.models;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Photo extends AbstractEntity {

    @ManyToOne
    private Gem gem;

    @ManyToOne
    private User user;

    @NotNull
    private String imgPath;

    public Photo() { }

    public Gem getGem() {
        return gem;
    }

    public User getUser() {
        return user;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
