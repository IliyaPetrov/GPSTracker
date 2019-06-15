package org.tracker.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.tracker.main.model.Point;
import org.tracker.main.repository.PointRepository;

import java.util.List;

@RestController
public class GPSPosition {

    @Autowired
    PointRepository pointRepository;


    public GPSPosition(){
        System.out.printf("ssss");
    }

    @GetMapping("/points")
    @ResponseBody
    public ResponseEntity<?> points(){
        List<Point> points = pointRepository.findAll();
        return new ResponseEntity<>(points, HttpStatus.OK);
    }

    @PostMapping("/append")
    @ResponseBody
    public ResponseEntity<?> addPoint(@RequestBody Point point){
        pointRepository.save(point);
        String body = "Record stored successfully";
        return new ResponseEntity<>(body, HttpStatus.OK);
    }
}
