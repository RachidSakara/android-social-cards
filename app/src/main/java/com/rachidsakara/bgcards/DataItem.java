package com.rachidsakara.bgcards;

/**
 * Created by Touchiba-Pro on 13/10/2017.
 */

public class DataItem {
    private int avatar,image_posted;
    private String name,birth_day,description;


    public DataItem(int Avatar,int ImagePosted,String Name,String BirthDay,String Description) {
        this.avatar  = Avatar;
        this.image_posted  = ImagePosted;
        this.name = Name;
        this.birth_day = BirthDay;
        this.description = Description;
    }

    /*----------------Getters & Setters------------------------*/

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getImage_posted() {
        return image_posted;
    }

    public void setImage_posted(int image_posted) {
        this.image_posted = image_posted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth_day() {
        return birth_day;
    }

    public void setBirth_day(String birth_day) {
        this.birth_day = birth_day;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
