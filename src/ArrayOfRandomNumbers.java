import java.util.Random;

public class ArrayOfRandomNumbers {
    private long[] array; // ������ �� ������ a
    private int length; // ���������� ��������� ������

    public ArrayOfRandomNumbers(int max) // �����������
    {
        array = new long[max]; // �������� �������
        length = 0; // ���� ��� �� ������ ��������
    }

    public long [] randomInsert(int value, ArrayOfRandomNumbers randomInsert) { // �����, ����������� ��������� ������ ���������� ����������
        Random random = new Random();
        length = value;
        for (int i = 0; i < value; i++) {
            array[i] = random.nextInt(value);
        }

        return array;
    }
    public void display(long[]array) // ����� ����������� �������
    {
        for(int j=0; j<length; j++) // ��� ������� ��������
            System.out.print(array[j] + " "); // �����
        System.out.println("");
    }
}