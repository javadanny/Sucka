package com.cs.repository;

import com.cs.domain.Teams;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TeamRepository extends PagingAndSortingRepository<Teams, Long> {

}
