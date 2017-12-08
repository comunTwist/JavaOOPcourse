//Создать массив размером int 200000, заполнить случайными числами и вывести статистику по частоте повторения

package com.gmail.agentup;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		int[] randomArray = new int[200000];
		Map<Integer, Integer> statistic = new HashMap<>();
		getStatistic(setStatistic(randomArray, statistic));
	}

	public static Map<Integer, Integer> setStatistic(int[] array, Map<Integer, Integer> map) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
			if (map.get(array[i]) == null) {
				map.put(array[i], 1);
			} else {
				int count = map.get(array[i]) + 1;
				map.put(array[i], count);
			}
		}
		return map;
	}

	public static void getStatistic(Map<Integer, Integer> map) {
		Set<Integer> keySet = map.keySet();
		for (Integer element : keySet) {
			System.out.println(element + " -> " + map.get(element));
		}
	}
}
