package com.inha.volunteer.bookmark;

import com.inha.volunteer.user.SiteUser;
import com.inha.volunteer.user.SiteUserRepository;
import com.inha.volunteer.volunteer.Volunteering;
import com.inha.volunteer.volunteer.VolunteeringRepository;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookmarkService {

    @Autowired
    private BookmarkRepository bookmarkRepository;

    @Autowired
    private VolunteeringRepository volunteeringRepository;

    @Autowired
    private SiteUserRepository siteUserRepository; // SiteUserRepository 추가


    public List<Bookmark> getBookmarksForUser(String name) {
        return null;
    }

    public void addBookmark(Long volunteeringId, String name) {

        SiteUser user = siteUserRepository.findByLoginId(name)
            .orElseThrow(() -> new IllegalArgumentException("사용자를 찾을 수 없습니다."));

        Volunteering volunteering = volunteeringRepository.findById(volunteeringId)
            .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 봉사활동 ID입니다."));



        if (bookmarkRepository.existsByUserAndVolunteering(user, volunteering)) {
            throw new IllegalArgumentException("이미 북마크에 추가된 항목입니다.");
        }
            // 새로운 북마크 객체 생성
            Bookmark bookmark = new Bookmark();
            bookmark.setUser(user);
            bookmark.setVolunteering(volunteering);
            bookmark.setCreatedAt(LocalDateTime.now());

            // 북마크 저장
            bookmarkRepository.save(bookmark);
        }


    }

//    public void removeBookmark(Long bookmarkId, String name) {
//    }
//
//    public boolean isBookmarked(SiteUser user, Volunteering volunteering) {
//        return false;
//
//    }
//}
