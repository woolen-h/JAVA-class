package oop0322;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;



public class Test03_generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] num = new int[3];
		Vector<String> vec = new Vector<>();
		vec.add("개나리");
		vec.add("진달래");
		vec.add(new String("무궁화"));
		for(int i=0; i<vec.size(); i++) {
			String str = vec.get(i);
			System.out.println(str);
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(new Integer(5));
		list.add(2.4);
		list.add("KOREA");
		
		HashSet<Double> set = new HashSet<>();
		set.add(3.1);
		set.add(new Double(3.5));
		set.add(2.4);
		set.add("KOREA");
		
		HashMap<String, Character> map = new HashMap<>();
		map.put("one", 'r');
		map.put("two", new Character('r'));
		System.out.println(map.get("one"));*/
	
		
		
	}
	
	public class Mountain {
	    public String name;
	    public int height;

	    public Mountain(String name, int height) {
	        this.name = name;
	        this.height = height;
	        Mountain m1 = new Mountain ("한라산", 1950);
	    	Mountain m2 = new Mountain ("관악산", 1500);
	    	Mountain m3 = new Mountain ("북한산", 1000);
	    	
	    	ArrayList<Mountain> item = new ArrayList<>();
	    	item.add(m1);
	    	item.add(m2);
	    	item.add(m3);
	    	
	    	for(int i=0; i<item.size(); i++) {
	    		Mountain m = item.get(i);
	    		System.out.println(m.name);
	    		System.out.println(m.height);
	    	}
    		}}}
public class Main {
    public static void main(String[] args) {
        Mountain m1 = new Mountain("한라산", 1950);
        Mountain m2 = new Mountain("관악산", 1500);
        Mountain m3 = new Mountain("북한산", 1000);

        ArrayList<Mountain> item = new ArrayList<>();
        item.add(m1);
        item.add(m2);
        item.add(m3);

        for (int i = 0; i < item.size(); i++) {
            Mountain m = item.get(i);
            System.out.println(m.name);
            System.out.println(m.height);
        }
    }
}