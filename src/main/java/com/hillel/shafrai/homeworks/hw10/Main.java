package com.hillel.shafrai.homeworks.hw10;
import java.util.Arrays;
public class Main {
        public static void main(String[] args) {
            int[] array1 = new int[7];
            int[] array2 = new int[7];
            for (int i = 0; i < array1.length; i++) {
                array1[i] = (int) (Math.random() * 10);
            }
            for (int i = 0; i < array2.length; i++) {
                array2[i] = (int) (Math.random() * 10);
            }

            Arrays.sort(array1);
            for (int i = 0; i < array2.length; i++) {
                for (int j = 1; j < array2.length - i; j++) {
                    if (array2[j - 1] > array2[j]) {
                        int temp = array2[j - 1];
                        array2[j - 1] = array2[j];
                        array2[j] = temp;
                    }
                }
            }

            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));

            int counter = 0;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i]) {
                    counter++;
                }
            }
            System.out.println("Кількість збігів: " + counter);

            // simple version
//        if(counter > 0){
//            System.out.print("Збіглися ");
//            for(int i = 0; i < array1.length; i++){
//                if(array1[i] == array2[i]){
//                    System.out.print(i + "й ");
//                }
//            }
//            System.out.print("елементи");
//        }

            if (counter != 0) {
                int[] indexOfElements = new int[counter];
                int index = 0;
                for (int i = 0; i < array1.length; i++) {
                    if (array1[i] == array2[i]) {
                        indexOfElements[index] = i;
                        index++;
                    }
                }
                if (indexOfElements.length == 1) {
                    System.out.print("Збігся " + indexOfElements[0] + "й елемент");
                } else {
                    System.out.print("Збіглися ");
                    for (int i = 0; i < indexOfElements.length; i++) {
                        if (i < indexOfElements.length - 1) {
                            System.out.print(indexOfElements[i] + "й, ");
                        } else {
                            System.out.print(indexOfElements[i] + "й ");
                        }
                    }
                    System.out.print("елемети");
                }
            }
        }
    }

