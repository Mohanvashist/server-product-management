package com.sha.serverproductmanagement.Model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="name")
    private String name;

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;

    @Enumerated
    @Column(name="role")
    private Role role;
}
