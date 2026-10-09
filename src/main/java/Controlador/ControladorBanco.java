/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.*;
/**
 *
 * @author USUARIO
 */
public class ControladorBanco {
    private Cuenta cuenta;
    public void CrearCuentaAhorros(String num, String titular, int d, int m, int a, double Saldo) {
        Fecha f = new Fecha(d, m, a);
        this.cuenta = new CuentaAhorros(num, titular, f, Saldo);
    }
    public void crearCuentaCorriente(String num, String titular, int d, int m, int a, double saldo, double sobregiro) {
        Fecha f = new Fecha(d, m, a);
        this.cuenta = new CuentaCorriente(num, titular, f, saldo, sobregiro);
    }
    public boolean HayCuenta() {
        return cuenta != null;
    }

    public boolean consignar(double valor) {
        if (cuenta != null && valor > 0) {
            cuenta.consignar(valor);
            return true;
        }
        return false;
    }

    public boolean retirar(double valor) {
        if (cuenta != null) {
            return cuenta.retirar(valor);
        }
        return false;
    }

    public String consultarDatos(boolean SaldoValido) {
        if (cuenta == null) return "No hay ninguna cuenta creada.";
        return cuenta.obtenerDatos(SaldoValido);
    }
}

