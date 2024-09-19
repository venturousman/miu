package prob9;

import java.util.Optional;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// a. Is there any Vegetarian meal available (return type boolean)
		boolean isAnyVegetarianMeal = Dish.menu.stream().anyMatch(d -> d.isVegetarian());
		System.out.println("a. Is there any Vegetarian meal available? " + isAnyVegetarianMeal);

		// b. Is there any healthy menu have calories less than 1000 (return a boolean)
		boolean isAnyHealthyMenuWithCaloriesLessThan1000 = Dish.menu.stream().anyMatch(d -> d.getCalories() < 1000);
		System.out.println("b. Is there any healthy menu have calories less than 1000? "
				+ isAnyHealthyMenuWithCaloriesLessThan1000);

		// c. Is there any unhealthy menu have calories greater than 1000 (return a
		// boolean)
		boolean isAnyUnhealthyMenuWithCaloriesGreaterThan1000 = Dish.menu.stream()
				.anyMatch(d -> d.getCalories() > 1000);
		System.out.println("c. Is there any unhealthy menu have calories greater than 1000? "
				+ isAnyUnhealthyMenuWithCaloriesGreaterThan1000);

		// d. find and return the first item for the type of MEAT (return type
		// Optional<Dish>)
		Optional<Dish> firstMeatItem = Dish.menu.stream().filter(d -> d.getType() == Dish.Type.MEAT).findFirst();
		System.out.println("d. The first item for the type of MEAT: " + firstMeatItem.get());

		// e. calculateTotalCalories() in the menu using reduce. (return int)
		int totalCalories = Dish.menu.stream().map(d -> d.getCalories()).reduce(0, (a, b) -> a + b);
		System.out.println("e. Calculate total calories in the menu using reduce: " + totalCalories);

		// f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences.
		// (return int)
		int totalCalories2 = Dish.menu.stream().map(Dish::getCalories).reduce(0, Integer::sum);
		System.out.println("f. Calculate total calories in the menu using MethodReferences: " + totalCalories2);
	}

}
