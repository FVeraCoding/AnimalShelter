/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz.tablemodels;


import actores.Perro;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Fernando
 */
public class PerrosTableModel extends AbstractTableModel{

    private List<Perro> listaPerros;
    private String[] columnas = {"Nombre", "Raza", "Peso", "Color", "Sexo"};
    
    public PerrosTableModel(List<Perro> listaPerros){
        this.listaPerros = listaPerros;
    }
    
    
    @Override
    public int getRowCount() {
        return listaPerros.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: 
                return listaPerros.get(rowIndex).getNombre();
                
            case 1: 
                return listaPerros.get(rowIndex).getRaza();
                
            case 2: 
                return listaPerros.get(rowIndex).getPeso();
                
            case 3:
                return listaPerros.get(rowIndex).getColor();
                
            case 4:
                return listaPerros.get(rowIndex).getSexo();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];   
    }
    
    
    
}
