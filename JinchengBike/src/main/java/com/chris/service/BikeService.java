package com.chris.service;

import com.chris.model.Bike;
import org.springframework.data.geo.GeoResult;

import java.util.List;

public interface BikeService {
    void save(Bike bike);
    List<GeoResult<Bike>> findNear(double longitude, double latitude);
}
