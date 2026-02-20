/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_parcial1;

import java.util.Calendar;

/**
 *
 * @author HP
 */
public class Movie extends RentItem{
    
    private Calendar fechaEstreno;
    
    public Movie(int codItem, String nombItem, double precioBase){
    super(codItem, nombItem, precioBase, 0, null);
    this.fechaEstreno = Calendar.getInstance();
    }
    
    public void setFechaEstrano(Calendar fechaEstreno){
        this.fechaEstreno = fechaEstreno;
    }
    
    public Calendar getFechaEstreno(){
        return fechaEstreno;
    }
    
    public String getEstado(){
        Calendar hoy = Calendar.getInstance();
        
        int anioEstreno = fechaEstreno.get(Calendar.YEAR);
        int mesEstreno = fechaEstreno.get(Calendar.MONTH);
        
        int anioActual = hoy.get(Calendar.YEAR);
        int mesActual = hoy.get(Calendar.MONTH);
        
        int mesesDif = (anioActual-anioEstreno)*12+(mesActual-mesEstreno);
        
        if(mesesDif <3){
            return "ESTRENO";
        }else{
            return "NORMAL";
        }
    }
    
    @Override
    public String toString(){
        return super.toString()+"| Estado: "+getEstado()+" - Movie";
    }
    
    @Override
    public double pagoRenta(int dias){
        double total = precioBase*dias;
        String estado = getEstado();
        if("ESTRENO".equals(estado) && dias > 2){
            total+= 50.0*(dias-2);
        }else if("NORMAL".equals(estado) && dias > 5){
            total+= 30.0*(dias-5);
        }
        return total;
    }
}
