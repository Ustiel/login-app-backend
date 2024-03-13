package com.example.loginappbackend.repository;

import com.example.loginappbackend.entity.EnumRole;
import com.example.loginappbackend.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(EnumRole name);
}
