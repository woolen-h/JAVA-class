package oop0322;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.xml.sax.HandlerBase;

public class Test02_SetMap {

	public static void main(String[] args) {
		// 2. Set : 순서가 없다
		Set set = new HashSet();
		set.add(3);
		set.add(2.4);
		set.add('R');
		set.add("busan");
		set.add(new Integer(7));
		
		System.out.println(set.size());
		
		// cursor : 요소 있으면 t 없으면 f
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			// 커서가 가리키는 요소
			Object obj = iter.next();
			System.out.println(obj);
		}
		// 3. Map계열 : 순서가 없다
		/*HashMap map = new HashMap();
		map.put("one", 3);
		map.put("two", 2.4);
		map.put("three", 'r');
		map.put("four", "손흥민");
		
		System.out.println(map.size());
		System.out.println(map.get("four"));
		map.put("four", "박지성");
		System.out.println(map.get("four"));*/
		
		// 문 ) = 문자를 기준으로 문자열을 분리, = 앞의 문자열은 key, = 뒤의 문자열은 value로 구분해서 hm에 저장하고
		// hm의 key값들 중에서 "read.do"를 호출하면 value 값으로 net.bbs.Read 출력하시오
		HashSet<String> command = new HashSet<>();
		command.add("list.do=net.bbs.List");
		command.add("read.do=net.bbs.Read");
		command.add("write.do=net.bbs.Write");
		System.out.println(command.size());
		HashMap<String, String> hm = new HashMap<>();
		// = 문자를 기준으로 문자열을 분리하여 hm에 저장
		for (String cmd : command) {
		    String[] keyValue = cmd.split("=");
		    if (keyValue.length == 2) {
		        hm.put(keyValue[0], keyValue[1]);
		    }
		}

		// hm의 key값들 중에서 "read.do"를 호출하면 value 값으로 net.bbs.Read 출력
		String value = hm.get("read.do");
		if (value != null) {
		    System.out.println(value);
		} else {
		    System.out.println("Key not found in HashMap.");
		}
		
	}//main

}//class
