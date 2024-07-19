package com.grayMatter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileAssignment {

	public static void main(String[] args)throws IOException {
		
		        String paragraph = "This is a sample paragraph.\n" +
		                           "It contains multiple sentences.\n" +
		                           "Each sentence is separated by a newline.";

//		       INSERT PARAGRAPH INTO 
		        String filePath = "output.txt";
		        
		        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)) ;
		            // Write the paragraph to the file
		            writer.write(paragraph);
		            System.out.println("Paragraph has been written to " + filePath);
		            
		            BufferedReader reader = new BufferedReader(new FileReader(filePath));
		            int wordCount = 0;
		            String line;

		            while ((line = reader.readLine()) != null) {
		                // Split the line into words by whitespace
		                String[] words = line.split("\\s+");	
		                // Increment wordCount by the number of words in the current line
		                wordCount += words.length;
		            }
		            System.out.println("Number of words in the file: " + wordCount);
		        
		        
		        
		    }
		}

		
