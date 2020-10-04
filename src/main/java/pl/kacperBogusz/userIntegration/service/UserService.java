package pl.kacperBogusz.userIntegration.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.kacperBogusz.userIntegration.model.User;
import pl.kacperBogusz.userIntegration.repository.UserRepository;
import pl.kacperBogusz.userIntegration.request.AddUserRequest;
import pl.kacperBogusz.userIntegration.view.CarView;
import pl.kacperBogusz.userIntegration.view.UserView;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final RestTemplate restTemplate;

    private static String CARS_URL = "http//localhost:8050/car/";

    private final UserRepository userRepository;

    public User addUserRequest(AddUserRequest request){

        User user = User.builder()
                .name(request.getName())
                .surname(request.getSurname())
                .age(request.getAge())
                .build();

        userRepository.save(user);
        return user;

    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User findUserById( Long userId){
        return userRepository.findUserByUserId(userId);

    }
//    private CarView getCarFromExternalService(Long carId) {
//        return restTemplate.getForObject(CARS_URL + carId, CarView.class);
//    }
}
