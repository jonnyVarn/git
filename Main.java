package com.company;

public class Main {

    public static void main(String[] args) {
        final long NANOSEC_PER_SEC = 1000l*1000*1000;
        long startTime = System.nanoTime();
        int i = 0;
        while ((System.nanoTime()-startTime) < 1 *60*NANOSEC_PER_SEC) {
            i++;
        }
        System.out.println(i);
    }
}