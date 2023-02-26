package com.example.demo.domain.user;


import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;
    private String password;
    private String socialEmail;

    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;


}
