package oop0320;

class Parent {
int one, two;
public Parent() {}
public Parent(int one, int two) {
	this.one=one;
	this.two=two;
}
}
class Child extends Parent{
int three;
public Child() {
	
}
public Child(int a, int b, int c) {
	/*super.one=a;
	super.two=b;*/
	super(a,b); 
	this.three=c;
}
}