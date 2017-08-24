/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestlab;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DEJI
 */
public class MarkdownParser {
    public static void main(String[] args){
        //note the markdown parser only covers: few head tags, paragraph tag and the list tag
        String words="";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the words \nEnabled Parameters: \n# - h1"
                + "\n## - h2 \n...######-h6 \nSingle spacebar stroke - paragraph \n* -  list(li)"
                + "\nPress -1 to quit");
        do{
        words = input.nextLine();
        if(words.startsWith("#")&&!words.startsWith("##")){
            System.out.println("<h1>"+words.replace("#","")+"</h1>");
        }
        if(words.startsWith("##")&&!words.startsWith("###")){
            System.out.println("<h2>"+words.replace("##","")+"</h2>");
        }
        if(words.startsWith("###")&&!words.startsWith("####")){
            System.out.println("<h3>"+words.replace("###","")+"</h3>");
        }
        if(words.startsWith("####")&&!words.startsWith("#####")){
            System.out.println("<h4>"+words.replace("####","")+"</h4>");
        }
        if(words.startsWith("#####")&&!words.startsWith("######")){
            System.out.println("<h5>"+words.replace("#####","")+"</h5>");
        }
        if(words.startsWith("######")){
            System.out.println("<h6>"+words.replace("######","")+"</h6>");
        }
        if(words.startsWith(" ")){
            System.out.println("<p>"+words.substring(1,words.length())+"</p>");
        }
        if(words.startsWith("*")){
            System.out.println("<li>"+words.replace("*","")+"</li>");
        }
        }while(!"-1".equals(words));
        
        
        
    }
    
}
