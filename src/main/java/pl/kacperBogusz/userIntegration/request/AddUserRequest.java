package pl.kacperBogusz.userIntegration.request;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.DecimalMin;

@Data
public class AddUserRequest {

    @NonNull
    private String name;

    @NonNull
    private String surname;

    @DecimalMin(value = "18")
    @NonNull
    int age;


}
