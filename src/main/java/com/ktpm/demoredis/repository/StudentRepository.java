package com.ktpm.demoredis.repository;

import org.springframework.data.repository.CrudRepository;

import com.ktpm.demoredis.entity.Student;

public interface StudentRepository extends CrudRepository<Student, String> {
}
