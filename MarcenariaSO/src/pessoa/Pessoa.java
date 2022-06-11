/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author Hiury
 */
public class Pessoa {

    protected String nome;
    protected String endereco;
    protected String cidade;
    protected String estado;
    protected String cpf;
    protected String email;
    protected String telefone;
    
    public void setNome(String novoN) {

        nome = novoN;
    }

    public void setCpf(String novoCpf) {

        cpf = novoCpf;
    }

    public void setEndereco(String novoEnd) {

        endereco = novoEnd;
    }

    public void setCidade(String novoCid) {

        cidade = novoCid;
    }

    public void setEstado(String novoEs) {

        estado = novoEs;
    }

    public String getNome() {

        return nome;
    }

    public String getCpf() {

       return cpf;
    }

    public String getEndereco() {

        return endereco;
    }

    public String getCidade() {

        return cidade;
    }

    public String getEstado() {

        return estado;
    }
    
    public void setEmail(String novoEm) {

        email = novoEm;
    }

    public String getEmail() {

        return email;
    }
    
     public void setTelefone(String novoTel) {

        telefone = novoTel;
    }

    public String getTelefone() {

        return telefone;
    }
}
