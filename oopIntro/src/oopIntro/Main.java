package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1=new Product(1,"Lenovo v14",15000,"16 Gb Ram",10);//intance oluþturma
		Product product2=new Product(2,"Lenovo v15",20000,"32 Gb Ram",10);
		Product product3=new Product(3,"Hp 5",10000,"8 Gb Ram",10);
		Product product4=new Product();
		product4.setId(4);
		product4.setName("Monster");
		product4.setUnitPrice(15000);
		product4.setDetail("16 gb ram");
		product4.setDiscount(10);
		System.out.println(product4.getUnitPriceAfterDiscount());
		
		Product[] products= {product1,product2,product3};
				
		System.out.println(products.length);
		
		for(Product product:products) {
			System.out.println(product.getName());
		}
		
		Category  category1=new Category();
		category1.setId(0);
		category1.setName("Computer");
		
		Category  category2=new Category();
		category2.setId(2);
		category2.setName("Garden");
		
		
		Category  category3=new Category();
		category3.setId(3);
		category3.setName("Tool");
		
		
		Category[] categories= {category1,category2,category3};
		
		for(Category category:categories) {
			System.out.println(category.getName());
		}
		
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);

	}

}
