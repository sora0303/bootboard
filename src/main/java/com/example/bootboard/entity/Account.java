package com.example.bootboard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

@Getter
@Entity
@NoArgsConstructor
public class Account implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userid;

    private String password;

    private String name;

    private String email;


    @Builder
    public Account(Long id, String userid, String password, String name, String email) {
        this.id = id;
        this.userid = userid;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    void modifyAccount()
}
