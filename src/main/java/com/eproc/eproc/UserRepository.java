package com.eproc.eproc;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.eproc.eproc.io.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
	
	UserEntity findUserByEmail(String email);
}
