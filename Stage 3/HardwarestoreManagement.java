package com.mycompany.hardwarestoremanagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

/**
 *
 * @author Kayla Van Curen
 */
public class HardwarestoreManagement {

    //this is the main class that takes you to the login menu
    public static void main(String[] args) {
        
        LoginMenu(); //this creates a new login in menu object
        
    }
    
    public static void LoginMenu(){
    
        Scanner in = new Scanner(System.in);
        int option;
        
        System.out.println("Login Menu: ");
        System.out.println("1. Employee Menu");
        System.out.println("2. Manager Menu");
        System.out.println("3. Exit");
        System.out.println("Select an option: ");
        option = in.nextInt();
        
        switch(option){
        
            case 1 : 
                EmployeeMenu();
                break;
            case 2 : 
                ManagerMenu();
                break;
            case 3 : 
                System.out.println("Exiting program. Goodbye.");
                break;
            default : 
                System.out.println("Please choose a vaild option.");
                LoginMenu();
                break;
        
        }
    
    }
    
    public static void EmployeeMenu(){

        Scanner in = new Scanner(System.in);
        int option;
        
        System.out.println("Employee Menu: ");
        System.out.println("1. Items Menu");
        System.out.println("2. Customer Menu");
        System.out.println("3. Checkout");
        System.out.println("4. Back");
        System.out.println("5. Exit");
        option = in.nextInt();
        
        switch(option){
        
            case 1 : 
                ItemMenu();
                break;
            case 2 : 
                CustomerMenu();
                break;
            case 3 : 
                Checkout();
                break;
            case 4 :
                LoginMenu();
                break;
            case 5 : 
                System.out.println("Goodbye.");
                System.exit(0);
                break;
            default : 
                System.out.println("Please select a valid option.");
                EmployeeMenu();
                break;
        }
    
    }
    
    public static void ManagerMenu(){
    
        Scanner in = new Scanner(System.in);
        int option;
        
        System.out.println("Manager Menu: ");
        System.out.println("1. Item Menu");
        System.out.println("2. Customer Menu");
        System.out.println("3. Checkout");
        System.out.println("4. Employee Edit Menu");
        System.out.println("5. Manager Edit Menu");
        System.out.println("6. Back");
        System.out.println("7. Exit");
        option = in.nextInt();
        
        switch(option){
        
            case 1 :
                ItemMenu();
                break;
            case 2 : 
                CustomerMenu();
                break;
            case 3 : 
                Checkout();
                break;
            case 4 : 
                EmployeeEditMenu();
                break;
            case 5 : 
                ManagerEditMenu();
                break;
            case 6 :
                LoginMenu();
                break;
            case 7 : 
                System.out.println("Goodbye.");
                System.exit(0);
                break;
            default : 
                System.out.println("Please select a valid option.");
                ManagerMenu();
                break;
        
        }
    
    }
    
    public static void ItemMenu(){
    
        Scanner in = new Scanner(System.in);
        int option;
        
        System.out.println("Items Menu: ");
        System.out.println("1. Lookup Item");
        System.out.println("2. Edit Item");
        System.out.println("3. Add Item");
        System.out.println("4. Remove Item");
        System.out.println("5. Back to Employee Menu");
        System.out.println("6. Back to Manager Menu");
        System.out.println("7. Exit");
        option = in.nextInt();
        
        switch(option){
        
            case 1 : 
                lookupItem();
                break;
            case 2 :
                editItem();
                break;
            case 3 :
                addItem();
                break;
            case 4 :
                removeItem();
                break;
            case 5 :
                EmployeeMenu();
                break;
            case 6 : 
                ManagerMenu();
                break;
            case 7 : 
                System.out.println("Goodbye.");
                System.exit(0);
                break;
            default : 
                System.out.println("Please select a valid option.");
                ItemMenu();
                break;
        
        }
    
    }
    
