package com.cs.service.jpa;

import com.cs.domain.Partners;
import com.cs.repository.PartnerRepository;
import com.cs.service.PartnerService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("partnerService")
@Repository
@Transactional
public class PartnerServiceImpl implements PartnerService {

	@Autowired
	private PartnerRepository partnerRepository;

	@Transactional(readOnly=true)
	public List<Partners> findAll() {
        System.out.println("Doing some shit.");
		return Lists.newArrayList(partnerRepository.findAll());
	}

	@Transactional(readOnly=true)
	public Partners findById(Long id) {
		return partnerRepository.findOne(id);
	}

	public Partners save(Partners contact) {
		return partnerRepository.save(contact);
	}

	@Transactional(readOnly=true)
	public Page<Partners> findAllByPage(Pageable pageable) {
		return partnerRepository.findAll(pageable);
	}	
	
}
