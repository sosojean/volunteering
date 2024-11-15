package com.inha.volunteer.bookmark;

import com.inha.volunteer.user.SiteUser;
import com.inha.volunteer.volunteer.Volunteering;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    boolean existsByUserAndVolunteering(SiteUser user, Volunteering volunteering);

    Optional<Bookmark> findByVolunteeringIdAndUserLoginId(Long volunteeringId, String name);

}
