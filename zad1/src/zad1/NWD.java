package zad1;
import java.io.*;

public class NWD {
	int nwd(int a, int b){
		if (b == 0) return a;
	    else return (nwd (b, a % b));
	}
}
