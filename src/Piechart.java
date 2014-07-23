package GraphGenerator;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Piechart extends JFrame implements MouseListener{
    private int totalpoints;
    private double values[];
    private String lbl[];
        
    public Piechart(){
        totalpoints=0;
        setSize(700,700);
        setTitle("Generated Piechart");
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
        double sum=0;
        for(int i=0;i<values.length;i++){
                sum+=values[i];
        }
        if(sum>360){
                for(int i=0;i<values.length;i++){
                    values[i]=360*(values[i]/sum);
                }
        }
    }
                ///// mapping all the values on 0-500 scale. max converted to 500
    
    
    public void paint(Graphics g){
                
        g.drawOval(50,50,550,550);
        int red=80;
        int green=40;
        int blue=20;
        int prevAngle=0;
        
        int lblx=50;
        int lbly=620;
        
        g.setFont(new Font("arial", Font.BOLD, 13));
        Color colors[]=new Color[]{Color.BLACK,Color.red,Color.green,Color.orange,Color.blue,Color.MAGENTA,Color.darkGray,Color.orange};
        
        
        for(int j=0, c=0;j<totalpoints;j++){
            g.setColor(colors[c++]);
            if(c==colors.length-1){
                c=0;
            }
            
            if(j==totalpoints-1){
                 g.fillArc(50,50,550,550, prevAngle, 360-prevAngle);
            }else{
                 g.fillArc(50,50,550,550, prevAngle, (int)values[j]);
            }
            
            prevAngle+=(int)values[j];
            
            g.drawString(lbl[j],lblx,lbly);
           
            lblx+=80;
            if(lblx>600){
                lblx=50;
                lbly+=30;
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