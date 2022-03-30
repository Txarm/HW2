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
    }
}
