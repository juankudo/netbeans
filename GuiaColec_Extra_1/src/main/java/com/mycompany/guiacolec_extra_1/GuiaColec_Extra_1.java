/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.guiacolec_extra_1;

import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @author HP-G42
 */
public class GuiaColec_Extra_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> integerList = new ArrayList();
        Integer num;
        System.out.println("Enter a sequence of integer numbers, for ended enter -99");
        do {
            System.out.println("Enter a integer number");
            num = sc.nextInt();
            if (num != -99) {
                integerList.add(num);
            }
        } while (num != -99);
        for (Integer integer : integerList) {
            System.out.print(integer + " ");
        }
        num = 0;
        for (Integer integer : integerList) {
            num += integer;
        }
        System.out.println("");
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println("-------------------------------\nThe sum of all the integer numbers is: " + num + "\n"
                + "The average of the numbers is: " + df.format((double) num / integerList.size()));
    }
}
