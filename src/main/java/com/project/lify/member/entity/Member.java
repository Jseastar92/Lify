package com.project.lify.member.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Getter
public class Member {

    @Id
    @Column(name = "user_id")
    private UUID id;

    private String name;
    private String email;
    private String password;


}
