import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class BubbleSorting {
    public static void bubbleSort(long [] array) {
        int out, in;
        long temp = 0;
        for (out = array.length - 1; out > 1; out--) // ������� ���� (��������)
            for (in = 0; in < out; in++) // ���������� ���� (������)
                if (array[in] > array[in + 1]) // ������� �������?
                {
                    temp = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = temp; // �������� �������
                }
    }
    public static void writeToTxtUnsorted(long[]array) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Result\\bubble",false)))) {
            writer.write("������ �� ����������:");
            writer.write("\n");
            for (int i = 0; i < array.length; i++) {
                writer.write(String.valueOf(array[i]));
                writer.write(" ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeToTxtSorted(long[]array){
        try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Result\\bubble",true)))){
            writer.write("\n"+" ");
            writer.write("\n������ ����� ����������:");
            writer.write("\n");

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