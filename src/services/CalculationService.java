package services;

import java.util.List;

public class CalculationService {

	public static <T extends Comparable<? super T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("A lista está vazia!");
		}
		T max = list.get(0);
		for (T element : list) {
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}
		return max;
	}
}
