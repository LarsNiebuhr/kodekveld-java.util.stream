package kodekveld1;

import java.util.*;
import java.util.stream.Collectors;

public class Task {
	private static final List<Integer> numbers = Arrays.asList(1,10,100,2,20,3,30,4,5,6,7,8,9,50,40);
	private static final List<String> names = Arrays.asList("Lars","Arne","Hans Ludvig");

	/**
	 * Sort the array numbersUnsoured in ASC order
	 * @return List<Integer>
	 */
	public List<Integer> numbersSortASC(){
		return null;
	}

	/**
	 * Sort the array numbersUnsoured in DESC order
	 * @return List<Integer>
	 */
	public List<Integer> numbersSortDESC(){
		return null;
	}

	/**
	 * Return the sum of all elements in the list
	 * @return int
	 */
	public Integer numbersSum(){
		return null;
	}

	/**
	 * Return the names sorted in ASC order
	 * @return List<String>
	 */
	public List<String> namesASC(){
		return null;
	}

	/**
	 * Interfaces for tasks about Lambda functions
	 */
	@FunctionalInterface
	interface InterfaceAnonymousLambdaFunction {
		//A method with no parameter
		public String sayHello();
	}
	/**
	 * Using an anonymous Lambda function return a String that reads "Hello Cap"
	 * @return String
	 */
	String anonymousLambdaFunction() {
		return null;
	}

	@FunctionalInterface
	interface DoubleValueInterface {
		public int doubleValue(int number);
	}
	int doubleValue() {
		return 0;
	}

	@FunctionalInterface
	interface StringConcatInterface {
		public String stringConcat(String a, String b);
	}
	String StringConcat() {
		return null;
	}

	/**
	 * Using both streams and Lambda return the sum of the number array
	 * @return int
	 */
	public int sumOfNumbers(){
		return numbers.stream().mapToInt(number -> number).sum();
	}

	public void createMap() {
		Map<Integer,String> map = new HashMap<Integer,String>();
		numbers.forEach(number -> {

		});
	}



}
