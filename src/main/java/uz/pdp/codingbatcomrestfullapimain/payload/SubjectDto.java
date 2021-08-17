package uz.pdp.codingbatcomrestfullapimain.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectDto {
    @NotNull(message = "Name bo'sh bo'lishi mumkin emas")
    private String name;
}
