package com.inha.volunteer.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateDto {

    private String loginId;

    private String password1;

    private String password2;

    private String nickname;
}
