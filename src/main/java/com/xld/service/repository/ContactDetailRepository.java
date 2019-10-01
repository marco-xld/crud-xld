package com.xld.service.repository;

import java.util.List;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.stereotype.Repository;

import com.xld.service.service.ContactDetails;

@Repository
public interface ContactDetailRepository extends DatastoreRepository<ContactDetails, Long> {
	List<ContactDetails> findAllById(Long id);
}
