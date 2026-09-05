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
    double valor1;
    double valor2;
    double somaDasNotas;
private double mediaDasNotas;
private int quantidadeDeAlunos;
private double somaDasMedias;
private double maiorMedia;

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    
    public double somaDasNotas(){
        this.somaDasNotas = valor1 + valor2;
    return somaDasNotas;
    }
    
    public double mediaDasNotas(){
        quantidadeDeAlunos++;
        this.mediaDasNotas = somaDasNotas/2;
        
        somaDasMedias += mediaDasNotas;
    if(mediaDasNotas > maiorMedia){
        maiorMedia = mediaDasNotas;
    }
    return mediaDasNotas;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }
    
    public double mediaDaTurma(){
        if(quantidadeDeAlunos >= 1){
            return somaDasMedias/quantidadeDeAlunos;
        }
    return 0;
    }

    public double getMaiorMedia() {
        return maiorMedia;
    }

    
}
