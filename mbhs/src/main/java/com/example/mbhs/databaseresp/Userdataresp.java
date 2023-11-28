package com.example.mbhs.databaseresp;

import com.example.mbhs.userdata.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userdataresp extends JpaRepository<User, String> {
    //public User createAccount(User user);
}
