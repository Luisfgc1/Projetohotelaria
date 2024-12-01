import java.util.ArrayList;
import java.util.stream.Stream;

import models.Camareira;
import models.Cliente;
import models.EnumTipo;
import models.Gerente;
import models.Quarto;
import models.Recepcionista;

public class App{
    public static void main(String[] args) {
        System.out.println("Hotel java" + "\n");

       
        
        Recepcionista recepcionista1 = new Recepcionista("Valeria", "12345678", "987654321-09");

        recepcionista1.saberAtenderOTelefone();
        recepcionista1.saberFalarIngles();

        Camareira camareira1 = new Camareira("joana", "839098765", "456787654-87");

        camareira1.arrumarCama();
        camareira1.limparOQuarto(); 

        Gerente gerente1 = new Gerente("Caio", "8399555338", "12792264470");
        gerente1.saberFalarIngles();

        Quarto quarto1 = new Quarto("206A", 100.0,EnumTipo.MASTER);
        Quarto quarto2 = new Quarto("306A", 250.0, EnumTipo.PRESIDENCIAL);
       
        

        System.out.println(quarto2);

        Cliente cliente1 = new Cliente("Manuel", "839123123123", "123456789-01",42);
        Cliente cliente2 = new Cliente("Graça", "839123123123", "123456789-02",17);
        Cliente cliente3 = new Cliente("Izabella", "839123123123", "123456789-03",21);
        Cliente cliente4 = new Cliente("Gabriel", "839123123123", "123456789-04",36);

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);

        // sao iguais e retorna o numero de elementos de uma lista
        System.out.println(clientes.size());

    






    }
}