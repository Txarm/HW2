package ru.first;

public class Main {

    public static void main(String[] args) {
	byte a = 1;
    short b = 2;
    int c = 3;
    long d = 4L;
    float e = 2.5f;
    double f = 65.456;
    boolean g = a < c;
    char h = 63;
    System.out.println(g);

    // Task 2

        float boxerArtem = 78.2f;
        float boxerDavid = 82.7f;
        float boxersWeight = boxerArtem + boxerDavid;
        System.out.println("Total boxers weight " + boxersWeight + " kg");
        float boxersWeightDifference = boxerDavid - boxerArtem;
        System.out.println("Difference between two boxers is " + boxersWeightDifference + " kg");

        // Task 3

        short bananas = 80;
        short milk = 105;
        short iceCream = 100;
        short eggs = 70;
        bananas *= 5;
        milk *= 2;
        iceCream *= 2;
        eggs *= 4;
        int breakfast = bananas + milk + iceCream + eggs;
        System.out.println("Total breakfast weight " + breakfast + " g");
        short kg = 1000;
        int breakfastWeight = breakfast / kg;
        System.out.println("Total breakfast weight " + breakfastWeight + " kg");

        // Task 4

        short weight = 7;
        weight *= 1000;
        int diet250 = weight / 250;
        System.out.println("It takes " + diet250 + " days to get fit by spending 250 g/per day");
        int diet500 = weight / 500;
        System.out.println("It takes " + diet500 + " days to get fit by spending 500 g/per day");
        int diet = (diet250 + diet500) / 2;
        System.out.println("It takes average " + diet + " days to get fit");
    }
}
