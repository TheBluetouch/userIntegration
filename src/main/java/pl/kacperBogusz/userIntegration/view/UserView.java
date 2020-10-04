package pl.kacperBogusz.userIntegration.view;

import lombok.Data;

@Data
public class UserView {

    private Long userId;

    private String name;

    private String surname;

    Integer age;
}
