package com.people.egram.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.people.egram.data.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

}