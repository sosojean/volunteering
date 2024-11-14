package com.inha.volunteer.bookmark;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

}
