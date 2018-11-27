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
    public static void main(String[] args) throws IOException {
        //Direccion/nombre del fichero:
        String fileName = "D:\\Users\\wwwam\\Desktop\\KATA4\\JavaApplication2\\src\\kata4\\email.txt";
            
        // Se obtienen los emails correctos:
        MailListReader maillist = new MailListReader();

        MailHistogramBuilder histogramBuild = new MailHistogramBuilder();
        
        Histogram histogram = new Histogram();
        
        histogram = histogramBuild.Build(maillist.read(fileName));
                
        //histogramBuild.Build(maillist.read(fileName));

        
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }


    
}
