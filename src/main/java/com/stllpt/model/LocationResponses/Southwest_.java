
package com.stllpt.model.LocationResponses;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Southwest_ implements Serializable
{

    @SerializedName("lat")
    @Expose
    @JsonProperty
    private Double lat;
    @SerializedName("lng")
    @Expose
    @JsonProperty
    private Double lng;
    private final static long serialVersionUID = -3951775647436076678L;

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

}
