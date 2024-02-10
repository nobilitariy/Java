package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах), его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.). Найти:
- количество кубиков желтого цвета и их суммарный объем;
*- количество деревянных кубиков с ребром 3 см
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Kube> kbList = new ArrayList<>(Arrays.asList(
            new Kube(1, "red", "met"),
            new Kube(3, "blue", "der"),
            new Kube(3, "red", "plast")
        ));
        int count = 0;
        double ob = 0;
        for (Kube elem : kbList) {
            if(elem.getColor().equals("red")){
                count += 1;
                ob += Math.pow(elem.getSize(), 3);
            }
        }
        int count2 = 0;
        for (Kube elem : kbList) {
            if(elem.getColor().equals("der") && elem.getSize() == 3){
                count2 += 1;
            }
        }
        System.out.println(count);
        System.out.println(ob);
        System.out.println(count2);
    }
}
