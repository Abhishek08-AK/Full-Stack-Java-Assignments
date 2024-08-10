package edu.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.demo.entities.Student;
import edu.demo.repos.StudentRepository;

@CrossOrigin("*")

@RestController
public class StudentsController {

	@Autowired
	private StudentRepository repo;

	@GetMapping("/getStuds")
	public List<Student> getStuds() {
		return repo.findAll();
	}

	@PostMapping("/saveStud")
	public String addStud(@RequestBody Student stud) {
		String res = " ";

		try {
			repo.save(stud);
			res = "Successfully Saved";

		} catch (Exception e) { // TODO: handle exception e.printStackTrace(); res =
			e.getMessage();
		}

		return res;

	}

	@DeleteMapping("/deleteStud")
	public String removeStud(@RequestBody Student stud) {
		String res=" ";

		Long id = (Long) (stud.getId()); // Add this extra line

		try {
			repo.deleteById(id);
			res = "Successfully Delete";

		} catch (Exception e) { // TODO: handle exception e.printStackTrace(); res =
			e.getMessage();
		}

		return res;

	}

	@PutMapping("/updateStud")
	public String modifyStud(@RequestBody Student stud) {
		String res=" ";

		try {
			repo.save(stud);
			res = "Successfully Update";

		} catch (Exception e) {
			e.printStackTrace();
			res = e.getMessage();
		}

		return res;
	}

}
