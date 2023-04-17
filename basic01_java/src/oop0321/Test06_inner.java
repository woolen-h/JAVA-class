package oop0321;

import oop0321.WebProgram.Language;
import oop0321.WebProgram.Smart;

public class Test06_inner {

	public static void main(String[] args) {
		// inner class
		WebProgram web = new WebProgram();
		web.print();
		// Language lang = new Language(); 
		// Smart sm = new Smart();			내부 직접 접근 불가
		Language lang = new WebProgram().new Language();
		lang.display();
		Smart sm = new WebProgram().new Smart();
		sm.display();
		
		
	}

}
