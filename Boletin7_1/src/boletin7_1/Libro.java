/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Martínez
 */
public class Libro {
    private String libro,autor;
    private int numeroLibros,numeroPrestados;
    //constructor con parametros
    
    public Libro(){
      libro = JOptionPane.showInputDialog("Introduzca el titulo del libro: ");
      autor = JOptionPane.showInputDialog("Introduzca el autor del libro");
      numeroLibros = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de ejemplares del libro: "));
      numeroPrestados = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de libros prestados:"));
      
     
    }
    
    //constructor por defecto

    public Libro(String libro, String autor, int numeroLibros, int numeroPrestados) {
        this.libro = libro;
        this.autor = autor;
        this.numeroLibros = numeroLibros;
        this.numeroPrestados = numeroPrestados;
    }

    //Setters y getters
    
    public String getLibro() {
        return libro;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroLibros() {
        return numeroLibros;
    }

    public int getNumeroPrestados() {
        return numeroPrestados;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroLibros(int numeroLibros) {
        this.numeroLibros = numeroLibros;
    }

    public void setNumeroPrestados(int numeroPrestados) {
        this.numeroPrestados = numeroPrestados;
    }
    
    //Metodo prestamo, este aumenta el numero de prestados y disminuye los numeros de ejemplares
    
    public boolean Prestamo(){
        if (this.numeroLibros>0) {
            numeroLibros -=1;
            numeroPrestados +=1;
            return true;
            
        }
        else{
            return false;
        }
    }
    
    //Metodo devolucion, disminuye el numero de prestados y aumento los numeros de ejemplares
    public boolean Devolucion(){
        if (this.numeroPrestados>0){
            numeroLibros +=1;
            numeroPrestados -=1;
            return true;
        }
        else{
            return false;
        }
    }
    
   
   
   
    
   
    
    
    
}
