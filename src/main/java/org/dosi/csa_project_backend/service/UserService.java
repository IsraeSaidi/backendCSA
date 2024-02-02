package org.dosi.csa_project_backend.service;


import org.dosi.csa_project_backend.Repository.UserRepository;
import org.dosi.csa_project_backend.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class UserService {

        private final UserRepository userRepository;

        public UserService(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        public List<User> getUsers() {
            return  userRepository.findAll();
        }

    public User addUser(User user) {

        return userRepository.save(user);
    }

}
