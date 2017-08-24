/*
Enabled Parameters:
# - <h1>
## - <h2>
### - <h3>
#### - <h4>
##### - <h5>
###### - <h6>
Single stroke of space bar - <p>
* - List <li>
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
        else if(words.startsWith("##")&&!words.startsWith("###")){
            System.out.println("<h2>"+words.replace("##","")+"</h2>");
        }
        else if(words.startsWith("###")&&!words.startsWith("####")){
            System.out.println("<h3>"+words.replace("###","")+"</h3>");
        }
        else if(words.startsWith("####")&&!words.startsWith("#####")){
            System.out.println("<h4>"+words.replace("####","")+"</h4>");
        }
        else if(words.startsWith("#####")&&!words.startsWith("######")){
            System.out.println("<h5>"+words.replace("#####","")+"</h5>");
        }
        else if(words.startsWith("######")){
            System.out.println("<h6>"+words.replace("######","")+"</h6>");
        }
        else if(words.startsWith(" ")){
            System.out.println("<p>"+words.substring(1,words.length())+"</p>");
        }
        else if(words.startsWith("*")){
            System.out.println("<li>"+words.replace("*","")+"</li>");
        }
        else{
            System.out.println("unrecognized tag");
        }
        }while(!"-1".equals(words));
        
        
        
    }
    
}
