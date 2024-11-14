package com.inha.volunteer.bookmark;

import com.inha.volunteer.user.SiteUser;
import com.inha.volunteer.volunteer.Volunteering;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookmarkService {

    @Autowired
    private BookmarkRepository bookmarkRepository;


    public List<Bookmark> getBookmarksForUser(String name) {
        return null;
    }

    public void addBookmark(Long volunteeringId, String name) {
    }

    public void removeBookmark(Long bookmarkId, String name) {
    }

    public boolean isBookmarked(SiteUser user, Volunteering volunteering) {
        return false;

    }
}
