/*
 * Author Name: Deepak Vishwkarma
 * Date: 24-11-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.service;

import com.niit.domain.Track;
import com.niit.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackServiceImpl implements TrackService {
    private TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public Track saveTrack(Track track) {
        return trackRepository.save(track);
    }

    @Override
    public boolean deleteTrack(int trackid) {
        trackRepository.deleteById(trackid);
        return true;
    }

    @Override
    public List<Track> fetchAllTrack() {
        return (List<Track>) trackRepository.findAll();
    }

    @Override
    public List<Track> findByTrackname1(String trackname) {

        return trackRepository.findByTrackname(trackname);
    }

    @Override
    public List<Track> findByTrackrating1(String trackrating) {
        return trackRepository.findByTrackrating(trackrating);
    }

    @Override
    public List<Track> findByTrackartist1(String trackartist) {
        return trackRepository.findByTrackartist(trackartist);
    }

    @Override
    public List<Track> getTrackname2(String trackname) {
        return trackRepository.findAllTrackArtistName(trackname);
    }

    @Override
    public List<Track> getAllTrackRatingGreaterThan4() {

        return trackRepository.findAllTracksFromRatingGreaterThan4();
    }
}
