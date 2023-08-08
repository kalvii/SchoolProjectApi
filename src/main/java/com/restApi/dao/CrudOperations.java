package com.restApi.dao;

import org.springframework.data.repository.CrudRepository;

import com.restApi.StudentsData.Student_Deatails;

public interface CrudOperations extends CrudRepository<Student_Deatails, Integer> {

}
