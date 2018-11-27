/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

import javax.swing.JPanel;
import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.ChartPanel;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author pablo
 */
public class HistogramDisplay extends ApplicationFrame{
    
    Histogram<String> histogram = new Histogram<>();
    
    public HistogramDisplay(Histogram<String> histogram) {
        super("HISTOGRAMA");
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();
    }
    /**
     *
     */
    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart",
                                                        "Dominios email",
                                                        "Nºdeemails",
                                                        dataSet, 
                                                        PlotOrientation.VERTICAL, 
                                                        false, 
                                                        false, 
                                                        rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        for(String key: histogram.keySet()){
            dataSet.addValue(histogram.get(key), "",key);
        }
        
        return dataSet;
    }

}

