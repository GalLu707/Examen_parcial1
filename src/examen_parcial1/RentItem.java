/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_parcial1;

import javax.swing.ImageIcon;

/**
 *
 * @author Nathan
 */
public abstract class RentItem {
    protected int codItem;
    protected String nombItem;
    protected double precioBase;
    protected int cantCopias;
    protected ImageIcon imagen;

    public RentItem(int codItem, String nombItem, double precioBase, int cantCopias, ImageIcon imagen) {
        this.codItem = codItem;
        this.nombItem = nombItem;
        this.precioBase = precioBase;
        this.cantCopias = 0;
        this.imagen = null;
    }

    public int getCodigo() {
        return codItem;
    }

    public String getNombre() {
        return nombItem;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    
    @Override
    public String toString(){
     return codItem+" - "+nombItem+" |Precio Base: "+precioBase+" Lps.";   
    }
    
    public abstract double pagoRenta(int dias);
}