    public static void CustomerMenu() {
    
        Scanner in = new Scanner(System.in);
        int option;
        
        System.out.println("Customer Menu: ");
        System.out.println("1. Lookup Customer");
        System.out.println("2. Edit Customer");
        System.out.println("3. Add Customer");
        System.out.println("4. Remove Customer");
        System.out.println("5. Back to Employee Menu");
        System.out.println("6. Back to Manager Menu");
        System.out.println("7. Exit");
        option = in.nextInt();
        
        switch(option){
        
            case 1 : 
                lookupCustomer();
                break;
            case 2 :
                editCustomer();
                break;
            case 3 :
                addCustomer();
                break;
            case 4 :
                removeCustomer();
                break;
            case 5 :
                EmployeeMenu();
                break;
            case 6 : 
                ManagerMenu();
                break;
            case 7 : 
                System.out.println("Goodbye.");
                System.exit(0);
                break;
            default : 
                System.out.println("Please select a valid option.");
                CustomerMenu();
                break;
        
        }
    
    }
    
    public static void Checkout(){
    
        Scanner in = new Scanner(System.in);
        int option;
        
        System.out.println("Checkout: ");
        System.out.println("1. Lookup Customer");
        System.out.println("2. Edit Purchase");
        System.out.println("3. Add Item to Purchase");
        System.out.println("4. Remove Item to Purchase");
        System.out.println("5. Total");
        System.out.println("6. Back to Employee Menu");
        System.out.println("7. Back to Manager Menu");
        System.out.println("8. Exit");
        option = in.nextInt();
        
        switch(option){
        
            case 1 : 
                lookupCustomer();
                break;
            case 2 :
                editItemtoPurchase();
                break;
            case 3 :
                addItemtoPurchase();
                break;
            case 4 :
                removeItemtoPurchase();
                break;
            case 5 :
                Total();
                break;
            case 6 :
                EmployeeMenu();
                break;
            case 7 : 
                ManagerMenu();
                break;
            case 8 : 
                System.out.println("Goodbye.");
                System.exit(0);
                break;
            default : 
                System.out.println("Please select a valid option.");
                Checkout();
                break;
        
        }
    
    }
    
    public static void EmployeeEditMenu(){
    
        Scanner in = new Scanner(System.in);
        int option; 
        
        System.out.println("Employee Edit Menu: ");
        System.out.println("1. Add Employee");
        System.out.println("2. Remove Employee");
        System.out.println("3. Edit Employee Information");
        System.out.println("4. Back");
        System.out.println("5. Exit");
        option = in.nextInt();
        
        switch(option){
        
            case 1 : 
                addEmployee();
                break;
            case 2 :
                removeEmployee();
                break;
            case 3 :
                editEmployee();
                break;
            case 4 : 
                ManagerMenu();
                break;
            case 5 : 
                System.out.println("Goodbye.");
                System.exit(0);
                break;
            default : 
                System.out.println("Please select a valid option.");
                ItemMenu();
                break;
        
        }
    
    }
    
    public static void ManagerEditMenu(){
    
        Scanner in = new Scanner(System.in);
        int option; 
        
        System.out.println("Manager Edit Menu: ");
        System.out.println("1. Add Manager");
        System.out.println("2. Remove Manager");
        System.out.println("3. Edit Manager Information");
        System.out.println("4. Back");
        System.out.println("5. Exit");
        option = in.nextInt();
        
        switch(option){
        
            case 1 : 
                addManger();
                break;
            case 2 :
                removeManager();
                break;
            case 3 :
                editManager();
                break;
            case 4 : 
                ManagerMenu();
                break;
            case 5 : 
                System.out.println("Goodbye.");
                System.exit(0);
                break;
            default : 
                System.out.println("Please select a valid option.");
                ItemMenu();
                break;
        
        }
    
    }

    public static void lookupItem() {
        
        Scanner in = new Scanner(System.in);
        String itemsnames;
        
        System.out.println("Please enter the name of item you are looking up: ");
        itemsnames = in.nextLine();
        
        ArrayList<String> itemnames = new ArrayList<>();
        itemnames.add("Hammer");
        itemnames.add("Drill");
        itemnames.add("Nails");

        if (itemnames.contains(itemsnames)) {
            System.out.println("Found!");
        }
        else{
            System.out.println("Item not found.");
        }
        
        HashMap<String, Integer> item = new HashMap<>();
        item.put("Hammer", 1);
        item.put("Drill", 2);
        item.put("Nails", 3);

        if (item.containsKey(itemsnames)) {
            System.out.println("The aisle that item is on is: " + item.get(itemsnames));
        }
        ItemMenu();
    }

