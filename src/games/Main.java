package games;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static final String GAMES_PATH = "C:/Users/User/Desktop/Games";

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        Arrays.stream(PathEnum.values()).forEach(f -> createDirOrFile(f, result));

        File tempTxt = new File(GAMES_PATH + "/temp", "temp.txt");
        createFile(tempTxt, result);

        try (FileWriter fileWriter = new FileWriter(tempTxt)) {
            fileWriter.write(result.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static void createDirOrFile(PathEnum file, StringBuilder stringBuilder) {
        if (file.isDir()) {
            createDir(new File(file.getPath()), stringBuilder);
        } else {
            createFile(new File(file.getPath()), stringBuilder);
        }
    }

    public static void createDir(File file, StringBuilder stringBuilder) {
        if (file.mkdir()) {
            stringBuilder.append(file.getName());
        }
    }

    public static void createFile(File file, StringBuilder stringBuilder) {
        try {
            file.createNewFile();
            stringBuilder.append(file.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
