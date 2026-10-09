/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class CuentaAhorros extends Cuenta {
    public CuentaAhorros(String numeroCuenta, String titular, Fecha fechaApertura, double SaldoInicial) {
        super(numeroCuenta, titular, fechaApertura, SaldoInicial);
    }
    @Override
    public boolean retirar(double valor) {
        if (valor > 0 && valor <= Saldo) {
            Saldo -= valor;
            return true;
        }
        return false; 
    }
    
}
