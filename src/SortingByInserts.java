import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class SortingByInserts {
    public static void insertionSort(long[]array)
    {
        int in, out;
        for(out=1; out<array.length; out++) // out - разделительный маркер
        {
            long temp = array[out]; // Скопировать помеченный элемент
            in = out; // Начать перемещения с out
            while(in>0 && array[in-1] >= temp) // Пока не найден меньший элемент
            {
                array[in] = array[in-1]; // Сдвинуть элемент вправо
                --in; // Перейти на одну позицию влево
            }
            array[in] = temp; // Вставить помеченный элемент
        }
    }
    public static void writeToTxtUnsorted(long[]array) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Result\\inserts",false)))) {
            writer.write("\n"+" ");
            writer.write("Массив до сортировки:");
            writer.write("\n"+" ");
            for (int i = 0; i < array.length; i++) {
                writer.write(String.valueOf(array[i]));
                writer.write(" ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeToTxtSorted(long[]array){
        try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Result\\inserts",true)))){
            writer.write("\n"+" ");
            writer.write("\nМассив после сортировки:");
            writer.write("\n"+" ");
            for (int i =0;i<array.length;i++){
                writer.write(String.valueOf(array[i]));
                writer.write(" ");
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}