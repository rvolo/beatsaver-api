package com.beatsaver.api.models;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "downloads",
        "plays",
        "downVotes",
        "upVotes",
        "heat",
        "rating"
})
public class Stats {

    @JsonProperty("downloads")
    private Integer downloads;
    @JsonProperty("plays")
    private Integer plays;
    @JsonProperty("downVotes")
    private Integer downVotes;
    @JsonProperty("upVotes")
    private Integer upVotes;
    @JsonProperty("heat")
    private Double heat;
    @JsonProperty("rating")
    private Double rating;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("downloads")
    public Integer getDownloads() {
        return downloads;
    }

    @JsonProperty("downloads")
    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    @JsonProperty("plays")
    public Integer getPlays() {
        return plays;
    }

    @JsonProperty("plays")
    public void setPlays(Integer plays) {
        this.plays = plays;
    }

    @JsonProperty("downVotes")
    public Integer getDownVotes() {
        return downVotes;
    }

    @JsonProperty("downVotes")
    public void setDownVotes(Integer downVotes) {
        this.downVotes = downVotes;
    }

    @JsonProperty("upVotes")
    public Integer getUpVotes() {
        return upVotes;
    }

    @JsonProperty("upVotes")
    public void setUpVotes(Integer upVotes) {
        this.upVotes = upVotes;
    }

    @JsonProperty("heat")
    public Double getHeat() {
        return heat;
    }

    @JsonProperty("heat")
    public void setHeat(Double heat) {
        this.heat = heat;
    }

    @JsonProperty("rating")
    public Double getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(Double rating) {
        this.rating = rating;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
