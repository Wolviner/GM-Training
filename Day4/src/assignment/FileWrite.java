package assignment;

import java.io.*;

public class FileWrite {
    
    public static void main(String[] args) throws IOException {
        String str = "This is a sample paragraph.\n" +
                "It contains multiple sentences.\n" +
                "Each sentence is separated by a newline.";
        
        // Writing initial content to output.txt
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Counting characters, words, and lines
        long charCount = 0;
        long wordCount = 0;
        long lineCount = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                
                // Count characters
                charCount += line.length();
                
                // Count words
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Output counts
        System.out.println("Character count: " + charCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line count: " + lineCount);
        
        
        StringBuilder modifiedContent = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String modifiedLine = line.replace('s', '*');
                modifiedContent.append(modifiedLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write(modifiedContent.toString());
            System.out.println("Modified content written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
