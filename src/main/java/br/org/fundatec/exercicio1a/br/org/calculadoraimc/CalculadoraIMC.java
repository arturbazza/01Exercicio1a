package br.org.fundatec.exercicio1a.br.org.calculadoraimc;

public class CalculadoraIMC {
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}