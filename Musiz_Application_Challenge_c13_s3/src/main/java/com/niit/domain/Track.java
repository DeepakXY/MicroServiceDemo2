/*
 * Author Name: Deepak Vishwkarma
 * Date: 24-11-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document

public class Track {
    @Id
    private int trackid;
    private String trackname;
    private String trackrating;
    private String trackartist;
    private Artist artist;

    public Track() {
    }

    public Track(int trackid, String trackname, String trackrating, String trackartist, Artist artist) {
        this.trackid = trackid;
        this.trackname = trackname;
        this.trackrating = trackrating;
        this.trackartist = trackartist;
        this.artist = artist;
    }

    public int getTrackid() {
        return trackid;
    }

    public void setTrackid(int trackid) {
        this.trackid = trackid;
    }

    public String getTrackname() {
        return trackname;
    }

    public void setTrackname(String trackname) {
        this.trackname = trackname;
    }

    public String getTrackrating() {
        return trackrating;
    }

    public void setTrackrating(String trackrating) {
        this.trackrating = trackrating;
    }

    public String getTrackartist() {
        return trackartist;
    }

    public void setTrackartist(String trackartist) {
        this.trackartist = trackartist;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Track{" +
                "trackid=" + trackid +
                ", trackname='" + trackname + '\'' +
                ", trackrating='" + trackrating + '\'' +
                ", trackartist='" + trackartist + '\'' +
                ", artist=" + artist +
                '}';
    }
}