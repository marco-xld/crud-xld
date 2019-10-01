package com.xld.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xld.service.service.ContactDetails;
import com.xld.service.service.CrudService;

@Controller
@RequestMapping(path = "/api/crud")
public class CrudController {
	
	@Autowired
	private CrudService crudService;

	@GetMapping
	public ResponseEntity<List<ContactDetails>> get() {
		return new ResponseEntity<>(crudService.getContactDetails(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<List<ContactDetails>> create(@RequestBody ContactDetails contactDetails) {
		return new ResponseEntity<>(crudService.getContactDetails(), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<List<ContactDetails>> update(@RequestBody ContactDetails contactDetails) {
		return new ResponseEntity<>(crudService.getContactDetails(), HttpStatus.OK);
	}
	
	@DeleteMapping("/${id}")
	public ResponseEntity<List<ContactDetails>> update(@RequestParam("id") Integer id) {
		return new ResponseEntity<>(crudService.getContactDetails(), HttpStatus.OK);
	}
	
}
