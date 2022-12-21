/*
 * Author Name: Deepak Vishwkarma
 * Date: 24-11-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.controller;

import com.niit.domain.Track;
import com.niit.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class TrackController {
    private TrackService trackService;

    @Autowired
    public TrackController(@RequestBody TrackService trackService) {
        this.trackService = trackService;
    }

    @PostMapping("insertTrack")
    public ResponseEntity<?> insertTrack(@RequestBody Track track) {
        return new ResponseEntity<>(trackService.saveTrack(track), HttpStatus.CREATED);
    }

    @GetMapping("/fetchTrack")
    public ResponseEntity<?> getAllTrack() {
        return new ResponseEntity<>(trackService.fetchAllTrack(), HttpStatus.OK);
    }

    @DeleteMapping("deleteTrackRecordById/{trackid}")
    public ResponseEntity<?> deleteAlltrack(@PathVariable int trackid) {
        trackService.deleteTrack(trackid);
        return new ResponseEntity<>("track record delete", HttpStatus.OK);
    }

    @GetMapping("findTrackName/{name}")
    public ResponseEntity<?> function1(@PathVariable String name) {
        return new ResponseEntity<>(trackService.findByTrackname1(name), HttpStatus.OK);
    }

    @GetMapping("findtrackrating/{trackrating}")
    public ResponseEntity<?> function2(@PathVariable String trackrating) {
        return new ResponseEntity<>(trackService.findByTrackrating1(trackrating), HttpStatus.OK);
    }

    @GetMapping("findtrackartist/{trackartist}")
    public ResponseEntity<?> function3(@PathVariable String trackartist) {
        return new ResponseEntity<>(trackService.findByTrackartist1(trackartist), HttpStatus.OK);
    }

    @GetMapping("/findallArtistName/{artistname}")
    public ResponseEntity<?> function4(@PathVariable String artistname) {

        return new ResponseEntity<>(trackService.getTrackname2(artistname), HttpStatus.OK);
    }

    @GetMapping("/track/rating4")
    public ResponseEntity<?> getAllTrackRatingGreaterThan4() {

        return new ResponseEntity(trackService.getAllTrackRatingGreaterThan4(), HttpStatus.CREATED);

    }
}
