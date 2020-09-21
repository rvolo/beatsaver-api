package com.beatsaver.api.models;


import com.fasterxml.jackson.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "metadata",
        "stats",
        "description",
        "deletedAt",
        "_id",
        "key",
        "name",
        "uploader",
        "hash",
        "uploaded",
        "directDownload",
        "downloadURL",
        "coverURL"
})
public class BeatsaverTrack {

    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("stats")
    private Stats stats;
    @JsonProperty("description")
    private String description;
    @JsonProperty("deletedAt")
    private Date deletedAt;
    @JsonProperty("_id")
    private String id;
    @JsonProperty("key")
    private String key;
    @JsonProperty("name")
    private String name;
    @JsonProperty("uploader")
    private Uploader uploader;
    @JsonProperty("hash")
    private String hash;
    @JsonProperty("uploaded")
    private Date uploaded;
    @JsonProperty("directDownload")
    private String directDownload;
    @JsonProperty("downloadURL")
    private String downloadURL;
    @JsonProperty("coverURL")
    private String coverURL;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @JsonProperty("stats")
    public Stats getStats() {
        return stats;
    }

    @JsonProperty("stats")
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("deletedAt")
    public Date getDeletedAt() {
        return deletedAt;
    }

    @JsonProperty("deletedAt")
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("uploader")
    public Uploader getUploader() {
        return uploader;
    }

    @JsonProperty("uploader")
    public void setUploader(Uploader uploader) {
        this.uploader = uploader;
    }

    @JsonProperty("hash")
    public String getHash() {
        return hash;
    }

    @JsonProperty("hash")
    public void setHash(String hash) {
        this.hash = hash;
    }

    @JsonProperty("uploaded")
    public Date getUploaded() {
        return uploaded;
    }

    @JsonProperty("uploaded")
    public void setUploaded(Date uploaded) {
        this.uploaded = uploaded;
    }

    @JsonProperty("directDownload")
    public String getDirectDownload() {
        return directDownload;
    }

    @JsonProperty("directDownload")
    public void setDirectDownload(String directDownload) {
        this.directDownload = directDownload;
    }

    @JsonProperty("downloadURL")
    public String getDownloadURL() {
        return downloadURL;
    }

    @JsonProperty("downloadURL")
    public void setDownloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
    }

    @JsonProperty("coverURL")
    public String getCoverURL() {
        return coverURL;
    }

    @JsonProperty("coverURL")
    public void setCoverURL(String coverURL) {
        this.coverURL = coverURL;
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
