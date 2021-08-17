package uz.pdp.codingbatcomrestfullapimain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.codingbatcomrestfullapimain.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
