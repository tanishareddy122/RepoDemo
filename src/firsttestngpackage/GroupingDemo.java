package firsttestngpackage;

import org.testng.annotations.Test;

public class GroupingDemo {
@Test(groups="smoke")
public void m1() {
	System.out.println("m1");
}
@Test(groups="sanity")
public void m2() {
	System.out.println("2");
}
@Test(groups="functional")
public void m3() {
	System.out.println("3");
}
@Test(groups="regression")
public void m4() {
	System.out.println("4");
}
@Test(groups= {"smoke", "sanity"})
public void m5() {
	System.out.println("5");
}
@Test(groups="smoke")
public void m6() {
	System.out.println("6");
}
@Test(groups="smoke")
public void m7() {
	System.out.println("7");
}
}
