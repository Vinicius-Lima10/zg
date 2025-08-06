package projeto0;

public class Main
{
	public static void main(String[] args) {
	    int numero = 1000;
	    int result = 0;
	    for(int i = 0; i <1000; i++) {
	       if(i % 3 == 0 || i % 5 ==0) {
	           result += i;
	       }  
	    }
		System.out.println(result);
	}
}