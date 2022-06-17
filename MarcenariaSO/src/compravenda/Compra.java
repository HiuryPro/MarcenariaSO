/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compravenda;

import java.util.ArrayList;
import pessoa.Fornecedor;

/**
 *
 * @author Hiury
 */
public class Compra extends Transacao {

    public ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
    public ArrayList<Materia_Prima> materiasprimas = new ArrayList<Materia_Prima>();

    public String nomeFornecedor;
    public String nomeMP;
    private float freteCompra;

 
    public Compra(ArrayList<Fornecedor> forn, ArrayList<Materia_Prima> mP){
        fornecedores = forn;
        materiasprimas = mP;
        
        
    }
    
   

    public void CalculaPrecoT(int qtd, String mp, String forn) {
        float total;
        for (int i = 0; i < fornecedores.size(); i++) {
            if (fornecedores.get(i).getNome().equals(forn)) {
                for (int j = 0; j < fornecedores.get(i).nomeMP.size(); j++) {
                    if (fornecedores.get(i).nomeMP.get(j).equals(mp)) {
                        total = qtd * Float.parseFloat(fornecedores.get(i).precoF.get(j)) + Float.parseFloat(fornecedores.get(i).frete.get(j));
                           System.out.println(total);
                        setPrecoTotal(total);
                        atualizaEstoque(mp, qtd);
                    }

                }

            }
        }

    }

    public void setFrete(String nomeFor, String MP) {
        for (int i = 0; i < fornecedores.size(); i++) {
            if (fornecedores.get(i).getNome().equals(nomeFor)) {
                for (int j = 0; j < fornecedores.get(i).nomeMP.size(); j++) {
                    if (fornecedores.get(i).nomeMP.get(j).equals(MP)) {
                        freteCompra = Float.parseFloat(fornecedores.get(i).frete.get(j));
                    }

                }

            }
        }
    }

    public float getFrete() {
        return freteCompra;
    }

    public void atualizaEstoque(String nome, int qtd) {
        int estoque;
        for (int i = 0; i < materiasprimas.size(); i++) {
            if (materiasprimas.get(i).nome.equals(nome)) {
                estoque = materiasprimas.get(i).quantEstoque;
                materiasprimas.get(i).quantEstoque = estoque - qtd;
            }

        }

    }

    public ArrayList<Materia_Prima> getEstoqueA() {

        return materiasprimas;

    }

}
