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

    private int quantidade;
    private float precoUnit;
    public float precoTotal;

    public abstract void CalculaPrecoT(int i);

    public void setQuantidade(int novoQ) {
        quantidade = novoQ;
    }

    public void setPrecoU(int preco) {
        precoUnit = preco;
    }

    public float getPrecoU() {
        return precoUnit;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
