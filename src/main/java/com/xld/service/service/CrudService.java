package com.xld.service.service;

import java.util.List;

public interface CrudService {
	
	List<ContactDetails> getContactDetails();
	
	ContactDetails create(ContactDetails contactDetails);
	
	ContactDetails update(ContactDetails contactDetails);
	
	Long delete(Long id);
}
