package com.springboot.springboot.repository;

import com.springboot.springboot.model.Classroom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, UUID> {

    List<Classroom> findByNameContaining(String name);
    Page<Classroom> findByNameContainingPage(String name, Pageable pageable);
}
