package com.sam.springbootcrud.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sam.springbootcrud.User.UserData;

@Repository
public interface UserRepository extends CrudRepository<UserData, Integer> {

}
