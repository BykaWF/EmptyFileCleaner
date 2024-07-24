# EmptyFileCleaner

**EmptyFileCleaner** is a Java utility designed to traverse a specified directory (and its subdirectories) and delete all empty files of a specific type. This tool is useful for cleaning up unnecessary files and maintaining organized directories.

## Features

- Recursively scans directories.
- Deletes empty files of a specified file type.
- Print status messages for each deleted file or failure to delete.

## Prerequisites

- Java Development Kit (JDK) 8 or higher.

## Usage

1. **Compile the Program**: 
   ```bash
   javac -d bin src/home/App.java

2. **Run the Program**:

  ```bash
  java -cp bin home.App <directoryPath> <fileType>
  <directoryPath>: The path to the directory where the search should begin.
  <fileType>: The file extension (including the dot) of the files to delete, e.g., .txt.
  ```
## Example:

  ```bash
  java -cp bin home.App /path/to/directory .txt
  This command will search through /path/to/directory and its subdirectories for empty .txt files and delete them.
  ```
## Error Handling
- If the provided path is not a directory, the program will notify you.
- If the directory cannot be opened, an error message will be displayed.

## Contribution
Contributions are welcome! If you have suggestions or find bugs, please open an issue or submit a pull request.
