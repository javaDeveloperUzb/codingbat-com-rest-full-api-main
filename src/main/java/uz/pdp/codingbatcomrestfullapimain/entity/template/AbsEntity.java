package uz.pdp.codingbatcomrestfullapimain.entity.template;

import lombok.Data;

import javax.persistence.*;

@Data
@MappedSuperclass
public class AbsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(nullable = false)
    private String name;

    private boolean active = true;
}
