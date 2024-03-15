package com.example.PujithaProject.Service;

import com.example.PujithaProject.Entity.UserData;

import java.util.List;

public interface UserDataService
{
    public UserData saveUserData(UserData userData);

    public List<UserData> findAll();
}
