package uz.pdp.codingbatcomrestfullapimain.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    @NotNull(message = "Email bo'sh bo'lishi mumkin emas")
    private String email;

    @Min(value = 5, message = "Parol uzunligi kamida 5 bo'lishi kerak")
    @NotNull(message = "Parol bo'sh bo'lishi mumkin emas")
    private String password;
}
