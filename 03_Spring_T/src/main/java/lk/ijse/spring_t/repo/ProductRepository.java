package lk.ijse.spring_t.repo;

import lk.ijse.spring_t.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends
        JpaRepository<Product,Long> {
}
