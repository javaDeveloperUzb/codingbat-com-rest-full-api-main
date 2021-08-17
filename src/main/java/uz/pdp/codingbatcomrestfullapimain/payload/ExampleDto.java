package uz.pdp.codingbatcomrestfullapimain.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExampleDto {
    @NotNull(message = "Text bo'sh bo'lishi mumkin emas")
    private String text;

    @NotNull(message = "Question bo'sh bo'lishi mumkin emas")
    private Integer questionId;

}
