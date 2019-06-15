package org.tracker.main.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.tracker.main.model.Point;

public interface PointRepository extends JpaRepository<Point, Long> {
}
