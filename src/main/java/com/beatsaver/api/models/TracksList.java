package com.beatsaver.api.models;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "docs",
        "totalDocs",
        "lastPage",
        "prevPage",
        "nextPage"
})
public class TracksList {

    @JsonProperty("docs")
    private List<BeatsaverTrack> docs = null;
    @JsonProperty("totalDocs")
    private Integer totalDocs;
    @JsonProperty("lastPage")
    private Integer lastPage;
    @JsonProperty("prevPage")
    private Object prevPage;
    @JsonProperty("nextPage")
    private Integer nextPage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("docs")
    public List<BeatsaverTrack> getBeatsaverTracks() {
        return docs;
    }

    @JsonProperty("docs")
    public void setBeatsaverTracks(List<BeatsaverTrack> docs) {
        this.docs = docs;
    }

    @JsonProperty("totalDocs")
    public Integer getTotalDocs() {
        return totalDocs;
    }

    @JsonProperty("totalDocs")
    public void setTotalDocs(Integer totalDocs) {
        this.totalDocs = totalDocs;
    }

    @JsonProperty("lastPage")
    public Integer getLastPage() {
        return lastPage;
    }

    @JsonProperty("lastPage")
    public void setLastPage(Integer lastPage) {
        this.lastPage = lastPage;
    }

    @JsonProperty("prevPage")
    public Object getPrevPage() {
        return prevPage;
    }

    @JsonProperty("prevPage")
    public void setPrevPage(Object prevPage) {
        this.prevPage = prevPage;
    }

    @JsonProperty("nextPage")
    public Integer getNextPage() {
        return nextPage;
    }

    @JsonProperty("nextPage")
    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
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