
import java.io.FileNotFoundException;
import java.util.Scanner; 


public class keyboard {

       public static void main (String Args[]) throws FileNotFoundException{

        // creates new product objects that will select a product
        register product1 = new register(); 
        register product2 = new register();
        register product3 = new register();
       
        // creates scanner for input for selection
        try (Scanner input = new Scanner(System.in)) {
        
        //initialize the selection variables for each product object
        int selection = 0;
        int selection2 = 0;
        int selection3 = 0;
        
        // receive user input for which  item  to select 
        System.out.print("Enter product ID number( 1234= apple, 4567=banana, 8910=tomatoe): ");
            // check to make sure input is integer receive input based on integer entered and corresponding product
            if (input.hasNextInt()) {
                selection = input.nextInt();
            }
        // will process user input based on what kind of item they want 
        product1.getProductItem(selection); 
    
    
            System.out.print("Enter product ID number( 1234= apple, 4567=banana, 8910=tomatoe): ");
            if (input.hasNextInt()) {
                selection2 = input.nextInt();
             }
        // will process user input based on what kind of itemthey want     
        product2.getProductItem(selection2); 
    
    
            System.out.print("Enter product ID number( 1234= apple, 4567=banana, 8910=tomatoe): ");
            if (input.hasNextInt()) {
            selection3 = input.nextInt();
            }
        // will process user input based on what kind of item  they want     
        product3.getProductItem(selection3); // will process user input based on what kind of item  they want 
        }
      }
}


