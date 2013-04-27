package com.cs.service;

import com.cs.domain.Partners;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PartnerService {

	public List<Partners> findAll();
	
	public Partners findById(Long id);
	
	public Partners save(Partners partner);
	
	public Page<Partners> findAllByPage(Pageable pageable);
	
}
