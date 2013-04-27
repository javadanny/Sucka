package com.cs.service.jpa;

import com.cs.domain.Teams;
import com.cs.repository.TeamRepository;
import com.cs.service.TeamService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("teamService")
@Repository
@Transactional
public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamRepository teamRepository;

	@Transactional(readOnly=true)
	public List<Teams> findAll() {
        System.out.println("Doing some shit.");
		return Lists.newArrayList(teamRepository.findAll());
	}

	@Transactional(readOnly=true)
	public Teams findById(Long id) {
		return teamRepository.findOne(id);
	}

	public Teams save(Teams contact) {
		return teamRepository.save(contact);
	}

	@Transactional(readOnly=true)
	public Page<Teams> findAllByPage(Pageable pageable) {
		return teamRepository.findAll(pageable);
	}	
	
}
