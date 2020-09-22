package com.beatsaver.api;

import com.beatsaver.api.models.BeatsaverTrack;
import com.beatsaver.api.models.TracksList;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;

import java.io.IOException;
import java.io.InputStream;

public interface BeatsaverApi {
    static BeatsaverApi getInstance() {
        return new BeatsaverApiImpl();
    }

    static BeatsaverApi getInstance(String hostname, ObjectMapper mapper, OkHttpClient httpClient) {
        return new BeatsaverApiImpl(hostname, mapper, httpClient);
    }

    default TracksList search(String text) throws IOException {
        return search(text, 0);
    }

    TracksList search(String text, int page) throws IOException;

    BeatsaverTrack getByKey(String key) throws IOException;

    BeatsaverTrack getByHash(String hash) throws IOException;

    default TracksList mapsByHotRanking() throws IOException {
        return mapsByHotRanking(0);
    }

    TracksList mapsByHotRanking(int page) throws IOException;

    default TracksList mapsByRating() throws IOException {
        return mapsByRating(0);
    }

    TracksList mapsByRating(int page) throws IOException;

    default TracksList newestMaps() throws IOException {
        return newestMaps(0);
    }

    TracksList newestMaps(int page) throws IOException;

    default TracksList mapsByDownloadsRank() throws IOException {
        return mapsByDownloadsRank(0);
    }

    TracksList mapsByDownloadsRank(int page) throws IOException;

    default TracksList mapsByPlaysRank() throws IOException {
        return mapsByPlaysRank(0);
    }

    TracksList mapsByPlaysRank(int page) throws IOException;

    InputStream downloadZipByKey(String key) throws IOException;

    InputStream downloadZipByHash(String hash) throws IOException;
}
