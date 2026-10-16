package HCL_Assessment_2_CoreJava_2300321530082_Harsh_Teotia;

import java.util.*;

import HCL_Assessment_2_CoreJava_2300321530082_Harsh_Teotia.LIbraryItemsManagement.LibraryManager;
public class Library extends LibraryManager {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------Library Management System---------------------------");
        System.out.println("1 - For adding books");
        System.out.println("2 - For deleting books");
        System.out.println("3 - For assigning books");
        System.out.println("4 - For adding magazines");

        boolean flag = true;
        while(flag){
            System.out.println("Enter the above option");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    // LibraryItem admin = new Library();
                    System.out.println("Enter the book id:");
                    int id = sc.nextInt();
                    System.out.println("Enter the book name:");
                    String bookName = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter the book count:");
                    int countOfBooks = sc.nextInt();
                    // admin.addbooks(id, );
                    break;
                case 2:{
                    
                }
            }
        }
    }
}
