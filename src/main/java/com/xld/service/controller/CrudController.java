package com.xld.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xld.service.service.ContactDetails;
import com.xld.service.service.CrudService;

/**
 * 
 * @author Marco Giovanne
 *
 */
@RestController
@RequestMapping(path = "/api/crud")
public class CrudController {
	
	@Autowired
	private CrudService crudService;

	@GetMapping
	public ResponseEntity<List<ContactDetails>> getAll() {
		return new ResponseEntity<>(crudService.getContactDetails(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<ContactDetails> create(@RequestBody ContactDetails contactDetails) {
		return new ResponseEntity<>(crudService.create(contactDetails), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<ContactDetails> update(@RequestBody ContactDetails contactDetails) {
		return new ResponseEntity<>(crudService.update(contactDetails), HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<Long> delete(@RequestParam("id") Long id) {
		return new ResponseEntity<>(crudService.delete(id), HttpStatus.OK);
	}
	
}
