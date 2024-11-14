package com.inha.volunteer.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//@Repository
public interface SiteUserRepository extends JpaRepository<SiteUser, Integer> {
    Optional<SiteUser> findByLoginId(String loginId);

}
