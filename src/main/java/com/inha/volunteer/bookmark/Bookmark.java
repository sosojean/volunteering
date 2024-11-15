package com.inha.volunteer.bookmark;


import com.inha.volunteer.user.SiteUser;
import com.inha.volunteer.volunteer.Volunteering;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bookmark")
public class Bookmark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 사용자와의 관계 설정
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private SiteUser user;

    // 봉사활동과의 관계 설정
    @ManyToOne
    @JoinColumn(name = "volunteering_id", nullable = false)
    private Volunteering volunteering;

    // 북마크 생성 일시
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();


}