package com.carpooling;

class Insertion{
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 7, 1, 3};
        System.out.println("Array antes de la ordenación:");
        imprimirArray(array);

        insertionSortDescendente(array);

        System.out.println("\nArray después de la ordenación descendente:");
        imprimirArray(array);
    }

    public static void insertionSortDescendente(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int clave = array[i];
            int j = i - 1;

            // Mover los elementos del array[0..i-1] que son mayores que la clave
            // a una posición adelante de su posición actual
            while (j >= 0 && array[j] < clave) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = clave;
        }
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}