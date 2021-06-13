package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;


@Service
public class ProductManager implements ProductService {
	
	private ProductDao productDao;
	
	// constructor injection
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}



	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>
		(this.productDao.findAll(), "Data listelendi"); 

	}



	@Override
	public Result add(Product product) {
		// save is a function in jpa repo to add object to db.
		this.productDao.save(product);
		return new SuccessResult("Urun eklendi");
	}



	@Override
	public DataResult<Product> getByProductName(String productName) {
		//business code
		return new SuccessDataResult<Product>
		(this.productDao.getByProductName(productName), "Data listelendi"); 
	}



	@Override
	public DataResult<Product> getByProductNameAndCategory(String productName, int categoryId) {
		//business code
		return new SuccessDataResult<Product>
		(this.productDao.getByProductNameAndCategory_CategoryId(productName,categoryId), "Data listelendi"); 
	}



	@Override
	public DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByProductNameOrCategory_CategoryId(productName, categoryId), "Data listelendi"); 
	}



	@Override
	public DataResult<List<Product>> getByCategoryIn(List<Integer> categories) {
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByCategory_CategoryIdIn(categories), "Data listelendi"); 
	}



	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByProductNameContains(productName), "Data listelendi"); 
	}



	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByProductNameStartsWith(productName), "Data listelendi"); 
	}



	@Override
	public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByNameAndCategory(productName,categoryId), "Data listelendi"); 
	}



	@Override
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {

		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(pageable).getContent());		
	}



	@Override
	public DataResult<List<Product>> getAllDesc() {
		Sort sort = Sort.by(Sort.Direction.DESC, "productName");
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(sort), "Basarili");
	}



	@Override
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
		return new SuccessDataResult<List<ProductWithCategoryDto>> (this.productDao.getProductWithCategoryDetails(), "Data listed");
	}

}