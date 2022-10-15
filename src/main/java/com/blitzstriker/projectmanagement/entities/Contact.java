package com.blitzstriker.projectmanagement.entities;

import javax.persistence.*;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String nickName;
    private String email;
    private Long phone;
    private String imageUrl;

    @Column(length = 1000)
    private String description;

    @ManyToOne
    private User user;
}
