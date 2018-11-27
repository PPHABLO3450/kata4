/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

import java.util.List;

/**
 *
 * @author wwwam
 */
public class MailHistogramBuilder {

    public MailHistogramBuilder() {
    }
    
    

     Histogram<Mail> Build(List<Mail> emails) {
        Histogram histogram = new Histogram();
        
        for(int i = 0; i < emails.size(); i++){
            histogram.increment(emails.get(i).getDomain());        
        }
        return histogram;
    }

}
