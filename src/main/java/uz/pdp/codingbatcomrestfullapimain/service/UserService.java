package uz.pdp.codingbatcomrestfullapimain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.codingbatcomrestfullapimain.entity.User;
import uz.pdp.codingbatcomrestfullapimain.payload.ApiResponse;
import uz.pdp.codingbatcomrestfullapimain.payload.UserDto;
import uz.pdp.codingbatcomrestfullapimain.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUser(Integer id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElseGet(User::new);
    }

    public ApiResponse addUser(UserDto userDto) {
        boolean existsByEmail = userRepository.existsByEmail(userDto.getEmail());
        if (existsByEmail) {
            return new ApiResponse("Bunday email mavjud", false);
        }
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        userRepository.save(user);
        return new ApiResponse("User saqlandi", true);
    }

    public ApiResponse editUser(Integer id, UserDto userDto) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (!optionalUser.isPresent()) {
            return new ApiResponse("Bunday user mavjud emas", false);
        }

        boolean existsByEmail = userRepository.existsByEmailNot(userDto.getEmail());
        if (existsByEmail) {
            return new ApiResponse("Bunday email mavjud", false);
        }

        User user = optionalUser.get();
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        userRepository.save(user);
        return new ApiResponse("User saqlandi", true);
    }

    public ApiResponse deleteUser(Integer id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (!optionalUser.isPresent()) {
            return new ApiResponse("Bunday user mavjud emas", false);
        }

        userRepository.deleteById(id);
        return new ApiResponse("User o'chirildi", true);
    }
}
