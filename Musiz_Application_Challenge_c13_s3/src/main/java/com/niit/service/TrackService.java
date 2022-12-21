package com.niit.service;

import com.niit.domain.Track;

import java.util.List;

public interface TrackService {
    Track saveTrack(Track track);

    boolean deleteTrack(int trackid);

    List<Track> fetchAllTrack();

    List<Track> findByTrackartist1(String trackartist);

    List<Track> getTrackname2(String trackname);

    List<Track> findByTrackname1(String trackname);

    List<Track> findByTrackrating1(String trackrating);

    List<Track> getAllTrackRatingGreaterThan4();
}
