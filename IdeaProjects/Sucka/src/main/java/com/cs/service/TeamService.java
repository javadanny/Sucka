package com.cs.service;

import com.cs.domain.Teams;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TeamService {

	public List<Teams> findAll();
	
	public Teams findById(Long id);
	
	public Teams save(Teams partner);
	
	public Page<Teams> findAllByPage(Pageable pageable);
	
}
