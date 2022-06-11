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

    ArrayList<Materia_Prima> materiasprimas = new ArrayList<Materia_Prima>();
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    
    public void CalculaPrecoT(int i) {

       // this.precoTotal = getQuantidade() + fo).precoF + fornecedores.get(i).frete;

    }

}
