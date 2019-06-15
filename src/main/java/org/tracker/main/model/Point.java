package org.tracker.main.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    private Double longitude;
    private Double latitude;
    private Long timestamp;
}
