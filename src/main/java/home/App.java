package home;

import java.io.File;

public class App{
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java App <directoryPath> <fileType>");
            return;
        }

        String directoryPath = args[0];
        String type = args[1];
        File directory = new File(directoryPath);

        if (!directory.isDirectory()) {
            System.out.println("The path provided is not a directory: " + directoryPath);
            return;
        }

        deleteEmptyFilesInDirectoryOfType(directory,type);
    }

    public static void deleteEmptyFilesInDirectoryOfType(File directory, String type) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteEmptyFilesInDirectoryOfType(file,type);
                } else {
                    if (file.isFile() && file.getName().endsWith(type) && file.length() == 0) {
                        if (file.delete()) {
                            System.out.println("Deleted empty file: " + file.getPath());
                        } else {
                            System.out.println("Failed to delete file: " + file.getPath());
                        }
                    }
                }
            }
        } else {
            System.out.println("Unable to open directory: " + directory.getPath());
        }
    }
}
