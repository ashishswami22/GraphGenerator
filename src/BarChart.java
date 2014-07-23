package GraphGenerator;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

public class BarChart extends JFrame implements MouseListener{
    private int totalpoints;
    private double values[];
    private String lbl[];
    
    public BarChart(){
        totalpoints=0;
        setSize(700,700);
        setTitle("Generated Graph");
        addMouseListener(this);
    }
    

    public String[] getLbl() {
        return lbl;
    }

    public void setLbl(String[] lbl) {
        this.lbl = lbl;
    }

    public int getTotalpoints() {
        return totalpoints;
    }

    public void setTotalpoints(int totalpoints) {
        this.totalpoints = totalpoints;
    }

    public double[] getValues() {
        return values;
    }

    public void setValues(double[] values) {
        this.values = values;
        double max=0;
        for(int i=0;i<values.length;i++){
            if(values[i]>max)
                max=values[i];
        }
        if(max>500){
                for(int i=0;i<values.length;i++){
                    values[i]=values[i]/max * 500;
                }
        }
    }
                ///// mapping all the values on 0-500 scale. max converted to 500
    
    
    public void paint(Graphics g){
                
	g.setColor(Color.red);
	g.drawLine(25,550,575,550); //X-Axsis.
	g.drawLine(50,25,50,575); //Y-Axsis.
               
	g.setColor(Color.black);
	for(int j=50;j<550;j+=50){	//iteration for Y-Axsis intervals
            g.drawLine(45,j,575,j);
	}		
            
	for(int i=(500/totalpoints),j=0;i<=575;i+=(500/totalpoints),j++){   //iteration for X-Axsis intervals
            g.drawLine(i,545,i,555);
            if(i<550){
                g.setColor(Color.cyan);
		g.fillRect(i-5,550-(int)(values[j]),10,(int)(values[j]));	
		g.setColor(Color.black);
		g.drawString(lbl[j], i-5, 580);
            }
        } 
        
    }
    
      @Override
    public void mouseReleased(MouseEvent e) {
        String path=JOptionPane.showInputDialog(this, "Enter path (with filename in the end) to save the graph as png file. \nMake sure that the directory has write permission. \nUse \\\\ instead of \\");
        if(path!=null){
        BufferedImage image = (BufferedImage)createImage(getContentPane().getSize().width,getContentPane().getSize().height);
        paint(image.getGraphics());
        try{
            ImageIO.write(image, "png", new File(path));
            JOptionPane.showMessageDialog(this, "Image saved");
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(this, "Had trouble saving the image");
        }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

  
}