package com.xld.service.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xld.service.repository.ContactDetailRepository;

@Service("crudService")
public class CrudServiceImpl implements CrudService {
	
	@Autowired
	private ContactDetailRepository contactDetailRepository;

	public List<ContactDetails> getContactDetails() {
		
		ContactDetails saveContactDetails = new ContactDetails();
		saveContactDetails.setName("test name");
		saveContactDetails.setEmail("test@email.com");
		saveContactDetails.setNumber("`12345");
		
		contactDetailRepository.save(saveContactDetails);
		
		Iterable<ContactDetails> iterableContactDetails = contactDetailRepository.findAll();
		
		
		
		List<ContactDetails> contactDetails = new ArrayList<>();
		contactDetails.add(new ContactDetails("name1", "email1@sample.com", "123"));
		return contactDetails;
	}
	
}
