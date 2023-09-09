package com.userspringboot.model;


import com.userspringboot.validation.ValidEmail;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.experimental.Accessors;
@Data
@Accessors(chain = true)
public class UserDTO {


    @NotEmpty
    private String username;
    @ValidEmail
    private String email;
}
