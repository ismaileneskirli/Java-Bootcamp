package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;

// jpa repository enables CRUD operations , findAll() etc.
public interface ProductDao extends JpaRepository<Product, Integer> {

	// getBy + entityName
	// select * from products where product_name = productName -> ilk bulduğu adı getirir
	Product getByProductName (String productName);
	Product getByProductNameAndCategoryId(String productName, int categoryId);
	
	List<Product> getByProductNameOrCategoryId(String productName, int categoryId);

	List<Product> getByCategoryIdIn(List<Integer> categories);
	
	List<Product> getByProductNameContains(String productName);
	
	List<Product> getByProductNameStartsWith(String productName);
	
	//jpql -> entitylerdeki alanların isimlerinden query
	@Query("From Product where productName=:productName and categoryId=:categoryId")
	List<Product> getByNameAndCategory(String productName, int categoryId);
}
