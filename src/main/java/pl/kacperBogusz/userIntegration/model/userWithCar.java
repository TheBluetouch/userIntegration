package pl.kacperBogusz.userIntegration.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.kacperBogusz.userIntegration.view.CarView;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class userWithCar {

    private Long id;

    private String name;

    private String surname;

    private int age;

    private List<CarView> cars;
}
