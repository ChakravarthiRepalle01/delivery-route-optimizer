package com.example.backend.model;

import java.util.List;

public class RouteResponse {
    private List<Location> route;
    private double totalDistance;
    private long executionTimeMs;
    private String algorithmName;

    public RouteResponse() {}

    public RouteResponse(List<Location> route, double totalDistance, long executionTimeMs, String algorithmName) {
        this.route = route;
        this.totalDistance = totalDistance;
        this.executionTimeMs = executionTimeMs;
        this.algorithmName = algorithmName;
    }

    public List<Location> getRoute() { return route; }
    public void setRoute(List<Location> route) { this.route = route; }

    public double getTotalDistance() { return totalDistance; }
    public void setTotalDistance(double totalDistance) { this.totalDistance = totalDistance; }

    public long getExecutionTimeMs() { return executionTimeMs; }
    public void setExecutionTimeMs(long executionTimeMs) { this.executionTimeMs = executionTimeMs; }

    public String getAlgorithmName() { return algorithmName; }
    public void setAlgorithmName(String algorithmName) { this.algorithmName = algorithmName; }
}
