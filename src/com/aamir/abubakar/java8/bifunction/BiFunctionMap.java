package com.aamir.abubakar.java8.bifunction;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "Ab");
		map.put(102, "u");
		map.put(103, "bakar");
		Map<Integer, String> map2 = new HashMap<>(map);
		map2.put(104,"Abu");
		map2.put(105,"Ba");
		map2.put(106,"kar");  
		 Map<Integer, String> mergedMap = mergeMaps(map, map2, (v1, v2) -> v1 + v2);
		 System.out.println(mergedMap);
	}
		public static <K, V> Map<K, V> mergeMaps(Map<K, V> map1, Map<K, V> map2, BiFunction<? super V, ? super V, ? extends V> mergeFunction) {
	        Map<K, V> result = new HashMap<>(map1);
			return result;
	}

}
