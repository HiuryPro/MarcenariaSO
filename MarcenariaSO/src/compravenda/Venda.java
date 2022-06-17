/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compravenda;

import java.util.ArrayList;
import pessoa.Cliente;

/**
 *
 * @author Hiury
 */
public class Venda extends Transacao {

    ArrayList<Movel> moveis = new ArrayList<Movel>();
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    ArrayList<Materia_Prima> materiasprimas = new ArrayList<Materia_Prima>();

    public String nomeMovel;
    private float descontoV;
    public String nomeCliente;
    public float lucro;
    
    
    public Venda(ArrayList<Movel> mov, ArrayList<Cliente> clien, ArrayList<Materia_Prima> mP){
        moveis = mov;
        clientes = clien;
        materiasprimas = mP;
    }
            
            
            
    
    
    
    

    public void CalculaPrecoT(int qtd, String mov, String cliente) {
        float total;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNome().equals(cliente)) {
                for (int j = 0; j < moveis.size(); j++) {
                    if (moveis.get(j).nome.equals(mov)) {
                        total = (qtd * (moveis.get(j).custoDeProducao + lucro)) - ((qtd * (moveis.get(j).custoDeProducao + lucro)) * (clientes.get(i).desconto / 100));
                        setPrecoTotal(total);
                        atualizaEstoque(mov, qtd);
                    }
                }

            }
        }
    }

    public void setDesconto(String cliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNome().equals(cliente)) {
                descontoV = clientes.get(i).desconto;
            }
        }
    }

    public float getDesconto() {
        return descontoV;

    }

    public void atualizaEstoque(String nome, int qtd) {
        int estoque;
        int quantGasta;
        for (int i = 0; i < moveis.size(); i++) {
            if (moveis.get(i).nome.equals(nome)) {
                for (int x = 0; x < materiasprimas.size(); x++) {
                    for (int j = 0; j < moveis.get(i).materiaP.size(); j++) {
                        if (materiasprimas.get(x).nome.equals(moveis.get(i).materiaP.get(j))) {
                            quantGasta = moveis.get(i).qtd.get(j);
                            estoque = materiasprimas.get(x).quantEstoque;
                            materiasprimas.get(x).quantEstoque = estoque - (quantGasta * qtd);
                        }
                    }
                }

            }
        }
    }

    public ArrayList<Materia_Prima> getEstoqueA() {

        return materiasprimas;

    }

}
