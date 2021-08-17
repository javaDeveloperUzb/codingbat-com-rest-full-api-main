package uz.pdp.codingbatcomrestfullapimain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.codingbatcomrestfullapimain.entity.Section;

public interface SectionRepository extends JpaRepository<Section, Integer> {
}
