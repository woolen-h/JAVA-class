package net.testbean;

public class CalcBean {
public int abs(int su) {
	return Math.abs(su);
}//abs()
public long fact(int su) {
	return (su==0) ? 1 : su*fact(su-1);
}//face()
}
