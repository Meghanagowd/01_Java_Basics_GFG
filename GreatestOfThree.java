class GreatestOfThree {

    public static void main(String[] args) {

        // Declare three numbers
        int a = 23;
        int b = 100;
        int c = 56;
         int greatest ;
         if(a>b && a>c)
           greatest=a;
        else if(b>a && b>c)
          greatest = b;
        else 
          greatest=c;  
         

         
        System.out.println("Greatest Number: " +greatest);
    }
}