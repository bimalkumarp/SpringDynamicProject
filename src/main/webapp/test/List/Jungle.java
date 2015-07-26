package main.webapp.test.List;

import java.util.List;
import java.util.Map;

public class Jungle {

	private Animal largest;
	private List<Animal> animals;
	private Map<String, String> foods;
	private Map<String, Animal> animalsMap;

	public Map<String, Animal> getAnimalsMap() {
		return animalsMap;
	}

	public void setAnimalsMap(Map<String, Animal> animalsMap) {
		this.animalsMap = animalsMap;
	}

	public Map<String, String> getFoods() {
		return foods;
	}

	public void setFoods(Map<String, String> foods) {
		this.foods = foods;
	}

	public Animal getLargest() {
		return largest;
	}

	public void setLargest(Animal largest) {
		this.largest = largest;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("largest Animal :" + largest);
		sb.append("\n");
		sb.append("Others :\n");

		for (Animal animal : animals) {
			sb.append("name: " + animal.getName() + "\n");
			sb.append("type: " + animal.getType() + "\n");
		}

		sb.append("Foods :\n");

		for (Map.Entry<String, String> entry : foods.entrySet()) {
			sb.append(entry.getKey() + "  ");
			sb.append(entry.getValue() + "\n");

		}

		sb.append("Animals Map :\n");

		for (Map.Entry<String, Animal> entry : animalsMap.entrySet()) {
			sb.append(entry.getKey() + "  ");
			sb.append(entry.getValue() + "\n");

		}

		return sb.toString();
	}

}
