package com.example.PujithaProject.Repository;

import com.example.PujithaProject.Entity.UserData;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserData, Long>
{
}
