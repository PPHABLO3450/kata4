/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class MailListReader {
   
     List<Mail> read (String fileName) throws FileNotFoundException, IOException{
        String cadena;
        
        //Lista que se devuelve:
        List<Mail> email = new ArrayList<>();
        
        //Patron de busqueda:
        Pattern patron =  Pattern.compile("@");
      
        FileReader f = new FileReader(fileName);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
             Matcher m = patron.matcher(cadena);
            if(m.find()){
                Mail nuevo = new Mail(cadena);
                email.add(nuevo);
            }
        }
        b.close(); 
        return email;
         
     }
}
