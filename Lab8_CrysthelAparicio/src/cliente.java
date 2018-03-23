
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author COPECO -13
 */
public class cliente {

    private String nombre;
    private int cuenta;
    private String contraseña;
    private ArrayList<productos> producto = new ArrayList<>();
    private String id;
    private double saldo;

    public cliente() {
    }

    public cliente(String nombre, int cuenta, String contraseña, String id, double saldo) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.contraseña = contraseña;
        this.id = id;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<productos> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<productos> producto) {
        this.producto = producto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
