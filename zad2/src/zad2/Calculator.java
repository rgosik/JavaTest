package zad2;

public class Calculator {
	int add(int a, int b){
		return a+b;
	}
	int sub(int a, int b){
		return a -b;
	}
	int multi(int a, int b){
		return a* b;
	}
	int div(int a, int b){
		return a / b;
	}
	boolean greater(int a, int b){
		if(a > b) return true;
		else return false;
	}
	boolean less(int a, int b){
		if (a < b) return true;
		else return false;
	}
	boolean equality(int a, int b){
		if (a == b) return true;
		else return false;
	}
}
