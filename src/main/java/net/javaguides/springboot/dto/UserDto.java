package net.javaguides.springboot.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.javaguides.springboot.entity.User;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    @Schema(
            description = "User First name"
    )
    @NotEmpty(message = "User first name must not be null or empty")
    private String firstName;
    @Schema(
            description = "User Last name"
    )
    @NotEmpty(message = "User last name must not be null or empty")
    private String lastName;
    @Schema(
            description = "User email"
    )
    @NotEmpty(message = "User email must not be null or empty") @Email(message = "Email address should be valid")
    private String email;

    public UserDto(User user){
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
    }
}
