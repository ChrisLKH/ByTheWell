package com.example.kevinc1.bythewellv1.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Location implements Serializable{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("distance")
    @Expose
    private String distance;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) { this.distance = distance; }

    public String getLatitude() { return latitude;   }

    public void setLatitude(String latitude) { this.latitude = latitude; }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) { this.longitude = longitude; }

}
