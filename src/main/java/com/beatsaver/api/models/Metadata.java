package com.beatsaver.api.models;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "difficulties",
        "duration",
        "automapper",
        "characteristics",
        "levelAuthorName",
        "songAuthorName",
        "songName",
        "songSubName",
        "bpm"
})
public class Metadata {
    @JsonProperty("difficulties")
    private Difficulties difficulties;
    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("automapper")
    private Object automapper;
    @JsonProperty("characteristics")
    private List<Characteristic> characteristics = null;
    @JsonProperty("levelAuthorName")
    private String levelAuthorName;
    @JsonProperty("songAuthorName")
    private String songAuthorName;
    @JsonProperty("songName")
    private String songName;
    @JsonProperty("songSubName")
    private String songSubName;
    @JsonProperty("bpm")
    private Integer bpm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("difficulties")
    public Difficulties getDifficulties() {
        return difficulties;
    }

    @JsonProperty("difficulties")
    public void setDifficulties(Difficulties difficulties) {
        this.difficulties = difficulties;
    }

    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @JsonProperty("automapper")
    public Object getAutomapper() {
        return automapper;
    }

    @JsonProperty("automapper")
    public void setAutomapper(Object automapper) {
        this.automapper = automapper;
    }

    @JsonProperty("characteristics")
    public List<Characteristic> getCharacteristics() {
        return characteristics;
    }

    @JsonProperty("characteristics")
    public void setCharacteristics(List<Characteristic> characteristics) {
        this.characteristics = characteristics;
    }

    @JsonProperty("levelAuthorName")
    public String getLevelAuthorName() {
        return levelAuthorName;
    }

    @JsonProperty("levelAuthorName")
    public void setLevelAuthorName(String levelAuthorName) {
        this.levelAuthorName = levelAuthorName;
    }

    @JsonProperty("songAuthorName")
    public String getSongAuthorName() {
        return songAuthorName;
    }

    @JsonProperty("songAuthorName")
    public void setSongAuthorName(String songAuthorName) {
        this.songAuthorName = songAuthorName;
    }

    @JsonProperty("songName")
    public String getSongName() {
        return songName;
    }

    @JsonProperty("songName")
    public void setSongName(String songName) {
        this.songName = songName;
    }

    @JsonProperty("songSubName")
    public String getSongSubName() {
        return songSubName;
    }

    @JsonProperty("songSubName")
    public void setSongSubName(String songSubName) {
        this.songSubName = songSubName;
    }

    @JsonProperty("bpm")
    public Integer getBpm() {
        return bpm;
    }

    @JsonProperty("bpm")
    public void setBpm(Integer bpm) {
        this.bpm = bpm;
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
