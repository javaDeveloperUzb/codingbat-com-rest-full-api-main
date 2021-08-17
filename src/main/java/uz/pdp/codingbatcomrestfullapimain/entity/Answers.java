package uz.pdp.codingbatcomrestfullapimain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Answers  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(columnDefinition = "TEXT",nullable = false)
    private String text;

    @ManyToOne
    private Question question;

    @OneToOne
    private User user;

    private boolean correct = false;
}
