package com.userspringboot.services;

import com.userspringboot.entity.User;
import com.userspringboot.model.UserDTO;
import com.userspringboot.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public User createUser(UserDTO userDTO) {
        User user = new User();
        user.setUserName(userDTO.getUsername())
                .setEmail(userDTO.getEmail());
        return userRepository.save(user);
    }

    public List<UserDTO> listAllUsers() {
        List<User> userEntities = userRepository.findAll();
        return userEntities.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public User updateUser(Integer id, UserDTO userDTO) {
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isPresent()) {
            User userToUpdate = userOptional.get();
            userToUpdate.setUserName(userDTO.getUsername());
            userToUpdate.setEmail(userDTO.getEmail());
            return userRepository.save(userToUpdate);
        } else {
            throw new RuntimeException("User not found for id: " + id);
        }
    }

    public void deleteUser(Integer id) {
        if(userRepository.existsById(id)) {
            userRepository.deleteById(id);
        } else {
            throw new RuntimeException("User not found for id: " + id);
        }
    }

    private UserDTO convertToDTO(User userEntity) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(userEntity.getUserName());
        userDTO.setEmail(userEntity.getEmail());
        return userDTO;
    }
}
