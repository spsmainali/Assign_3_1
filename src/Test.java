//Following Program get compiled without error but while running it shows main method not found in class Test.
// The output would be 10 if java would be older than jdk 1.7 

public class Test{
	static {
		print(10);
	}
	static void print(int x){
		System.out.println(x);
		System.exit(0);
	}
	public static void main(String[] args){
		Test a = new Test();// during object creation the print method inside static block is called.
		a.print(120);//even after calling method here but since print(10) is priority method as its in static block so it will run and give o/p prints 10
	}
}// after printing 10 the control is not moved to a.print(120) as there is System.exit(0) function is invoked  which exits the progam.