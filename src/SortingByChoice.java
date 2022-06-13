import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class SortingByChoice {
    public static void selectionSort(long[] array) {
        int out, in, min;
        for (out = 0; out < array.length - 1; out++) // ������� ����
        {
            min = out; // �������
            for (in = out + 1; in < array.length; in++)  // ���������� ����
                if (array[in] < array[min]) // ���� �������� min ������,
                    min = in;// ������, ������ ����� �������
            long temp = array[out];
            array[out] = array[min];
            array[min] = temp;

        }
    }

    public static void writeToTxtUnsorted(long[]array) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Result\\choice", false)))) {
            writer.write("\n"+" ");
            writer.write("������ �� ����������:");
            writer.write("\n"+" ");
            for (int i = 0; i < array.length; i++) {
                writer.write(String.valueOf(array[i]));
                writer.write(" ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeToTxtSorted(long[]array) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Result\\choice", true)))) {
            writer.write("\n"+" ");
            writer.write("\n������ ����� ����������:");
            writer.write("\n"+" ");
            for (int i = 0; i < array.length; i++) {
                writer.write(String.valueOf(array[i]));
                writer.write(" ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
