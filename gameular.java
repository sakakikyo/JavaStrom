
package jery_152455;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
public class gameular extends Applet implements Runnable{
     Thread runner;
    int xpos=50,ypos=100,x=40;
    int x2pos=25,y2pos=100;
    int x3pos=0,y3pos=100;
    int h=20,w=20,a=10,b=10;
    int c=10,d=10,e=10,f=10;
    int i=10,j=10;
    
     public void start() {
      if (runner == null); {
      runner = new Thread(this);
      runner.start();
  }
  }
  
  public void stop () {
      if (runner != null); {
      runner.stop();
      runner = null;
  }
  }
  public void run() {
        setBackground(Color.black);
       
        for (x=0; x<800; x+=5) {
               if(xpos==180){
                     xpos+=15;
                     x2pos+=10;
                     x3pos+=5;
                   a=0;b=0; w=30;h=30;
                repaint();
                try {
                    Thread.sleep(100);
                }
                
                catch (InterruptedException e) { }
               }
               else if(xpos==370) {
                     xpos+=25;
                   x2pos+=15;
                   x3pos+=5;
                     c=0;d=0;w=40;h=40;
                repaint();
                try {
                    Thread.sleep(100);
                }
                
                catch (InterruptedException e) { }
            
                }
               else {
                     xpos+=5;
                     x2pos+=5;
                     x3pos+=5;
                 
                repaint();
                try {
                    Thread.sleep(100);
                }
                
                catch (InterruptedException e) { }
            
              }
               
            }
                       //xpos=530;
                        //x2pos=530;
                        //x3pos=530;
                   //y2pos=75;
                   //y3pos=55;
                        for (x=1;x<= 13; x+=1){
                             ypos+=6;
                             if(x2pos<=xpos )
                             { x2pos+=3;
                              y2pos+=3;
                              x3pos+=6;
                            
                             }
                      repaint();
                              try {
                    Thread.sleep(100);
                }
                
                catch (InterruptedException e) { }
                              
                         }
                        /*
                         for (ypos=100;ypos<=185;ypos+=5){
                           repaint();
                              try {
                    Thread.sleep(100);
                }
                
                catch (InterruptedException e) { }
                              
                         }  
                        for (x2pos=530;x2pos<xpos;x2pos+=5){
                           
                           repaint();
                              try {
                    Thread.sleep(100);
                }
                
                catch (InterruptedException e) { }
                              
                         }  
                         for (y2pos=100;y2pos<=140;y2pos+=5){
                           
                           repaint();
                              try {
                    Thread.sleep(100);
                }
                
                catch (InterruptedException e) { }
                              
                         }  
                        for (x3pos=570;x3pos<xpos;x3pos+=5){
                            //y3pos+=5;
                           repaint();
                              try {
                    Thread.sleep(100);
                }
                
                catch (InterruptedException e) { }
                              
                         }  
                         
                         */
                         
                        
        for (x=100; x<= 250; x+=5) {
                
                     ypos +=5;
                     y2pos+=5;
                     y3pos+=5;
                repaint();
                try {
                    Thread.sleep(100);
                }
                
                catch (InterruptedException e) { }
            
              //  }
            }
               /*          xpos=540;
                        x2pos=510;
                        x3pos=480;
                   y2pos=y3pos=ypos;
 for (x=40; x< 505; x+=5) {
                 xpos+=5;
                 
                     x2pos+=5;
                     x3pos+=5;
                 
                repaint();
                try {
                    Thread.sleep(100);
                }
                
                catch (InterruptedException e) { }
            
               
               
            }    */        
            
  }
   public void paint (Graphics g){
      g.setColor(Color.red);
      
      g.fillOval(xpos, ypos, w, h);
      g.fillOval(x2pos, y2pos, w, h);
      g.fillOval(x3pos, y3pos, w, h);
      g.setColor(Color.blue);
     g.fillRect(200, 100, a, b);
     g.fillRect(400, 115, c, d);
    //g.setColor(Color.green);
     //g.fillRect(540, 200, e, f);
     // g.fillRect(540, 350, j, i);
      
       
                
                
  }
}
