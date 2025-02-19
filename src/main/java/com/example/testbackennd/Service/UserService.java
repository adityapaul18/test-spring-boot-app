package com.example.testbackennd.Service;


import com.example.testbackennd.Entity.User;
import com.example.testbackennd.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private static UserRepo repo;

    public static void saveOrUpdate(User user) {
        repo.save(user);
    }

    public static void save(User user) {
        repo.save(user);
    }
}
