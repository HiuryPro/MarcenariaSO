/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

import compravenda.Materia_Prima;
import java.util.ArrayList;

/**
 *
 * @author Hiury
 */
public class Fornecedor extends Pessoa {

    public ArrayList<String> nomeMP = new ArrayList<String>();
    public ArrayList<String> precoF = new ArrayList<String>(); // Na hora de fazer a venda transformo eles em float
    public ArrayList<String> frete = new ArrayList<String>();  // Na hora de fazer a venda transformo eles em float
    
    public String cnpj;
    public int quantidadeF;
    public int contador = 0;
    public String inscE;
    public String descricao;

    
}
