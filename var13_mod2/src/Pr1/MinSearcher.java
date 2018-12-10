package Pr1;

import java.io.BufferedReader;

import java.nio.file.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.io.InputStreamReader;

public class MinSearcher {
    static BufferedReader br = null;
    private Pattern addressPattern = Pattern.compile(NumbersFinding,Pattern.MULTILINE);
    private Matcher matcher;
    private static final String NumbersFinding = "^(C|K).*$";

    public static void main(String[] args) throws Exception {

        System.out.println(" Developed by Max Navrotsky Max IPZ31\n");
        br = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        try {
            //READ
            System.out.println("Введите название файла");
            fileName = br.readLine();
            System.out.println("\nИщем по пути : \nC:\\Users\\Max\\Desktop\\"+fileName+".txt");
            String data = readFileAsString("C:\\Users\\Max\\Desktop\\"+fileName+".txt");
            System.out.println("\nФайл : "+fileName+"\n");
            System.out.println(data);
            //FIND
            MinSearcher obj = new MinSearcher();
            List<String> list = obj.getNumbers(data);
            System.out.println("\nНайденные номера (фамилии владельцев начинаються на C/K) : \n "+list);
            //WRITE
            writeToFile(list);
            //matcher = addressPattern.matcher(data);
            String resultTxt = readFileAsString("C:\\Users\\Max\\Desktop\\numbersResult.txt");
            System.out.println("\nФинальынй Файл : \n");
            System.out.println(resultTxt);
        }
        catch (Exception ex) {
            System.out.println("\nError : \n "+ex.getMessage());
        }
    }
    public static String readFileAsString(String fileName)throws Exception {
        String data;
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
    public static void writeToFile (List<String> numbers) throws Exception{
        System.out.println("\nЗаписываем результаты в файл");
        Path out = Paths.get("C:\\Users\\Max\\Desktop\\numbersResult.txt");
        Files.write(out,numbers);
    }
    private List<String> getNumbers(String data) throws Exception{
        List<String> result = new ArrayList<>();

        matcher = addressPattern.matcher(data);

        while (matcher.find()) {
            result.add(matcher.group());
        }

        return result;
    }

}