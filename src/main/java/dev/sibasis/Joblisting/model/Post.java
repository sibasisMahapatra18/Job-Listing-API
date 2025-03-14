package dev.sibasis.Joblisting.model;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="JobPosting")
public class Post {
       
    private String profile;
    private String desc;
    private int exp;
    private String techs[];
    public String getProfile() {
        return profile;
    }
    public String getDesc() {
        return desc;
    }
    @Override
    public String toString() {
        return "Post [profile=" + profile + ", desc=" + desc + ", exp=" + exp + ", techs=" + Arrays.toString(techs)
                + "]";
    }
    public Post() {
       
    }
    public int getExp() {
        return exp;
    }
    public String[] getTechs() {
        return techs;
    }
    public void setProfile(String profile) {
        this.profile = profile;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }
    public void setTechs(String[] techs) {
        this.techs = techs;
    }















}
