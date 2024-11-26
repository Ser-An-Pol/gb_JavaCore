import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 * Задачи:
 * 1. Написать функцию, создающую резервную копию всех файлов в директории (без
 * поддиректорий) во вновь созданную папку ./backup
 * 2. Предположить, что числа в исходном массиве из 9 элементов имеют диапазон [0, 3],
 * и представляют собой, например, состояния ячеек поля для игры в крестики-нолики, где 0 – это пустое поле,
 * 1 – это поле с крестиком, 2 – это поле с ноликом, 3 – резервное значение.
 * Такое предположение позволит хранить в одном числе типа
 * int всё поле 3х3. Записать в файл 9 значений так, чтобы они заняли три байта.
 * 3. Прочитать числа из файла, полученного в результате выполнения задания 2.
 */

public class Main {
    public static void main(String[] args) throws IOException {

        String name = "./Test";
        backup(name);

        //------------------------------------------------------

        int[][] field = {{3, 1, 3},
                        {2, 3, 3},
                        {3, 3, 0}};

        writeByteArrToFile(convertFieldToByteArr(field));

        //------------------------------------------------------

        int [][] res = readFieldFromBinaryFile();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void backup(String name) throws IOException {
        Files.createDirectories(Path.of(name + "/backup"));
        Files.list(Path.of(name))
                .filter(path -> !Files.isDirectory(path))
                .forEach(path -> {
                    try {
                        Files.copy(path, Path.of(name + "/backup/" + path.getName(path.getNameCount()-1)),
                                REPLACE_EXISTING);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    public static byte[] convertFieldToByteArr(int[][] field) {
        if (field.length != 3 || field[0].length != 3) throw new IllegalArgumentException("Неверный размер игрового поля");
        byte[] arr = new byte[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!isCorrectValue(field[i][j]))
                    throw new IllegalArgumentException("Неверное значение в ячейке [" + i + ", " + j + "] = " + field[i][j]);
                arr[i] = (byte) (arr[i]*4 + field[i][j]);
            }
        }
        return arr;
    }

    public static int[][] convertByteArrToField(byte[] array) {
        if (array.length != 3) throw new IllegalArgumentException("Неверный размер массива байтов");
        int[][] field = new int[3][3];
        int[] mask = {48, 12, 3};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = array[i] & mask[j];
                field[i][j] >>= 2*(2-j);
            }
        }
        return field;
    }

    public static void writeByteArrToFile(byte[] array) {
        try (FileOutputStream stream = new FileOutputStream("field.bin")) {
            stream.write(array);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[][] readFieldFromBinaryFile() {
        byte[] array = new byte[3];
        try (FileInputStream stream = new FileInputStream("field.bin")) {
            array = stream.readAllBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return convertByteArrToField(array);
    }

    private static boolean isCorrectValue(int a) {
        return (a >= 0 && a <=3);
    }
}