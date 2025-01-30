package asac.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {
    private static void checkedException() {
        try {
            File file = new File("not_existing_file.txt");
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    private static void checkedExceptionWithTryCatch() {
        try {
            File file = new File("not_existing_file.txt");
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
