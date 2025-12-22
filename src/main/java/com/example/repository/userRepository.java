package com.example.repository;
import com.example.db.DatabaseConnection;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class userRepository {
    private DatabaseConnection db;
    public userRepository(DatabaseConnection db){
        this.db=db;
    }
    public List<String> findAll(){
        return db.getusers();
    }

    public void save(String user){
        db.addUser(user);
    }
}
