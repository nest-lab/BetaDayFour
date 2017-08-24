/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestlab;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DEJI
 */
public class SearchString {
    public static void main (String[] args){
        String input = ""; 
        Scanner corpus = null;
        try {
            corpus = new Scanner(new FileReader("corpus.txt"));
        } catch (Exception ex) {
            Logger.getLogger(SearchString.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner wordInput = new Scanner(System.in);
        System.out.println("Input the word that has to be searched");
        String word = wordInput.nextLine();

        String str = "";
        int occurance = 0;
        while(corpus.hasNext()){
            input = corpus.nextLine();
        for(char c : input.toCharArray()) {
            str += c;
            if(str.length() == word.length()) {
                if(str.equals(word)) {
                    int number = corpus.nextInt()-1;
                    System.out.println(word+" occurs at sentence "+number);
                    occurance ++;
                }
                str = str.substring(1);
            }
        }
        }
        if(occurance > 0)
            System.out.println("the string is present and the count of the given string is : " + occurance);
        else 
            System.out.println("The string is not present");
       }
        
    
}
