package project;

public class project {

	public static void main(String[] args) {
		// variable declaration-invalid
		//int for=13;  -keyword should not be as a variable
		//int num 1=13;  keyword should not take any space
		int $num1 = 23;
		int num = 15/2;
	 float num1 = 15/6;
		
    System.out.println($num1);
    System.out.println(num);
    System.out.println(num1);
    int radius=10;
    double percentage = 3.14*radius*radius;
    System.out.println(percentage);
    char ch='a';
    System.out.println(ch);
    char ch1=65;
    System.out.println(ch1);
    char var1='a';
    System.out.println(var1);
    		
    //byte takes 1 byte
    byte byteMax=127;
    byte byteMin=-128;
    System.out.println("min range of byte"+byteMax);
    System.out.println("min range of byte"+byteMin);
    
    //short takes 2 byte
    short shortMax=32767;
    short shortMin=-32768;
    System.out.println("min range of short"+shortMax);
    System.out.println("min range of short"+shortMin);
    
    //int takes 4 byte  //range bten -2147483648 to 2147483647
    //long takes 8 bytes // range bten 
    
	}

}
