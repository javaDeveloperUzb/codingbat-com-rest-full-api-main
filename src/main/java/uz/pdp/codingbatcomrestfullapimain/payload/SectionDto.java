package uz.pdp.codingbatcomrestfullapimain.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SectionDto {
    @NotNull(message = "Name bo'sh bo'lishi mumkin emas")
    private String name;

    @NotNull(message = "Section bo'sh bo'lishi mumkin emas")
    private Integer subjectId;

    @NotNull(message = "Description bo'sh bo'lishi mumkin emas")
    private String description;
}
