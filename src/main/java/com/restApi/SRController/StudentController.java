package com.restApi.SRController;

import java.util.Optional;

import org.springframework.aot.hint.annotation.Reflective;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restApi.StudentsData.Student_Deatails;
import com.restApi.dao.CrudOperations;

@RestController
public class StudentController {
	
	@Autowired
	private CrudOperations operations;
	
	@PostMapping("/add")
	public Student_Deatails addStudent(@RequestBody Student_Deatails newstudent) {
		
		Student_Deatails students=new Student_Deatails();
		
		students.setS_Name(newstudent.getS_Name());
		students.setSce(newstudent.getSce());
		students.setFee(newstudent.getFee());
		operations.save(students);
		
		return students;
		
	}
	
	@GetMapping("/view")
public @ResponseBody Iterable<Student_Deatails> showDeatails()	

{
	return operations.findAll();
		}

@GetMapping("/view/{id}")
public Optional<Student_Deatails> studentbyid(@PathVariable Integer id){
	return operations.findById(id);
}

@DeleteMapping("/delete/{id}")
public String deletedatabyid(@PathVariable Integer id) {
	operations.deleteById(id);
	return "delete scuccefully ";
	
	
}
	
	
	

}
