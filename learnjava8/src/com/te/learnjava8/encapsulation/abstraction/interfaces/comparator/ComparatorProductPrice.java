package com.te.learnjava8.encapsulation.abstraction.interfaces.comparator;

import java.util.Comparator;

public class ComparatorProductPrice implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return (int) (o1.getProductPrice() - o2.getProductPrice());
	}

}
