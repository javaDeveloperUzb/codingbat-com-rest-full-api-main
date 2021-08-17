package uz.pdp.codingbatcomrestfullapimain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.codingbatcomrestfullapimain.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
