/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_parcial1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;


public class BaseGui extends JFrame {
    
    private final Font fuentebase = new Font("Comic Sans MS", Font.BOLD,14);
    
    public BaseGui(String titulo, int w, int h){
        super(titulo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(w,h);
        setLocationRelativeTo(null);

    }
    
    protected JButton crearbtn(String txt){
      JButton b = new JButton(txt);
      
      b.setFont(fuentebase);
      b.setBackground(new Color(235,238,255));
      b.setForeground(Color.BLACK);
      b.setFocusPainted(false);
      b.setBorder(new EmptyBorder(10,16,10,16));
      b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      b.setOpaque(true);
      
      return b;
    }
    
    protected JTextField crearTextField(int x, int y, int w, int h){
       JTextField tf = new JTextField();
       tf.setFont(fuentebase.deriveFont(14f));
       tf.setBounds(x,y,w,h);
       tf.setBorder(new CompoundBorder(
       new LineBorder(new Color(220, 220, 220),1,true),
       new EmptyBorder(10,12,10,12)
       ));
       
       return tf;
    }
    
    protected JLabel crearLabelTitulo(String txt, int x, int y, int w, int h){
       JLabel label = new JLabel(txt);
       label.setFont(label.getFont().deriveFont(32f));
       label.setBounds(x, y, w, h);
       
       return label;
    }
    
    protected JPanel crearPanelPrincipal(){
        JPanel p = new JPanel(new BorderLayout()){
        
            @Override
            protected void paintComponent(Graphics d){
                super.paintComponent(d);
                Graphics2D g2 = (Graphics2D) d.create();
                GradientPaint gp = new GradientPaint(0,0, new Color(245,248,255), getWidth(), getHeight(), new Color(225, 235, 250));
              g2.setPaint(gp);
              g2.fillRect(0, 0, getWidth(), getHeight());
              g2.dispose();
            }
        };
        return p;
    }
    
    protected JScrollPane crearTable(String[] colum, Object[][] datos,int rh){
       JTable tbl = new JTable(datos, colum);
       Color primario = new Color(33,150, 243);
       
       tbl.setShowHorizontalLines(false);
       tbl.setShowVerticalLines(false);
       tbl.setRowHeight(rh);
       
       tbl.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
           
           public Component getTableCellRendererConent(JTable t, Object v, boolean s, boolean f, int r, int c){
               super.getTableCellRendererComponent(t, v, s, f, r, c);
               setFont(fuentebase.deriveFont(14f));
               setForeground(Color.WHITE);
               setBackground(primario);
               setBorder(new EmptyBorder(10, 12, 10, 12));
               setHorizontalAlignment(SwingConstants.CENTER);
               setOpaque(true);
               return this;
           }
           
           
       });
       
       tbl.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
           
           @Override
           public Component getTableCellRendererComponent(JTable t, Object v, boolean s, boolean f, int r, int c){
             super.getTableCellRendererComponent(t, v, s, f, r, c);
             setOpaque(false);
             setBorder(new EmptyBorder(8,12,8,12));
             return this;
           }
           
       });
       
       tbl.setIntercellSpacing(new Dimension(0,0));
       JScrollPane scroll = new JScrollPane(tbl);
       scroll.setBorder(null);
       scroll.setViewportBorder(null);
       scroll.setOpaque(false);
       scroll.getViewport().setOpaque(false);
       
       return scroll;
    } 
    
    
    
    
}
