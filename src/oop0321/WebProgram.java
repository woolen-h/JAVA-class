package oop0321;
// .jsp .py
class WebProgram {
	String title = "Java Program";
	class Language {
		String basic = "JAVA, HTML, CSS, JavaScript";
		void display () {
			System.out.println("기초수업 : "+basic);
		}
	} // inner class
	class Smart {
		String basic = "Objective-C, Java OOP, C#";
		void display () {
			System.out.println("기초수업 : "+basic);
	}
}
	void print() {
		Language lang = new Language();
		lang.display();
		Smart sm = new Smart();
		sm.display();
	}
}

