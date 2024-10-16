/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz.tablemodels;

import actores.Gato;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Fernando
 */
public class GatosTableModel extends AbstractTableModel{

    private List<Gato> listaGatos;
    private String[] columnas = {"Nombre", "Raza", "Peso", "Color", "Sexo"};
    
    public GatosTableModel(List<Gato> listaGatos){
        this.listaGatos = listaGatos;
    }
    
    
    @Override
    public int getRowCount() {
        return listaGatos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: 
                return listaGatos.get(rowIndex).getNombre();
                
            case 1: 
                return listaGatos.get(rowIndex).getRaza();
                
            case 2: 
                return listaGatos.get(rowIndex).getPeso();
                
            case 3:
                return listaGatos.get(rowIndex).getColor();
                
            case 4:
                return listaGatos.get(rowIndex).getSexo();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];   
    }
    
    
    
}
