package com.company.person_address_one_to_one.DTO;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class AddPersonDTO {

    private String name;

    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 100, message = "Age must not exceed 100")
    private int age;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 8, max = 20, message = "Password must be between 8 and 20 characters")
    private String password;

    private String district;

    private String city;

    private String street;

    private String houseNo;
}
