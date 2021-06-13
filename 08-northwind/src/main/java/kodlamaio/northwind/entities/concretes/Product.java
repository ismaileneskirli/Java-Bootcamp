package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//application.properties for db settings
@Data // create getters and setters
@Entity // this class is a database object.
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // equivalent of auto increment in postgres db
	@Column(name = "product_id")
	private int id;
	
//	@Column(name = "category_id")
//	private int categoryId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "unit_price")
	private double unitPrice;
	
	@Column(name = "units_in_stock")
	private short unitsInStock;
	
	@Column(name = "quantity_per_unit")
	private String quantityPerUnit;
	
	// joins to category table with category id.
	// adds columns of category table like product columns.
	@ManyToOne()
	@JoinColumn(name = "category_id")
	private Category category;

}
