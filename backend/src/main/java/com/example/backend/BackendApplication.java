package com.example.backend;

import com.example.backend.model.Location;
import com.example.backend.util.DistanceUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Override
    public void run(String... args) {
        List<Location> locations = List.of(
            new Location("1", "Depot", 12.9716, 77.5946),
            new Location("2", "Stop A", 12.9352, 77.6245),
            new Location("3", "Stop B", 12.9279, 77.6271)
        );

        double[][] matrix = DistanceUtils.buildDistanceMatrix(locations);
        System.out.println("=== STEP 1 VERIFICATION: DISTANCE MATRIX ===");
        for (double[] row : matrix) {
            for (double dist : row) {
                System.out.printf("%.4f\t", dist);
            }
            System.out.println();
        }
    }
}
