package com.xld.service.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("crudService")
public class CrudServiceImpl implements CrudService {

	public List<ContactDetails> getContactDetails() {
		List<ContactDetails> contactDetails = new ArrayList<>();
		contactDetails.add(new ContactDetails("name1", "email1@sample.com", "123"));
		return contactDetails;
	}
	
}
