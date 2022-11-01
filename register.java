import java.io.FileNotFoundException;

public class register extends keyboard{
      //class that will get value corresponding to integer entered by user    
    //will output to user which product selected
    public void getProductItem(int select) throws FileNotFoundException {
        
        if(select  == 1234 ){  
            System.out.println("You have selected apple product");
            int select1=1;
            // calls register to get information for the product selected
            display.registerDisplay(select1);
            System.out.println("Final price with tax will be $402.50");
            System.out.println("Please pay with debit or credit, thank you for shopping with us");
        }

        else if (select==4567) {
            System.out.println("You have selected banana product ");
            int select2=2;
            // calls register to get information for the product selected
            display.registerDisplay(select2);
            System.out.println("Final price with tax will be $230.00");
            System.out.println("Please pay with debit or credit, thank you for shopping with us");
        }

        else if (select==8910) {
            System.out.println("You have selected tomatoe product ");
            int select3=3;
            // calls register to get information for the product selected
            display.registerDisplay(select3);
            System.out.println("Final price with tax will be $1150.00");
            System.out.println("Please pay with debit or credit, thank you for shopping with us");
        }

        else{
            // will output this if a invalid factory number is entered 
            System.out.println("Invalid product please check back later for updates ");
        }  
    }

   
}
   


