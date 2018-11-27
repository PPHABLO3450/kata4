/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author pablo
 */
public class kata4 {

    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, IOExection {
        kata4 kata = new kata4();
        kata.control();
    }
    
    private void control () throws IOExection, IOException{
        input();
        process();
        output();
    }
    
    private MailListReader maillist;
    private String fileName;
            
    private MailHistogramBuilder histogramBuild;
    private Histogram histogram ;
    
    private void input(){
        // Aqui se puede añadir codigo para leer por consola un input y cambiar el fichero a leer
        fileName = "D:\\Users\\wwwam\\Desktop\\KATA4\\JavaApplication2\\src\\kata4\\email.txt";
        maillist = new MailListReader();
    }
    
    private void process() throws IOException{
        
        histogramBuild = new MailHistogramBuilder();
        histogram = new Histogram();
        histogram = histogramBuild.Build(maillist.read(fileName));
    }
    
    private void output(){
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
}
