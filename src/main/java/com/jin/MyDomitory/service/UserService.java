package com.jin.MyDomitory.service;

import com.jin.MyDomitory.domain.User;
import com.jin.MyDomitory.dto.user.AddUserRequest;
import com.jin.MyDomitory.dto.user.LoginUserRequest;
import com.jin.MyDomitory.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository ) {
        this.userRepository = userRepository;
    }

    public User AddUser(AddUserRequest request){
        return userRepository.save(request.toEntity());
    }

    public User Login(LoginUserRequest request){
            User user=userRepository.findByEmailAndPassword(request.getEmail(),request.getPassword());
            if(user==null) return null;
            return user;
    }


}