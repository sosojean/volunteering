package com.inha.volunteer.user;

import com.inha.volunteer.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final SiteUserRepository siteUserRepository;
    private final PasswordEncoder passwordEncoder;

    public SiteUser create(String loginId, String password,  String nickname ) {

        SiteUser siteUser = new SiteUser();
        siteUser.setLoginId(loginId);
        siteUser.setPassword(passwordEncoder.encode(password));
        siteUser.setNickname(nickname);
        this.siteUserRepository.save(siteUser);
        return siteUser;
    }

    public SiteUser getUser(String loginId) {
        Optional<SiteUser> user = siteUserRepository.findByLoginId(loginId);
        if (user.isPresent()) {
            return user.get();
        }else
            throw new DataNotFoundException("user not found");
    }



}
