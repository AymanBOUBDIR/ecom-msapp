package ma.enset.inventoryservice.repository;

import ma.enset.inventoryservice.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Long> {

}
