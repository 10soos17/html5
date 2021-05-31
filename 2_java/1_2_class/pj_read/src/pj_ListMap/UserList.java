package pj_ListMap;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class UserList<T2> {

	private int number;
	private String id;
	private T2 mList;
	private HashMap<Integer, T2> mMap = new HashMap<>();


	public void customAdd(String name, Integer age) {
		
		this.mList = (T2) Arrays.asList(name, age);
		mMap.put(number, this.mList);
		
		this.id = name + number;
		this.number += 1;
		//getId();
		
	}

	public String getId() {// (String name, Integer age)
		System.out.println("id: "+this.id);
		return this.id;
	}

	public void search(T2 mList) {// (String name, Integer age)

		for (Integer key : mMap.keySet()) {
			T2 values = mMap.get(key);

			// if (((List) values).get(0).equals(name) && ((List)
			// values).get(1).equals(age)) {
			if (values.equals(mList)) {
				System.out.println("this" + values);
				break;
			}
		}
	}

	public HashMap<Integer, T2> getMap() {
		System.out.println(this.mMap);
		return this.mMap;
	}

}
