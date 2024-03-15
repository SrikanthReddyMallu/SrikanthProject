package com.example.PujithaProject.Service;

import com.example.PujithaProject.Entity.UserData;
import com.example.PujithaProject.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDataServiceImpl implements UserDataService
{
    @Autowired
    UserRepository userRepository;

    @Override
    public UserData saveUserData(UserData userData)
    {
        return userRepository.save(userData);
    }

    @Override
    public List<UserData> findAll() {
        return (List<UserData>) userRepository.findAll();
    }
}
