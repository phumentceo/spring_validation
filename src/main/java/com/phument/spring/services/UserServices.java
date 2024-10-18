package com.phument.spring.services;

import com.phument.spring.dto.UserRequest;
import com.phument.spring.model.entity.User;
import com.phument.spring.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

      private final UserRepository repo;

      @Autowired
      public UserServices(UserRepository repo) {
            this.repo = repo;
      }

      public User save(@Valid UserRequest request) {
            User user = User.build(null, request.getName(), request.getEmail(), request.getGender(), request.getMobile());
            return repo.save(user);
      }

      public List<User> getAll() {
            return repo.findAll();
      }

      public Optional<User> getUser(Long id) {
            return repo.findById(id);
      }

      //delete
      public void deleteUser(Long id) {
            repo.deleteById(id);
      }
}