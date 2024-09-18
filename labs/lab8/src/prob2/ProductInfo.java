package prob2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductInfo {
	static enum SortMethod {
		BYPRICE, BYTITLE
	};

	public void sortC(List<Product> products, SortMethod method) {
		class ProductComparator implements Comparator<Product> {
			@Override
			public int compare(Product p1, Product p2) {
				if (method == SortMethod.BYTITLE) {
					return p1.title.compareTo(p2.title);
				} else {
					return Double.compare(p1.getPrice(), p2.getPrice());
				}
			}
		}
		Collections.sort(products, new ProductComparator());
	}

	public void sortD(List<Product> products, SortMethod method) {
		Collections.sort(products, (p1, p2) -> {
			if (method == SortMethod.BYTITLE) {
				return p1.title.compareTo(p2.title);
			} else {
				return Double.compare(p1.getPrice(), p2.getPrice());
			}
		});
	}
}
