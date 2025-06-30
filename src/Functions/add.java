
public class add {
    
    public static void sum(int x ,int y) {
        
        int sum = x + y ;
        System.out.println( "Sum is : "+ sum);
    }
    public static void main(String[] args) {
        
        int a = 10,b = 20;
        sum(a ,b);
        int ans = returnIntSubtract( a,b);  // this function return a value of type integer 
        System.out.println( "Subtract is : " + ans);
    }
    public static int returnIntSubtract(int a ,int b ) {
        int subtract = a -b ;
        return subtract;
    }
  } 
    
