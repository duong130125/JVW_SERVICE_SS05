package ra.session_05.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.session_05.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}