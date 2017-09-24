import java.io.*;
import javax.swing.JOptionPane;
public class UppercaseFileConverter {

    public static void main(String[] args) throws IOException {
         // Variables
      String fileIn, fileOut, textLine;
      
      
      // Get input and output filenames.
      fileIn = JOptionPane.showInputDialog(null, "Input file name?");
      fileOut = JOptionPane.showInputDialog(null, "Output file name?");
      
      // Open the input file that will be read.
      FileReader readFile = new FileReader(fileIn);
      BufferedReader readFileInput = new BufferedReader(readFile);
      
      // Open output file to write on.
      FileWriter writeFile = new FileWriter(fileOut);
      BufferedWriter writeFileOutput = new BufferedWriter(writeFile);
      
      // Read the first line of text and save to string.
      textLine = readFileInput.readLine();
      
      // Loop through all lines until done.
      while(textLine != null)
      {
         // Convert each line to all uppercase, write to file then
         // also write a new line. 
         textLine = textLine.toUpperCase();
         writeFileOutput.write(textLine);
         writeFileOutput.newLine();
         textLine = readFileInput.readLine();
      }
      
      
      // Close both files.
      readFileInput.close();
      writeFileOutput.close();
    }
    
}
