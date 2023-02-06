import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Pharmacy> pharmacies = new ArrayList<>();
        System.out.println("Choose between these options.");
        System.out.println("Insert element");
        System.out.println("View all data");
        System.out.println("Show data under - - price and manufacturer");
        System.out.println("Option: ");
        int N = 0;
        switch (N){
            case 1:
                break;
            case 2:
                printData(pharmacies);
                break;
            case 3:
                break;
        }
    }

    public static void printData(ArrayList<Pharmacy> pharmacies) {
        System.out.println("Print all data!");
        for (Pharmacy h : pharmacies) {
            System.out.println(h.toString());
        }
    }
    public static void insertData(Scanner scanner){

    }
    }