/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compravenda;

/**
 *
 * @author Hiury
 */
public abstract class Transacao {

    public int quantidade;
    public float precoUnit;
    public float precoTotal;
    public String data;
    protected float precoBruto;

    public abstract void CalculaPrecoT(int qtd, String item, String pessoa);

    public abstract void CalculaPrecoT(int qtd, String pessoa);
    
    public float getPrecoBruto(){
        return precoBruto;
    }
    public void setQuantidade(int novoQ) {
        quantidade = novoQ;
    }

    public void setPrecoU(float preco) {
        precoUnit = preco;
    }

    public void setPrecoTotal(float precoT) {
        precoTotal = precoT;
    }

    public float getPrecoU() {
        return precoUnit;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }
}
