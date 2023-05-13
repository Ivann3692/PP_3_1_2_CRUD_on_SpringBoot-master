package com.example.pp_3_1_2_crud_on_springboot.dao;

import com.example.pp_3_1_2_crud_on_springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {


}
