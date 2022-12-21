/*
 * Author Name: Deepak Vishwkarma
 * Date: 24-11-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.domain;

public class Artist {
    private int artistid;
    private String artistname;

    public Artist() {
    }

    public Artist(int artistid, String artistname) {
        this.artistid = artistid;
        this.artistname = artistname;
    }

    public int getArtistid() {
        return artistid;
    }

    public void setArtistid(int artistid) {
        this.artistid = artistid;
    }

    public String getArtistname() {
        return artistname;
    }

    public void setArtistname(String artistname) {
        this.artistname = artistname;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistid=" + artistid +
                ", artistname='" + artistname + '\'' +
                '}';
    }
}
