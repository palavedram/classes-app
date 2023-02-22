package com.example.ClassesProject.repositories;

import com.example.ClassesProject.models.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesRepository extends JpaRepository<Classes,Integer> {
}
