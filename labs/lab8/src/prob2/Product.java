package prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Problem 2: Get practice on how sorting performed using Inner classes 
// and how can easily do it with Lambdas by doing solving this problem.
/*
 * a. Sort by implementing a comparator for price attribute and print the product list using separate comparators outside the class.
 * b. Sort by implementing a comparator for title attribute and print product list using separate comparators outside the class.
 * c. Implement the sort method so that only one type of Comparator is used for tasks a & b by referring comparator3 package.
 * d. If the title is the same, use the model as another attribute to sort it. Do this by using lambdas. 
 * (Java Functional way of using Lambda by referring closures.java8 package)
 * */

public class Product {
	final String title;
	final double price;
	final int model;

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public int getModel() {
		return model;
	}

	public Product(String title, Double price, int model) {
		this.title = title;
		this.price = price;
		this.model = model;
	}

	@Override
	public String toString() {
		return String.format("%s : %s : %s", title, price, model);
	}

	public static void main(String[] args) {
		Product p1 = new Product("Chesmen cookie", 3.97, 1);
		Product p2 = new Product("KitKat Pack Size", 9.94, 1);
		Product p3 = new Product("Tide Pods", 5.44, 2);
		Product p4 = new Product("Ritz", 3.78, 1);
		Product p5 = new Product("Dawn Ultra", 0.97, 2);
		List<Product> products = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5));
		System.out.println("\na. Sort by price attribute ==========");
		Collections.sort(products, new ProductPriceComparator());
//		printList(products);
		System.out.println(products);
		System.out.println("\nb. Sort by title attribute ==========");
		Collections.sort(products, new ProductTitleComparator());
		System.out.println(products);

		System.out.println("\nc1. Implement the sort method ==========");
		ProductInfo pi = new ProductInfo();
		pi.sortC(products, ProductInfo.SortMethod.BYPRICE);
		System.out.println(products);
		System.out.println("\nc2. Implement the sort method ==========");
		pi.sortC(products, ProductInfo.SortMethod.BYTITLE);
		System.out.println(products);
		
		System.out.println("\nd1. Implement the sort method by using lambdas ==========");
		pi.sortD(products, ProductInfo.SortMethod.BYPRICE);
		System.out.println(products);
		System.out.println("\nd2. Implement the sort method by using lambdas ==========");
		pi.sortD(products, ProductInfo.SortMethod.BYTITLE);
		System.out.println(products);
	}

	public static void printList(List<Product> products) {
		for (Product product : products) {
			System.out.println(product.toString());
		}
	}

}