    public static void editItem() {
        
        ArrayList<String> itemnames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("List: " + itemnames);
            System.out.println("1. Edit item");
            System.out.println("2. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter index of item to edit: ");
                int index = scanner.nextInt();

                if (index < 0 || index >= itemnames.size()) {
                    System.out.println("Invalid index.");
                } else {
                    System.out.print("Enter new value: ");
                    scanner.nextLine(); // Consume leftover newline
                    String newValue = scanner.nextLine();
                    itemnames.set(index, newValue);
                }
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        ItemMenu();
    }

    public static void addItem() {
        
        ArrayList<String> itemnames = new ArrayList<>();
        String itemsnames;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter item to add (or 'q' to quit): ");
            itemsnames = in.nextLine();
            
            if (itemsnames.equalsIgnoreCase("q")) {
                break; // Exit the loop if the user enters 'q'
            }

            itemnames.add(itemsnames);
            System.out.println("List: " + itemnames);
        }
        ItemMenu();
    }

    public static void removeItem() {
        
        ArrayList<String> itemnames = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("List: " + itemnames);
        System.out.print("Enter item to remove: ");
        String itemToRemove = scanner.nextLine();

        if (itemnames.remove(itemToRemove)) {
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found in the list.");
        }

        System.out.println("Updated list: " + itemnames);
        ItemMenu();
    }

    public static void lookupCustomer() {
        
        Scanner in = new Scanner(System.in);
        String cusomtersnames;
        
        System.out.println("Please enter the name of the customer you are looking up: ");
        cusomtersnames = in.nextLine();
        
        ArrayList<String> customernames = new ArrayList<>();
        customernames.add("Amber");
        customernames.add("Kyla");
        customernames.add("Paul");

        if (customernames.contains(cusomtersnames)) {
            System.out.println("Found!");
        }
        else{
            System.out.println("Customer not found.");
        }
        
        HashMap<String, Integer> customer = new HashMap<>();
        customer.put("Amber", 1);
        customer.put("Kyla", 2);
        customer.put("Paul", 3);

        if (customer.containsKey(cusomtersnames)) {
            System.out.println("The person that is a member: " + customer.get(cusomtersnames));
        }
        CustomerMenu();
    }

    public static void editCustomer() {
        
        ArrayList<String> customernames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("List: " + customernames);
            System.out.println("1. Edit item");
            System.out.println("2. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter index of item to edit: ");
                int index = scanner.nextInt();

                if (index < 0 || index >= customernames.size()) {
                    System.out.println("Invalid index.");
                } else {
                    System.out.print("Enter new value: ");
                    scanner.nextLine(); // Consume leftover newline
                    String newValue = scanner.nextLine();
                    customernames.set(index, newValue);
                }
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        CustomerMenu();
    }

    public static void addCustomer() {
        
        ArrayList<String> customernames = new ArrayList<>();
        String cusomtersnames;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter item to add (or 'q' to quit): ");
            cusomtersnames = in.nextLine();
            
            if (cusomtersnames.equalsIgnoreCase("q")) {
                break; // Exit the loop if the user enters 'q'
            }

            customernames.add(cusomtersnames);
            System.out.println("List: " + customernames);
        }
        CustomerMenu();
    }

    public static void removeCustomer() {
        
        ArrayList<String> customernames = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("List: " + customernames);
        System.out.print("Enter item to remove: ");
        String itemToRemove = scanner.nextLine();

        if (customernames.remove(itemToRemove)) {
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found in the list.");
        }

        System.out.println("Updated list: " + customernames);
        CustomerMenu();
    }

    public static void editItemtoPurchase() {
        
        ArrayList<String> itempurchasenames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("List: " + itempurchasenames);
            System.out.println("1. Edit item");
            System.out.println("2. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter index of item to edit: ");
                int index = scanner.nextInt();

                if (index < 0 || index >= itempurchasenames.size()) {
                    System.out.println("Invalid index.");
                } else {
                    System.out.print("Enter new value: ");
                    scanner.nextLine(); // Consume leftover newline
                    String newValue = scanner.nextLine();
                    itempurchasenames.set(index, newValue);
                }
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        ItemMenu();
    }

    public static void addItemtoPurchase() {
        
        ArrayList<String> itempurchasenames = new ArrayList<>();
        String itemspurchasenames;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter item to add (or 'q' to quit): ");
            itemspurchasenames = in.nextLine();
            
            if (itemspurchasenames.equalsIgnoreCase("q")) {
                break; // Exit the loop if the user enters 'q'
            }

            itempurchasenames.add(itemspurchasenames);
            System.out.println("List: " + itempurchasenames);
        }
        ItemMenu();
    }

    public static void removeItemtoPurchase() {
        
        ArrayList<String> itempurchasenames = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("List: " + itempurchasenames);
        System.out.print("Enter item to remove: ");
        String itemToRemove = scanner.nextLine();

        if (itempurchasenames.remove(itemToRemove)) {
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found in the list.");
        }

        System.out.println("Updated list: " + itempurchasenames);
        ItemMenu();
    }

    public static void Total() {
        
        ArrayList<String> itempurchasenames = new ArrayList<>();
        System.out.println("List: " + itempurchasenames);
        Checkout();
    }

    public static void addEmployee() {
        
        ArrayList<String> employeenames = new ArrayList<>();
        String employeesnames;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter item to add (or 'q' to quit): ");
            employeesnames = in.nextLine();
            
            if (employeesnames.equalsIgnoreCase("q")) {
                break; // Exit the loop if the user enters 'q'
            }

            employeenames.add(employeesnames);
            System.out.println("List: " + employeenames);
        }
        EmployeeEditMenu();
    }

    public static void removeEmployee() {
        
        ArrayList<String> employeenames = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("List: " + employeenames);
        System.out.print("Enter item to remove: ");
        String itemToRemove = scanner.nextLine();

        if (employeenames.remove(itemToRemove)) {
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found in the list.");
        }

        System.out.println("Updated list: " + employeenames);
        EmployeeEditMenu();
    }

    public static void editEmployee() {
        
        ArrayList<String> employeenames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("List: " + employeenames);
            System.out.println("1. Edit item");
            System.out.println("2. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter index of item to edit: ");
                int index = scanner.nextInt();

                if (index < 0 || index >= employeenames.size()) {
                    System.out.println("Invalid index.");
                } else {
                    System.out.print("Enter new value: ");
                    scanner.nextLine(); // Consume leftover newline
                    String newValue = scanner.nextLine();
                    employeenames.set(index, newValue);
                }
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        EmployeeEditMenu();
    }

    public static void addManger() {
        
        ArrayList<String> managernames = new ArrayList<>();
        String managersnames;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter item to add (or 'q' to quit): ");
            managersnames = in.nextLine();
            
            if (managersnames.equalsIgnoreCase("q")) {
                break; // Exit the loop if the user enters 'q'
            }

            managernames.add(managersnames);
            System.out.println("List: " + managernames);
        }
        ManagerEditMenu();
    }

    public static void removeManager() {
        
        ArrayList<String> managernames = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("List: " + managernames);
        System.out.print("Enter item to remove: ");
        String itemToRemove = scanner.nextLine();

        if (managernames.remove(itemToRemove)) {
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found in the list.");
        }

        System.out.println("Updated list: " + managernames);
        ManagerEditMenu();
    }

    public static void editManager() {
        
        ArrayList<String> managernames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("List: " + managernames);
            System.out.println("1. Edit item");
            System.out.println("2. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter index of item to edit: ");
                int index = scanner.nextInt();

                if (index < 0 || index >= managernames.size()) {
                    System.out.println("Invalid index.");
                } else {
                    System.out.print("Enter new value: ");
                    scanner.nextLine(); // Consume leftover newline
                    String newValue = scanner.nextLine();
                    managernames.set(index, newValue);
                }
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        ManagerEditMenu();
    }

}
