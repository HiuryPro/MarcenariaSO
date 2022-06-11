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

    private ArrayList<Materia_Prima> materiasPrimas = new ArrayList<Materia_Prima>();
    public String cnpj;
    public float frete;
    public int quantidadeF;
    public float precoF;
    public int contador = 0;
    public String inscE;
    public String descricao;

    public ArrayList<Materia_Prima> getMateriasPrimas() {

        return materiasPrimas;

    }
}
