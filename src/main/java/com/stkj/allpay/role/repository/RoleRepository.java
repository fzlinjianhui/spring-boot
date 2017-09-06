package com.stkj.allpay.role.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stkj.allpay.role.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	
}
