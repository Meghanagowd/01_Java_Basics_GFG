public class MiddleOfThree {
  public static void main(String args[]){
    int a  =234;
    int b = 456;
    int c = 563;
    if((a > b && a < c) || (a > c && a < b))
             System.out.println("middle number is : "+a);
            
        else if((b > a && b < c) || (b > c && b < a))
             System.out.println("middle number is : "+b);
            
        else
            System.out.println("middle number is : "+c);
    }


}
