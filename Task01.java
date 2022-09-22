import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public final class Task01 {
    public static void main(String[] args) {
        File dir = new File(pathname:"D:\JAVAHomeworks\Homework002\");
        File[] files = dir.listFiles();
        String[] fileNames = files.getName().split(".");
        for(int i = 0; i < fileNames.length; i++){
            int count = 0;
            if(fileNames.equals("json")){
                count++;
                System.out.println("Файлов с расширением json = {count}");
            }
            count = 0;
            if(fileNames.equals("jpd")){
                count++;
                System.out.println("Файлов с расширением jpd = {count}");
            }
            count = 0;
            if(fileNames.equals("pdf")){
                count++;
                System.out.println("Файлов с расширением pdf = {count}");
            }
            count = 0;
            if(fileNames.equals("txt")){
                count++;
                System.out.println("Файлов с расширением txt = {count}");
            }
        }
    }
}