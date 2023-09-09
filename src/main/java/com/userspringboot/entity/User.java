package com.userspringboot.entity;

import com.userspringboot.validation.ValidEmail;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;


@Entity
@Table(name = "user_profile")
@Setter
@Getter
@Accessors(chain = true)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty
    private String userName;
    @ValidEmail
    private String email;

}