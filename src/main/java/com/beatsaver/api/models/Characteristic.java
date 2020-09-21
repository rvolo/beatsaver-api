package com.beatsaver.api.models;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "difficulties",
        "name"
})
public class Characteristic {

    @JsonProperty("difficulties")
    private DifficultyList difficulties;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("difficulties")
    public DifficultyList getDifficulties() {
        return difficulties;
    }

    @JsonProperty("difficulties")
    public void setDifficulties(DifficultyList difficulties) {
        this.difficulties = difficulties;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
