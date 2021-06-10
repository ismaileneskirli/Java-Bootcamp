package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

// jpa repository enables CRUD operations , findAll() etc.
public interface ProductDao extends JpaRepository<Product, Integer> {

}
