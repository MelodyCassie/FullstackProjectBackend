package com.melody.fullstackbackendproject.data.repositories;

import com.melody.fullstackbackendproject.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
