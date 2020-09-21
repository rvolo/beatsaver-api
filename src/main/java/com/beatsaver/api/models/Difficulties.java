package com.beatsaver.api.models;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "easy",
        "expert",
        "expertPlus",
        "hard",
        "normal"
})
public class Difficulties {
    @JsonProperty("easy")
    private Boolean easy;
    @JsonProperty("expert")
    private Boolean expert;
    @JsonProperty("expertPlus")
    private Boolean expertPlus;
    @JsonProperty("hard")
    private Boolean hard;
    @JsonProperty("normal")
    private Boolean normal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("easy")
    public Boolean getEasy() {
        return easy;
    }

    @JsonProperty("easy")
    public void setEasy(Boolean easy) {
        this.easy = easy;
    }

    @JsonProperty("expert")
    public Boolean getExpert() {
        return expert;
    }

    @JsonProperty("expert")
    public void setExpert(Boolean expert) {
        this.expert = expert;
    }

    @JsonProperty("expertPlus")
    public Boolean getExpertPlus() {
        return expertPlus;
    }

    @JsonProperty("expertPlus")
    public void setExpertPlus(Boolean expertPlus) {
        this.expertPlus = expertPlus;
    }

    @JsonProperty("hard")
    public Boolean getHard() {
        return hard;
    }

    @JsonProperty("hard")
    public void setHard(Boolean hard) {
        this.hard = hard;
    }

    @JsonProperty("normal")
    public Boolean getNormal() {
        return normal;
    }

    @JsonProperty("normal")
    public void setNormal(Boolean normal) {
        this.normal = normal;
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