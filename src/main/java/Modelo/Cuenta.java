/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public abstract class Cuenta {
    private String NumeroCuenta;
    private String Titular;
    private Fecha FechaApertura;
    public double Saldo;

    public Cuenta(String NumeroCuenta, String Titular, Fecha FechaApertura, double Saldo) {
        this.NumeroCuenta = NumeroCuenta;
        this.Titular = Titular;
        this.FechaApertura = FechaApertura;
        this.Saldo = Saldo;
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public Fecha getFechaApertura() {
        return FechaApertura;
    }

    public void setFechaApertura(Fecha FechaApertura) {
        this.FechaApertura = FechaApertura;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    
    public void consignar(double Valor) {
        if (Valor > 0) {
            this.Saldo += Valor;
        }
    }
    public abstract boolean retirar(double valor);
    
    public String obtenerDatos() {
        return "N° Cuenta: " + NumeroCuenta + "\n" +
               "Titular: " + Titular + "\n" +
               "Fecha Apertura: " + FechaApertura + "\n" +
               "Saldo: $" + (Saldo);
    }
    public String obtenerDatos(boolean SaldoValido) {
        if (SaldoValido) {
            return "Saldo actual: $" + (Saldo);
        }
        return obtenerDatos();
    }
}
