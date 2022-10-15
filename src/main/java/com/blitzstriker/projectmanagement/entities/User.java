package com.blitzstriker.projectmanagement.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Name must not be blank")
    private String name;

    @Column(unique = true)
    @Email(message = "Email should be valid")
    @NotBlank(message = "Email must not be blank")
    private String email;

    @NotBlank(message = "Password must be at least 8 characters")
    private String password;
    private String role;
    private boolean enabled;
    private String imageUrl;

    @Column(length = 500)
    private String about;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
    private List<Contact> contacts;
}
