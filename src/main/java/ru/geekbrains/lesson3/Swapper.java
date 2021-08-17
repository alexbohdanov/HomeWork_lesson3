package ru.geekbrains.lesson3;

public class Swapper<T> {
    public void swap(T[] array, int first, int second) {
        T buffer = array[first];
        array[first] = array[second];
        array[second] = buffer;
    }
}
