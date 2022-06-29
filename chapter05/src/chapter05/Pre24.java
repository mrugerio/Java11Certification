package chapter05;

import java.util.*;

public class Pre24 {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(new Integer[]{2,3});

		List<Double> doubleList = List.of(new Double[]{2.5,3.1});
		
		System.out.println(intList.getClass().getName());
		System.out.println(doubleList.getClass().getName());

	}
	
	

}
