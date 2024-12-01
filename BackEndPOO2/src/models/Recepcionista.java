package models;

import interfaces.Irecepcionista;

public class Recepcionista extends Pessoa implements Irecepcionista {

    public Recepcionista(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
        
    }

    @Override
    public void saberAtenderOTelefone() {
        System.out.println("Sei atender o telfone!"+"\n");
    }

    @Override
    public void saberFalarIngles() {
        System.out.println("Sei falar ingles!"+ "\n");
    }
    
}
