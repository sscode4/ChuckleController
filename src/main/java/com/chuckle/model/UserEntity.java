package com.chuckle.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import javax.persistence.*;
import java.util.Date;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long id;
    private Long userId;
    private String firstname;
    private String Lastname;
    private String username;
    private String email;
    private String password;
    private String profileImageUrl;
    private Date lastLoginDate;
    private Date lastLoginDisplayDate;
    private Date joinDate;
    private String role;
    private boolean isActive;
    private String[] authourties;
    private boolean notLocked;
}
