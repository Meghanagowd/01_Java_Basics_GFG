class TypeConversion {

    public static void main(String[] args) {

         
        int intValue = 0;
        double doubleValue = 0.0;

         
        doubleValue = intValue;      // implicit conversion
       intValue = (int) doubleValue; // explicit conversion

        // Print results
        System.out.println("Integer Value: " + intValue);
        System.out.println("Double Value: " + doubleValue);
    }
}