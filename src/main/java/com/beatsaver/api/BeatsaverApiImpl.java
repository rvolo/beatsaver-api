package com.beatsaver.api;

import com.beatsaver.api.models.BeatsaverTrack;
import com.beatsaver.api.models.TracksList;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.io.InputStream;

class BeatsaverApiImpl implements BeatsaverApi {
    private final String hostname;
    private final ObjectMapper mapper;
    private final OkHttpClient httpClient;

    BeatsaverApiImpl() {
        this.mapper = new ObjectMapper();
        this.hostname = "https://beatsaver.com";
        this.httpClient = new OkHttpClient();
    }

    BeatsaverApiImpl(String hostname, ObjectMapper mapper, OkHttpClient httpClient) {
        this.mapper = mapper;
        this.httpClient = httpClient;
        this.hostname = hostname;
    }

    @Override
    public TracksList search(String text, int page) throws IOException {
        HttpUrl url = builder("/api/search/text")
                .addPathSegment(String.valueOf(page))
                .addQueryParameter("q", text)
                .build();

        return sendRequest(url, TracksList.class);
    }

    @Override
    public BeatsaverTrack getByKey(String key) throws IOException {
        HttpUrl url = builder("/api/maps/detail")
                .addPathSegment(key)
                .build();

        return sendRequest(url, BeatsaverTrack.class);
    }

    @Override
    public BeatsaverTrack getByHash(String hash) throws IOException {
        HttpUrl url = builder("/api/maps/by-hash")
                .addPathSegment(hash)
                .build();

        return sendRequest(url, BeatsaverTrack.class);
    }

    @Override
    public TracksList mapsByHotRanking(int page) throws IOException {
        HttpUrl url = builder("/api/maps/hot")
                .addPathSegment(String.valueOf(page))
                .build();

        return sendRequest(url, TracksList.class);
    }

    @Override
    public TracksList mapsByRating(int page) throws IOException {
        HttpUrl url = builder("/api/maps/rating")
                .addPathSegment(String.valueOf(page))
                .build();

        return sendRequest(url, TracksList.class);
    }

    @Override
    public TracksList newestMaps(int page) throws IOException {
        HttpUrl url = builder("/api/maps/latest")
                .addPathSegment(String.valueOf(page))
                .build();

        return sendRequest(url, TracksList.class);
    }

    @Override
    public TracksList mapsByDownloadsRank(int page) throws IOException {
        HttpUrl url = builder("/api/maps/downloads")
                .addPathSegment(String.valueOf(page))
                .build();

        return sendRequest(url, TracksList.class);
    }

    @Override
    public TracksList mapsByPlaysRank(int page) throws IOException {
        HttpUrl url = builder("/api/maps/plays")
                .addPathSegment(String.valueOf(page))
                .build();

        return sendRequest(url, TracksList.class);
    }

    @Override
    public InputStream downloadZipByKey(String key) throws IOException {
        Request request = new Request
                .Builder()
                .url(builder("/download/key").addPathSegment(key).build())
                .get()
                .build();

        return httpClient.newCall(request).execute().body().byteStream();
    }

    @Override
    public InputStream downloadZipByHash(String hash) throws IOException {
        Request request = new Request
                .Builder()
                .url(builder("/download/hash").addPathSegment(hash).build())
                .get()
                .build();

        return httpClient.newCall(request).execute().body().byteStream();
    }

    private HttpUrl.Builder builder(String path) {
        return HttpUrl.get(hostname).newBuilder(path);
    }

    private <T> T sendRequest(HttpUrl url, Class<T> pojo) throws IOException {
        Request request = new Request
                .Builder()
                .addHeader("Accept", "application/json")
                .addHeader("User-Agent", "Beatsaver-Api-Client")
                .url(url)
                .get()
                .build();

        return sendRequest(request, pojo);
    }

    private <T> T sendRequest(Request request, Class<T> pojo) throws IOException {
        Response response = httpClient.newCall(request).execute();

        if (response.body() == null) {
            throw new NullPointerException();
        }

        return mapper.readValue(response.body().string(), pojo);
    }
}
