package ra.session_05.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.session_05.entity.Fruit;

public interface FruitRepository extends JpaRepository<Fruit, Long> {
}