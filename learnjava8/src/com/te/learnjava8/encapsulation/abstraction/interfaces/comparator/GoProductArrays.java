package com.te.learnjava8.encapsulation.abstraction.interfaces.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class GoProductArrays {
	public static void main(String[] args) {
		Product[] products = { new Product(1, "Product01", 34.234, 4), new Product(2, "Product02", 234.234, 1),
				new Product(3, "Product03", 23.234, 5), new Product(4, "Product04", 9234.234, 4),
				new Product(5, "Product05", 2341.234, 2) };

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int sortOn = scanner.nextInt();

		Comparator<Product> comparatorForProductId = 
				(o1, o2) -> o1.getProductId() - o2.getProductId();
				
		Comparator<Product> comparatorForProductPrice = 
				(o1, o2) -> (int) (o1.getProductPrice() - o2.getProductPrice());
				
		Comparator<Product> comparatorForProductRating = new Comparator<Product>() {
			
			@Override
			public int compare(Product o1, Product o2) {
				return o1.getProductRating() - o2.getProductRating();
			}
		};

		if (sortOn == 1) {
			Arrays.sort(products, comparatorForProductPrice);
		} else if (sortOn == 2) {
			Arrays.sort(products, comparatorForProductRating);
		} else {
			Arrays.sort(products, comparatorForProductId);
		}
		for (Product product : products) {
			System.out.println(product);
		}
		
		// System.out.println(comparatorForProductId.getClass().getName());
	}
}
