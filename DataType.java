/*
public class DataType {

    public static void main(String[] args) {

        boolean b;
        char c;
        int s = 246345;
        int i = 123456;
        float f = 323.45f;
        double d = 12345.6789;

        b = true;
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("d = " + d);

    }
} */


      /*
 * Assignment-2 (Variable and Data type)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: assign the following data in main method
101,iphone15,1895 euros,perfect product with best image quality, phone,
* step 5: print the data
 */


/*
public class DataType {  //Assignment 2

    public static void main(String[] args) {

        String itle = "iphone17_pro_max";
		String price = "18950 euros";
		String description = "perfect product with best image quality";
		String category = "phone";
		
        System.out.println("itle: " + itle);
        System.out.println("price: " + price);
        System.out.println("description: " + description);
        System.out.println("category: " + category);


    }

    } */

/*

public class DataType { //Format specifier

    public static void main(String[] args){
        boolean b = true;
        char c = 'a';
        float s = 246345.0f;
        float i = 123456.0f;
        float f = 323.45f;
        double d = 12345.6;

        System.out.printf("boolean b = %b\n", b);
        System.out.printf("char c = %c\n", c);
        System.out.printf("float s = %.2f\n", s);   
        System.out.printf("float i = %.2f\n", i);
        System.out.printf("float f = %.2f\n", f);
        System.out.printf("double d = %.4f\n", d);  
    }
} */


/*
import java.util.Scanner;  

public class DataType {

    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);

        String name;

        System.out.print ("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your : "+name);
    }
} */


/*
import java.util.Scanner;

public class DataType { //User Input
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int id, price;
        String title, description, category;

        System.out.print("Enter id : ");
        id = input.nextInt();

        System.out.print("Enter price : ");
        price = input.nextInt();

        input.nextLine(); 

        System.out.print("Enter title : ");
        title = input.nextLine();

        System.out.print("Enter description : ");
        description = input.nextLine();

        System.out.print("Enter category : ");
        category = input.nextLine();

        System.out.println("\n--- Product Information ---");
        System.out.println("ID          : " + id);
        System.out.println("Price       : " + price);
        System.out.println("Title       : " + title);
        System.out.println("Description : " + description);
        System.out.println("Category    : " + category);

        input.close();
    }
} */

public class DataType { 
    public static void main(String[] args) {

        int nubar1, nubar2, result;

        nubar1 = 50;
        nubar2 = 100;

        result = nubar1 + nubar2;
        System.out.println("sum = " + result);

    }
}



































































































































































































































