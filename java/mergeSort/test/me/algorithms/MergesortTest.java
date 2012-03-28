package me.algorithms;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author agoyal
 *
 */
public class MergesortTest {
	
	public Mergesort sorter;

	@Before
	public void setUp() throws Exception {
		sorter = new Mergesort();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test_emptyList() {
		List<Integer> input = new ArrayList<Integer>();
		List<Integer> out = sorter.sort(input);
		assertEquals(0, out.size());
	}
	
	@Test
	public void test_oneElementList() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(new Integer(1));
		List<Integer> out = sorter.sort(input);
		assertEquals(1, out.size());
		assertEquals(out.get(0), input.get(0));
	}
	
	@Test
	public void test_ListWithDistinctElements() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(new Integer(1));
		input.add(new Integer(5));
		input.add(new Integer(2));
		input.add(new Integer(4));
		List<Integer> out = sorter.sort(input);
		assertEquals(4, out.size());
		assertEquals(out.get(0), new Integer(1));
		assertEquals(out.get(1), new Integer(2));
		assertEquals(out.get(2), new Integer(4));
		assertEquals(out.get(3), new Integer(5));
	}
	
	@Test
	public void test_ListWithNonDistinctElements() {
		List<Integer> input = new ArrayList<Integer>();
		input.add(new Integer(1));
		input.add(new Integer(5));
		input.add(new Integer(2));
		input.add(new Integer(2));
		input.add(new Integer(4));
		List<Integer> out = sorter.sort(input);
		assertEquals(5, out.size());
		assertEquals(out.get(0), new Integer(1));
		assertEquals(out.get(1), new Integer(2));
		assertEquals(out.get(2), new Integer(2));
		assertEquals(out.get(3), new Integer(4));
		assertEquals(out.get(4), new Integer(5));
	}
	
	@Test
	public void test_ListWithNonIntElements() {
		List<String> input = new ArrayList<String>();
		input.add("AB");
		input.add("CD");
		input.add("BS");
		input.add("FD");
		input.add("ED");
		List<Integer> out = sorter.sort(input);
		assertEquals(5, out.size());
		assertEquals(out.get(0), "AB");
		assertEquals(out.get(1), "BS");
		assertEquals(out.get(2), "CD");
		assertEquals(out.get(3), "ED");
		assertEquals(out.get(4), "FD");
	}

}
