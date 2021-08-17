package uz.pdp.codingbatcomrestfullapimain.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDto {
    @NotNull(message = "Name bo'sh bo'lishi mumkin emas")
    private String name;

    @NotNull(message = "Text bo'sh bo'lishi mumkin emas")
    private String text;

    @NotNull(message = "Method bo'sh bo'lishi mumkin emas")
    private String method;

    private String hint;

    private boolean star = false;

    @NotNull(message = "Section bo'sh bo'lishi mumkin emas")
    private Integer sectionId;

}
