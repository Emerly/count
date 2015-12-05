package count;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class count {
	public static void main(String args[]){
	 
        BufferedReader br = null;  
        String result= "";
        int line = 1;
        int count = 0;
        
        String str = "";  
        try {  
        	InputStreamReader read;
			
			read = new InputStreamReader (new FileInputStream("D:\\workplace\\new.txt"),"UTF-8");
			
			BufferedReader reader = new BufferedReader(read);  
       
            while ((str = reader.readLine()) != null) {  
            	for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i)== '\u7684') {
						System.out.println("的字出现在第"+line+"行，第"+i+"个字");
						count++;
					}
				}
                line++;
            }
                System.out.println("一共出现"+count+"次"); 
               
         }catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  

}
