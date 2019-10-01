package com.xld.service.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xld.service.repository.ContactDetailRepository;

/**
 * 
 * @author Marco Giovanne
 *
 */
@Service("crudService")
public class CrudServiceImpl implements CrudService {
	
	@Autowired
	private ContactDetailRepository contactDetailRepository;

	public List<ContactDetails> getContactDetails() {	
		Iterable<ContactDetails> iterableContactDetails = contactDetailRepository.findAll();		
		List<ContactDetails> contactDetails = new ArrayList<>();
		for(ContactDetails cd : iterableContactDetails) {
			contactDetails.add(cd);
		}		
		return contactDetails;
	}

	@Override
	public ContactDetails create(ContactDetails contactDetails) {
		ContactDetails saveContactDetails = new ContactDetails();
		saveContactDetails.setName("test name");
		saveContactDetails.setEmail("test@email.com");
		saveContactDetails.setNumber("`12345");		
		ContactDetails  saved = contactDetailRepository.save(saveContactDetails);
		contactDetails.setId(saved.getId());
		return contactDetails;
	}

	@Override
	public ContactDetails update(ContactDetails contracDetails) {
		ContactDetails  updated = contactDetailRepository.save(contracDetails);
		return updated;
	}

	@Override
	public Long delete(Long id) {
		contactDetailRepository.deleteById(id);
		return id;
	}
	
}
