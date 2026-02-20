/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_parcial1;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MenuPrincipal extends BaseGui{
    
    private JPanel panelPrincipal;
    private JButton btnAgregarItem, btnRentar, btnEjecutar, btnSalir, btnImprimir;
    private JLabel lblTitulo;
    public static ArrayList<RentItem> rentItems = new ArrayList<>();
    private Game game;
    
    
    
   public MenuPrincipal(){
       super("menu Principal", 615, 550);
       initComponents();
   }
   
   public void initComponents(){
       panelPrincipal = crearPanelPrincipal();
       panelPrincipal.setLayout(null);
       
       lblTitulo = crearLabelTitulo("menu principal", 175,20, 280,50);
       panelPrincipal.add(lblTitulo);
       
       btnAgregarItem= crearbtn("Agregar Item");
       btnAgregarItem.setBounds(200, 105, 220, 50);
       panelPrincipal.add(btnAgregarItem);
       
       btnRentar = crearbtn("rentar");
       btnRentar.setBounds(200,185,220,50);
       panelPrincipal.add(panelPrincipal);
       
       btnEjecutar = crearbtn("Ejecutar Submenú");
        btnEjecutar.setBounds(200, 265, 220, 50);
        panelPrincipal.add(btnEjecutar);

        btnImprimir = crearbtn("Ver items registrados");
        btnImprimir.setBounds(200, 345, 220, 50);
        panelPrincipal.add(btnImprimir);

        btnSalir = crearbtn("Salir");
        btnSalir.setBounds(480, 455, 80, 40);
        btnSalir.setBackground(Color.red);
        panelPrincipal.add(btnSalir);
       
        
        
        btnSalir.addActionListener(e-> dispose());
        btnAgregarItem.addActionListener(e -> agregarItem());
        btnRentar.addActionListener(e -> Rentar());
        btnImprimir.addActionListener(e -> imprimirTodo());
        btnEjecutar.addActionListener(e -> ejecutarSubMenu());
       
        
        setContentPane(panelPrincipal);
   }
    
    private void agregarItem(){
       
        
        
        
        
        
        
    }
    
    public void Rentar(){
        
        
        
        
        
        
        
    }
    
    private void imprimirTodo(){
        
        
        
    }
    
    
    private void ejecutarSubMenu(){
        
    }
    
    
    
}
