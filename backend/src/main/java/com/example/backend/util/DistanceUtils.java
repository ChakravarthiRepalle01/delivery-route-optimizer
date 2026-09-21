package com.example.backend.util;

import com.example.backend.model.Location;
import java.util.List;

public class DistanceUtils {

    // Calculates straight-line Euclidean distance between two locations
    public static double calculateDistance(Location loc1, Location loc2) {
        double dLat = loc1.getLatitude() - loc2.getLatitude();
        double dLon = loc1.getLongitude() - loc2.getLongitude();
        return Math.sqrt(dLat * dLat + dLon * dLon);
    }

    // Builds an N x N distance matrix for fast algorithmic lookups
    public static double[][] buildDistanceMatrix(List<Location> locations) {
        int n = locations.size();
        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = calculateDistance(locations.get(i), locations.get(j));
            }
        }
        return matrix;
    }
}
