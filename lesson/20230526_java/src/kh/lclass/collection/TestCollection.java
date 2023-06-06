package kh.lclass.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;

public class TestCollection {
	
	public <E> String testGeneric(E a) {
		
		System.out.println(a.getClass().getName());
		return a.toString() + "결과값";
	}
	
	
	
	
	
	public void testHashSet() {
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(11);
		integerSet.add(22);
		integerSet.add(33);
		integerSet.add(11);
		System.out.println(integerSet);
		System.out.println(integerSet.size());
		for(Integer item : integerSet) {
			System.out.println(item);
		}
		
		System.out.println("=== Set : Iterator 사용 ===");
		Iterator<Integer> itr = integerSet.iterator();
		System.out.println(itr);
		while(itr.hasNext()) {
			Integer item = itr.next();
			System.out.println(item);
		}
		System.out.println(itr);
	}
	
	
	public void testArrayList() {
		List<String> list = new ArrayList<String>();
		String[] strArr1 = new String[3];
		strArr1[0] = "바나나";
		strArr1[1] = "딸기";
		strArr1[2] = "사과";
		strArr1.clone();
		
		/*
		public class ArrayList implements List{
		 	public boolean add(Object e){
		 		//
		 	}
		 	public boolean add(Integer e){
		 		//
		 	}
		 	public boolean add(Car e){
		 		//
		 	}
		}
		 */
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Car> list3 = new ArrayList<Car>();
		list3.add(new Car(3000));
		list2.add(25);
		list2.add(24);
		list2.add(null);
		list2.add(26);
		list2.add(27);
		list2.add(28);
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		for(int i = 0; i < strArr1.length; i++) {
			System.out.println(strArr1[i]);
		}
		
		
		//enhanced-for
		for(Integer i : list2) {
			System.out.println(i);
		}
		
		list.add("1번");
		list.add("2번");
		list.add("3번");
		list.add("2번");
		list.add(1, "2번대신끼워넣기");
//		list.remove("2번");
		Collection<String> collection1 = new ArrayList<String>();
		collection1.add("2번");
//		collection1.add("3번");
		list.removeAll(collection1);
		((ArrayList<String>) list).clone();

		if (list instanceof ArrayList) {
			@SuppressWarnings("unchecked")
			ArrayList<String> copyList = (ArrayList<String>) (((ArrayList<String>) list).clone());
			System.out.println(copyList);
		}

//		list.remove(0);
//		list.clear();
		System.out.println(list);
	}
}
