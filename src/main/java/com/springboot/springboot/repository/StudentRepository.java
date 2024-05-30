package com.springboot.springboot.repository;

import com.springboot.springboot.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {
    List<Student> findByNameContaining(String name);
    Page<Student> findByNameContainingPage(String name, Pageable pageable);
}
