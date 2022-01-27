//Title: Time of Complaxity
// Author:Eren Çağlaroğlu
// ID: 1150016897
// Section: 2
// Assignment: 2
//Description: Calculating time of sorting type each other

import java.util.Random;
public class SortingAlgorithmTester {
    public static void main(String[] args) {

        System.out.println("sorted");

        System.out.println("1.time= "+median(sort1C(),sort1C(),sort1C()));
        System.out.println("2.time= "+median(sort2C(),sort2C(),sort2C()));
        System.out.println("3.time= "+median(sort3C(),sort3C(),sort3C()));
        System.out.println("4.time= "+median(sort4C(),sort4C(),sort4C()));
        System.out.println("5.time= "+median(sort5C(),sort5C(),sort5C()));
    }
//buble sort=insertion sort(the difference between them is very small)<merge sort<quick sort<selection sort
// Then the order should be like this: 5<4<2<3<1

    public static long sort1C() {

        long counterS;
        long counterE;
        Random rand = new Random();

        int array[] = new int[10000];
        int max = 100;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (min + max + 1));
        }


        counterS = System.currentTimeMillis();
        SortingAlgorithms.sort1(array, 1150016897L);
        counterE = System.currentTimeMillis();
        return counterE - counterS;


    }

    public static long sort2C() {

        long counterS;
        long counterE;
        Random rand = new Random();

        int array[] = new int[10000];
        int max = 100;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (min + max + 1));
        }


        counterS = System.currentTimeMillis();
        SortingAlgorithms.sort2(array, 1150016897L);
        counterE = System.currentTimeMillis();
        return counterE - counterS;


    }

    public static long sort3C() {

        long counterS;
        long counterE;
        Random rand = new Random();

        int array[] = new int[10000];
        int max = 100;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (min + max + 1));
        }


        counterS = System.currentTimeMillis();
        SortingAlgorithms.sort3(array, 1150016897L);
        counterE = System.currentTimeMillis();
        return counterE - counterS;


    }

    public static long sort4C(){

        long counterS;
        long counterE;
        Random rand= new Random();

        int array[]=new int[10000];
        int max=100;
        int min=0;
        for (int i=0;i< array.length;i++){
            array[i]=(int)(Math.random()*(min+max+1));
        }


        counterS=System.currentTimeMillis();
        SortingAlgorithms.sort4(array,1150016897L);
        counterE=System.currentTimeMillis();
        return counterE-counterS;
}

    public static long sort5C() {

        long counterS;
        long counterE;
        Random rand = new Random();

        int array[] = new int[10000];
        int max = 100;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (min + max + 1));
        }


        counterS = System.currentTimeMillis();
        SortingAlgorithms.sort5(array, 1150016897L);
        counterE = System.currentTimeMillis();
        return counterE - counterS;
    }

    public static long median(long x,long y, long z){


        if ((x < y && y < z) || (z < y && y < x))
            return y;


        if ((y < x && x < z) || (z < x && x < y))
            return x;

        return z;
    }
}