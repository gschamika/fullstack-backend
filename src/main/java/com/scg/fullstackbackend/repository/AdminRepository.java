package com.scg.fullstackbackend.repository;

import com.scg.fullstackbackend.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
