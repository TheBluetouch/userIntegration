package pl.kacperBogusz.userIntegration.request;

import lombok.Data;

@Data
public class AddCarRequest {

    private String model;

    private String company;

    private int year;
}
