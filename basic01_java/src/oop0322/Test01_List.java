package oop0322;

import java.awt.List;
import java.util.ArrayList;
import java.util.Vector;

public class Test01_List {

	public static void main(String[] args) {
		// Java Collection Framework
		/*
		 * interfacce List {}
		 * class Vector implements List {}
		 * class ArrayList implements List {}
		 * interface Set {}
		 * class HashSet implements Set {}
		 * */
		int[] num = new int[100];
		// 1. List 계열
		Vector vec = new Vector();
		vec.add(3);
		vec.add(2.4);
		vec.add("KOREA");
		vec.add('r');
		vec.add(new Integer(6));
		vec.add(new Double(6.7));
		
		System.out.println(vec.size());
		for(int i=0; i<vec.size(); i++) {
			System.out.println(vec.get(i));
		}
		vec.remove(0);
		System.out.println(vec.size());
		
		vec.removeAllElements();
		System.out.println(vec.size());
		
		if(vec.isEmpty()) {
			System.out.println("비어 있다");
		} else {
			System.out.println("비어 있지 않다");
		}
		ArrayList<Object> list = new ArrayList<>();
		list.add(5);
		list.add(6.7);
		list.add('a');
		list.add("seoul");
		System.out.println(list.size());
		// 문 remove() 이용하여 list 요소를 전부 삭제하시오
		for(int i=0; i<list.size(); i++) {
			list.remove(i);
			}
		System.out.println(list.size());
	}
	
	

}
