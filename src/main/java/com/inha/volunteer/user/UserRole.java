package com.inha.volunteer.user;

import lombok.Getter;

@Getter
public enum UserRole {
    USER("ROLE_ADMIN"), ADMIN("ROLE_USER");
    UserRole(String value) {
        this.value = value;
    }

    private String value;


}
