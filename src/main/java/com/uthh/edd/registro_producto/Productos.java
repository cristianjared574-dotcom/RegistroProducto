/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.registro_producto;

/**
 *
 * @author Chris
 */

//Alumno Christian Jared Santiago Hernandez
public class Productos {
    
    //atributos tipos de datos abstractos
    private String producto;
    private float precio;
    private int existencia;
    
    //constructor parametrizado, recibe los valores que se ingresen en la interfaz
    public Productos(String _producto, float _precio, int stock){
       producto = _producto;
       precio = _precio;
       existencia = stock;
    }
    
    //propiedades de producto 
    public String getProducto(){
        return producto;
    }
    
    //propiedades del precio, valida que no haya numeros negativos
    public void setPrecio(float Precio){
        if(Precio > 0){
          this.precio = Precio;
        }
    }
    //
    public int getStock(){
        return existencia;
    }
    
    /*propiedades de la existencia del producto, igual manera valida que no
    haya numeros negativos*/
    
    public void setStock(int Existencia){
        if(Existencia > 0){
           this.existencia = Existencia;
        }
    }
    
    //metodo de agregar producto, primero valida que la cantidad a ingresar sean mayores a 0
    public void AgregarProducto(int cantidad){
        if(cantidad > 0){
            existencia += cantidad;
        }
    }
    
    /*metodo para descontar productos,este metodo valida que la cantidad que se va 
    a descontar del investario no pasen del stock*/
    public void RetirarUnidades(int cantidad){
       if(cantidad > 0 && cantidad <= existencia){
           existencia -= cantidad;
       } 
    }    
    
    //metodo con recursividad para consultar costo por la cantidad de productos que ingresa el usuario
    public float ConsultarCostoPorCantidad(int cantidad){
        if(cantidad == 0){
            return 0;
        }
        return precio + ConsultarCostoPorCantidad(cantidad-1);
    }
    
    //metodo para calcular el costo total, la existencia por el precio del producto
    public float CostoTotaldelproducto(){
        return precio * existencia;
    }
}
