/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author Pedro
 */
public class CalcularMedia {
   private double soma;
   private int quantidadeDeNumeros;
   private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
        this.soma = this.soma + valor;
        quantidadeDeNumeros++;
    }
   
    public double somaDeNumeros(){
    return soma;
    }

    public int getQuantidadeDeNumeros() {
        return quantidadeDeNumeros;
    }
    
    public double media(){
    if(quantidadeDeNumeros >= 1){
    return soma/quantidadeDeNumeros;
    }
    return 0;
    }
}