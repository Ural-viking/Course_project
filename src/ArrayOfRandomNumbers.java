import java.util.Random;

public class ArrayOfRandomNumbers {
    private long[] array; // Ссылка на массив a
    private int length; // Количество элементов данных

    public ArrayOfRandomNumbers(int max) // Конструктор
    {
        array = new long[max]; // Создание массива
        length = 0; // Пока нет ни одного элемента
    }

    public long [] randomInsert(int value, ArrayOfRandomNumbers randomInsert) { // Метод, позволяющий заполнить массив случайными значениями
        Random random = new Random();
        length = value;
        for (int i = 0; i < value; i++) {
            array[i] = random.nextInt(value);
        }

        return array;
    }
    public void display(long[]array) // Вывод содержимого массива
    {
        for(int j=0; j<length; j++) // Для каждого элемента
            System.out.print(array[j] + " "); // Вывод
        System.out.println("");
    }
}