import java.io.*;
import java.util.*;

public class PhoneNumberChanger {
    private static List<String> lines;

    private static void readFromFile(String fileName)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            lines = new ArrayList<String>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        catch (IOException exp)
        {
            throw new RuntimeException(exp);
        }
    }

    private static void replaceNumbers()
    {

    }

    private static void writeToFile(String fileName)
    {
        Writer writer;
        try
        {
            writer = new FileWriter(fileName);
            for (String line : lines)
            {
                writer.write(line);
                writer.write(System.getProperty("line.separator"));
            }
            writer.flush();
        }
        catch (IOException exp)
        {
            throw new RuntimeException(exp);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        try
        {
            readFromFile(fileName);
            replaceNumbers();
            writeToFile(fileName);
        }
        catch (RuntimeException exp)
        {
            System.err.println(exp.getMessage());
        }
    }
}
