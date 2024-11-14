package com.inha.volunteer.volunteer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VolunteeringRepository extends JpaRepository<Volunteering, Integer> {
    @Override
    List<Volunteering> findAll();

    List<Volunteering> findByGugunCd(Integer gugunCd);

    List<Volunteering> findById(Long id);


    Page<Volunteering> findAll(Specification<Volunteering> spec, Pageable pageable);

}
