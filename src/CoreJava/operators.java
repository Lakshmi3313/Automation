package CoreJava;

public class operators {

	public static void main(String[] args) {
		// Arithmetic Operators
		int a =20;
		int b =40;
		
		System.out.println(a+b); //60
		System.out.println(a-b); //-20
		System.out.println(a*b); //800
		System.out.println(a/b); //0
		System.out.println(a%b); //20
		
		// Comparison Operators
		System.out.println(a>b); //false
		System.out.println(a<b); //true
		System.out.println(a!=b); //true
		System.out.println(a==b);//false
	
		// Logical Operators
		boolean x =true;
		boolean y =false;
		
		System.out.println(x&&y); //false
		System.out.println(x||y); //true
		System.out.println(!x);  //false
		System.out.println(!y);  //true
		
		//Incremental Operators
		int i=10;
		i++; // i=i+1; 
		System.out.println(i); //11
		i--;  // i=i-1;
		System.out.println(i); //10
		i+=5;
		System.out.println(i); //15
		++i;
		System.out.println(i); //16
		i=i+5;
		System.out.println(i); //21
		i-=5;
		System.out.println(i); //16

	}

}
