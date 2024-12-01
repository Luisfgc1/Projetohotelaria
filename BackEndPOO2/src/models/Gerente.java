package models;

import interfaces.Icamareira;
import interfaces.Irecepcionista;

public class Gerente extends Pessoa implements Icamareira,Irecepcionista {

    public Gerente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void saberAtenderOTelefone() {
        System.out.println("Sei atender o telfone!");
    }

    @Override
    public void saberFalarIngles() {
        System.out.println("Sei falar ingles!");
    }
    @Override
    public void arrumarCama() {
        System.out.println("Sei arrumar a cama!");
    }
    
    @Override
    public void limparOQuarto() {
        System.out.println("Sei limpar o quarto!");
    }
  

}