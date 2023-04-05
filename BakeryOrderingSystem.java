/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bakeryorderingsystem;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class BakeryOrderingSystem {
    static Scanner scanner =  new Scanner(System.in);
    static String firstName = scanner.nextLine(), lastName = scanner.nextLine();
    static int age = scanner.nextInt(), phoneNo = scanner.nextInt();
    
    static Customer customer = new Customer(firstName, lastName, age, phoneNo, true);  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println(customer);
        
        Pastries pastries = new Pastries("Some pastry", new String[]{"Flavour1", "Flavour2"}, new String[]{"Size1", "Size2"}, new double[]{2.5, 5.0});
        System.out.println("Name: " + pastries.getName());
        System.out.println("Flavours: " + Arrays.toString(pastries.getFlavours()));
        System.out.println("Sizes: " + Arrays.toString(pastries.getSizes()));
        System.out.println("Prices: " + Arrays.toString(pastries.getPrices()));

        Pastries.Bread bread = pastries.new Bread();
        bread.printBreadTypes();

        Pastries.Cake cake = pastries.new Cake();
        cake.printCakeTypes();

        Pastries.Doughnut doughnut = pastries.new Doughnut();
        doughnut.printDoughnutTypes();

        Pastries.Tart tart = pastries.new Tart();
        tart.printTartTypes();

        Pastries.Puff puff = pastries.new Puff();
        puff.printPuffTypes();
    }
    
}
