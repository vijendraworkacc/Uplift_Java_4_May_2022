package com.te.learnjava8.encapsulation.abstraction.interfaces.comparator;

import java.util.Comparator;

public class ComparatorProductId implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getProductId() - o2.getProductId();
	}

}
