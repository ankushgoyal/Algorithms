package me.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author agoyal
 *
 * @param <T>
 */
public class Insertionsort<T extends Comparable<T>> {
	
	public List<T> sort(List<T> input) {
		
		List<T> output = new ArrayList<T>();
		
		for(int i = 0; i < input.size(); i++) {
			if(output.size() == 0) {
				output.add(input.get(i));
				continue;
			}
			
			T currentElem = input.get(i);
			for(int j = 0; j < output.size(); j++) {
				if(output.get(j).compareTo(currentElem) > 0) {
					List<T> tmpList = new ArrayList<T>();
					boolean notAdded = true;
					
					for(int k = 0; k < output.size(); k++){
						if(k == j && notAdded) {
							tmpList.add(currentElem);
							k--;
							notAdded = false;
							continue;
						}
						tmpList.add(output.get(k));
					}
					
					output = tmpList;
					break;
				}
			}
			if(!output.contains(currentElem)) {
				output.add(currentElem);
			}
		}
		
		return output;
	}

}
