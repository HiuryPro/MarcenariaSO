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

 
   
    public void CalculaPrecoT(int i) {
        
       this.precoTotal = fornecedores.get(i).quantidadeF + fornecedores.get(i).precoF + fornecedores.get(i).frete;
       
    }
    
    
    
    
    
}
