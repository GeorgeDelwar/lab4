/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject5;

import javax.swing.JComponent;
import java.awt.image.*;
import java.awt.*;

/**
 *
 * @author Dell-PC
 */
public class JImageDisplay extends JComponent {

 
    private BufferedImage displayImage;
    
  
    public JImageDisplay(int width, int height) {
        displayImage = new BufferedImage(width, height,
        BufferedImage.TYPE_INT_RGB);
        Dimension imageDimension = new Dimension(width, height);
        super.setPreferredSize(imageDimension);
        
    }


    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(displayImage, 0, 0, displayImage.getWidth(),
        displayImage.getHeight(), null);
    }
 
    public void clearImage()
    {
        int[] blankArray = new int[getWidth() * getHeight()];
        displayImage.setRGB(0, 0, getWidth(), getHeight(), blankArray, 0, 1);
    }
 
    public void drawPixel(int x, int y, int rgbColor)
    {
        displayImage.setRGB(x, y, rgbColor);
    }
}