package com.ideamall.domain;

import com.ideamall.constant.UserRole;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 유저 코드

    private String name; // 유저 이름

    @Column(unique = true)
    private String email; // 유저 이메일

    private String password; // 유저 비밀번호

    private LocalDateTime createdAt; // 생성시간

    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Builder
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.createdAt = LocalDateTime.now();
    }
}
