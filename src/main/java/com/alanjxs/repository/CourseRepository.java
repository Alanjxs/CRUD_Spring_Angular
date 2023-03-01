package com.alanjxs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alanjxs.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
