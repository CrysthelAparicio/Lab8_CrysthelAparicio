/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_crysthel;

import java.util.ArrayList;

public class cliente {

    private String cuenta;
    private String nombre;
    private String usuario;
    private String contraseña;
    private ArrayList<productos> productos = new ArrayList();
    private String ID;
    private double saldo;

    public cliente() {
    }

    public cliente(String cuenta, String nombre, String usuario, String contraseña, String ID, double saldo) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.ID = ID;
        this.saldo = saldo;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<productos> getProductos() {
        return productos;
    }

    public void setProductos(productos productos) {
        this.productos.add(productos);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
