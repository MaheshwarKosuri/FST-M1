package activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("src/session4/newfile.txt");
            boolean fStatus = file.createNewFile();
            if(fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }

            //get the file Object
            File fileUtil = FileUtils.getFile("src/session4/newfile.txt");
            System.out.println("file is "+fileUtil);

            String txt = FileUtils.readFileToString(fileUtil, "UTF8");

            String textInFIle = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
            System.out.println("Data in file: " +textInFIle);
            System.out.println("Data in file: " +txt);

            //Create directory
            File destDir = new File("resources");
            //Copy file to directory
            FileUtils.copyFileToDirectory(file, destDir);

            //Get file from new directory
            File newFile = FileUtils.getFile(destDir, "newfile.txt");
            //Read data from file
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            //Print it
            System.out.println("Data in new file: " + newFileData);

        } catch(IOException errMessage) {
            System.out.println(errMessage);
        }
    }
}