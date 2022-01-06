package com.company;

public class Main {

    public static void main(String[] args) {
        String[] array ={"pitbull","Dogberman","Rotweiler","Béc Đức","Béc Bỉ"};
        System.out.println("Mảng ban đầu");
        for (String element : array){
            System.out.println(element);
        }
        String[] newArray = xoaPhanTuKhoiMang(array,3);
        System.out.println("Mảng sau khi xóa");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    public static String[] xoaPhanTuKhoiMang(String[] array, int index) {
        String[] newArray = new String[array.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else {
                newArray[i] = array[i + 1];
            }
        }
        return newArray;
    }
}
