package com.inha.volunteer.volunteer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VolunteeringRepository extends JpaRepository<Volunteering, Integer> {
    @Override
    List<Volunteering> findAll();

    @Query(value = "SELECT * FROM volunteering WHERE gugun_cd = :gugunCd ",nativeQuery = true)
    List<Volunteering> findByGugunCd(Integer gugunCd);
}
