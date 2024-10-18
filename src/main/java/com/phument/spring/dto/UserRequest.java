package com.phument.spring.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {


    @NotNull(message = "username can't be null")
    @NotBlank(message = "username can't be empty or blank") // Additionally checks for non-empty values
    private String name;

    @NotNull(message = "email can't be null")
    @Email(message = "invalid enter your email")
    @NotBlank(message = "email can't be empty or blank")
    private String email;

    private String gender;

    @Pattern(regexp = "^\\d{10}$", message = "invalid mobile entered")
    private String mobile;

}