package ma.Aboufariss.inventoryservice.repositories;

import ma.Aboufariss.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {

}
