package com.niit.repository;

import com.niit.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends MongoRepository<Track, Integer> {
    List<Track> findByTrackname(String trackname);

    List<Track> findByTrackrating(String trackrating);

    List<Track> findByTrackartist(String trackartist);

    @Query("{'artist.artistname':{$in:[?0]}}")
        // @Query("{'product.productname':{$in:[?0]}}")
    List<Track> findAllTrackArtistName(String artistname);

    @Query("{'trackrating':{$gt:'4'}}")
    List<Track> findAllTracksFromRatingGreaterThan4();


}
