package com.beatsaver.api.models;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "duration",
        "length",
        "njs",
        "njsOffset",
        "bombs",
        "notes",
        "obstacles"
})
public class Difficulty {

    @JsonProperty("duration")
    private Double duration;
    @JsonProperty("length")
    private Integer length;
    @JsonProperty("njs")
    private Integer njs;
    @JsonProperty("njsOffset")
    private Double njsOffset;
    @JsonProperty("bombs")
    private Integer bombs;
    @JsonProperty("notes")
    private Integer notes;
    @JsonProperty("obstacles")
    private Integer obstacles;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("duration")
    public Double getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    @JsonProperty("length")
    public Integer getLength() {
        return length;
    }

    @JsonProperty("length")
    public void setLength(Integer length) {
        this.length = length;
    }

    @JsonProperty("njs")
    public Integer getNjs() {
        return njs;
    }

    @JsonProperty("njs")
    public void setNjs(Integer njs) {
        this.njs = njs;
    }

    @JsonProperty("njsOffset")
    public Double getNjsOffset() {
        return njsOffset;
    }

    @JsonProperty("njsOffset")
    public void setNjsOffset(Double njsOffset) {
        this.njsOffset = njsOffset;
    }

    @JsonProperty("bombs")
    public Integer getBombs() {
        return bombs;
    }

    @JsonProperty("bombs")
    public void setBombs(Integer bombs) {
        this.bombs = bombs;
    }

    @JsonProperty("notes")
    public Integer getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(Integer notes) {
        this.notes = notes;
    }

    @JsonProperty("obstacles")
    public Integer getObstacles() {
        return obstacles;
    }

    @JsonProperty("obstacles")
    public void setObstacles(Integer obstacles) {
        this.obstacles = obstacles;
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
