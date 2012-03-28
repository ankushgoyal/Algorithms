package me.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author agoyal
 *
 * @param <T>
 */
public class Mergesort<T extends Comparable<T>> {
	
	public List<T> sort(List<T> input) {
		
		if(input.size() <= 1) {
			return input;
		} else {
			int mid = input.size() % 2 == 0 ? input.size() / 2 : (input.size() + 1) / 2;
			List<T> left = input.subList(0, mid);
			List<T> right = input.subList(mid, input.size());
			return merge(sort(left), sort(right));
		}
		
	}
	
	private List<T> merge(List<T> left, List<T> right) {
		List<T> output = new ArrayList<T>();
		int i = 0;
		int j = 0;
		while((i < left.size()) && (j < right.size())) {
			if(left.get(i).compareTo(right.get(j)) <= 0) {
				output.add(left.get(i));
				i++;
			} else {
				output.add(right.get(j));
				j++;
			}
		}
		
		if(i < left.size()) {
			while(i < left.size()) {				
				output.add(left.get(i));
				i++;
			}
		} else if(j < right.size()) {
			while(j < right.size()) {
				output.add(right.get(j));
				j++;
			}
		}
		
		return output;
	}

}
