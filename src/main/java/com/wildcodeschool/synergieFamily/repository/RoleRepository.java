package com.wildcodeschool.synergieFamily.repository;

import com.wildcodeschool.synergieFamily.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}