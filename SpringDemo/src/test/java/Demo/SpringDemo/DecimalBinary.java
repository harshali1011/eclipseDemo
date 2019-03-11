package Demo.SpringDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DecimalBinary {
public void binary(int num) {
	ArrayList<Integer> bin= new ArrayList<Integer>();
	int  a;
	while(num>0) {
		a=num%2;
		bin.add(a);
		num=num/2;
	
		
	}
	Collections.reverse(bin);
	System.out.println("Binary number"+ bin);
	
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DecimalBinary d= new DecimalBinary();
d.binary(26);
	}

}
