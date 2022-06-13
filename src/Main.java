import java.util.Arrays;
import java.util.Scanner;
import java.time.*;
import java.util.InputMismatchException;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        boolean finish=true;
        while (finish){
            try {
                Scanner in = new Scanner(System.in);
                File folder = new File("Result");
                if(!folder.exists()) folder.mkdir();
                System.out.println("������� ���������� ��������� �����");
                int i = in.nextInt();
                in.nextLine();
                ArrayOfRandomNumbers ri = new ArrayOfRandomNumbers(i);
                ri.randomInsert(i, ri);
                long[] arrayCopy = ri.randomInsert(i, ri);
                String answer;
                System.out.println("������ ��������� ����� �������� ��������� �������:");
                    ri.display(arrayCopy);

                boolean sorting=true;
                while (sorting) {
                    System.out.println("����� ����� ���������� ������ ������������?");
                    System.out.println("1. ���������� ���������");
                    System.out.println("2. ���������� ���������");
                    System.out.println("3. ���������� �������");

                    int sortingMethod = in.nextInt();
                    in.nextLine();
                    if (sortingMethod<0||sortingMethod>3){
                        sortingMethod = in.nextInt();
                    }
                    switch (sortingMethod) {
                        case 1 -> {
                            long[] arrayCopy1 = Arrays.copyOf(arrayCopy, arrayCopy.length);
                            Instant startBub = Instant.now();
                            BubbleSorting.bubbleSort(arrayCopy1);
                            Instant stopBub = Instant.now();
                            long elapsedBub = Duration.between(startBub, stopBub).toMillis();
                            System.out.println("��������������� ������ �������� ��������� �������:");
                            ri.display(arrayCopy1);
                            System.out.println("����� ������ ��������� ���������� ���������� " + elapsedBub + " �����������");
                            System.out.println("�������� ��������� ������ ��������� � ����?(��/���)");
                            answer = in.nextLine();
                            if (answer.equals("��")||answer.equals("lf")||answer.equals("yes")||answer.equals("��")) {
                            	BubbleSorting.writeToTxtUnsorted(arrayCopy);
                            	BubbleSorting.writeToTxtSorted(arrayCopy1);
                                System.out.println("������ ������������� ���� �� ������ ��������� ����� ������ �������?(��/���)");
                                answer = in.nextLine();
                            } else {
                                System.out.println("������ ������������� ���� �� ������ ��������� ����� ������ �������?(��/���)");
                                answer = in.nextLine();
                            }
                            if (answer.equals("��")||answer.equals("lf")||answer.equals("yes")||answer.equals("��")) {
                                break;
                            } else {
                                System.out.println("������ ���������?(��/���)");
                                answer = in.nextLine();
                                switch (answer) {
                                    case "��":finish = false;
                                    case "���":break;
                                    case "Yes":finish = false;
                                    case "yes":finish = false;
                                    case "no":break;
                                }

                                sorting = false;

                            }
                        }
                        case 2 -> {
                            long[] arrayCopy2 = Arrays.copyOf(arrayCopy, arrayCopy.length);
                            Instant startIns = Instant.now();
                            SortingByInserts.insertionSort(arrayCopy2);
                            Instant stopIns = Instant.now();
                            long elapsedIns = Duration.between(startIns, stopIns).toMillis();
                            System.out.println("��������������� ������ �������� ��������� �������:");
                            ri.display(arrayCopy2);
                            System.out.println("����� ������ ��������� ���������� ���������� " + elapsedIns + " �����������");
                            System.out.println("�������� ��������� ������ ��������� � ����?(��/���)");
                            answer = in.nextLine();
                            if (answer.equals("��")||answer.equals("lf")||answer.equals("yes")||answer.equals("��")) {
                            	SortingByInserts.writeToTxtUnsorted(arrayCopy);
                            	SortingByInserts.writeToTxtSorted(arrayCopy2);
                                System.out.println("������ ������������� ���� �� ������ ��������� ����� ������ �������?(��/���)");
                                answer = in.nextLine();
                            } else {
                                System.out.println("������ ������������� ���� �� ������ ��������� ����� ������ �������?(��/���)");
                                answer = in.nextLine();
                            }
                            if (answer.equals("��")||answer.equals("lf")||answer.equals("yes")||answer.equals("��")) {
                                break;
                            } else {
                                System.out.println("������ ���������?(��/���)");
                                answer = in.nextLine();
                                switch (answer) {
                                    case "��":finish = false;
                                    case "���":break;
                                    case "lf":finish = false;
                                    case "yes":finish = false;
                                    case "no":break;

                                }
                                sorting = false;

                            }
                        }
                        case 3 -> {
                            long[] arrayCopy3 = Arrays.copyOf(arrayCopy, arrayCopy.length);
                            Instant startSel = Instant.now();
                            SortingByChoice.selectionSort(arrayCopy3);
                            Instant stopSel = Instant.now();
                            long elapsedSel = Duration.between(startSel, stopSel).toMillis();
                            System.out.println("��������������� ������ �������� ��������� �������:");
                            ri.display(arrayCopy3);
                            System.out.println("����� ������ ��������� ���������� ���������� " + elapsedSel + " �����������");
                            System.out.println("�������� ��������� ������ ��������� � ����?(��/���)");
                            answer = in.nextLine();
                            if (answer.equals("��")||answer.equals("lf")||answer.equals("yes")||answer.equals("��")) {
                            	SortingByChoice.writeToTxtUnsorted(arrayCopy);
                            	SortingByChoice.writeToTxtSorted(arrayCopy3);
                                System.out.println("������ ������������� ���� �� ������ ��������� ����� ������ �������?(��/���)");
                                answer = in.nextLine();
                            } else {
                                System.out.println("������ ������������� ���� �� ������ ��������� ����� ������ �������?(��/���)");
                                answer = in.nextLine();
                            }
                            if (answer.equals("��")||answer.equals("lf")||answer.equals("yes")||answer.equals("��")) {
                                break;
                            } else {
                                System.out.println("������ ���������?(��/���)");
                                answer = in.nextLine();
                                switch (answer) {
                                    case "��":finish = false;
                                    case "���":break;
                                    case "Yes":finish = false;
                                    case "yes":finish = false;
                                    case "no":break;
                                }
                                sorting = false;

                            }
                        }
                    }
                }
            }
            catch (InputMismatchException e){
                System.out.println(e.getMessage());
            }
        }
    }
}