package models;

import interfaces.Icamareira;

public class Camareira extends Pessoa implements Icamareira  {

    public Camareira(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);

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
