package io.github.theacid.challenge069;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

class ReadToArray {
    public static void main(String[] args) {
//        String file = ";
        String file = "/directory_name/file_name";
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(file);
            byte content[] = new byte[2*1024];
            int readCounting = 0;
            while((readCounting = inputStream.read(content)) > 0) {
                System.out.println(new String(content, 0, readCounting - 1));
            }
        }

        catch(FileNotFoundException exc) {
            System.out.println("File " + file + "not found.");
        }

        catch(IOException exc) {
            System.out.println("Error reading file " + file);
        }

        finally {
            try {
                if(inputStream != null) { inputStream.close(); }
            }

            catch(Exception exc) {
                System.out.println("Error reading file " + file);
            }
        }
    }
}
