package com.inha.volunteer.user;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "siteUser")
public class SiteUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String loginId;

    @Column(nullable = false)
    private String password;

    private String nickname;

//    @Enumerated(EnumType.STRING)
////    @Column(columnDefinition = "USER")
//    private UserRole role = UserRole.USER;
}
