package Social;

import java.util.ArrayList;

public class Usuario {
    //listar antes ajuda a organizar o que fazer//
    //Esta classe vai ter que fazer uma postagem//
    //Esta classe vai ter relaçâo com a classe...//
    //Esta classe vai poder interagir com as postagens//

    //ctrl + d = duplica//

    private String nome;
    private String email;
    private String senha;
    private String nascimento;
    private ArrayList<Postagem> postagems

    public Usuario(String nome, String email, String senha, String nascimento, Postagens postagem) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nascimento = nascimento;
        this.postagems = postagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    public void comentar(){
        this.comentar();
    }
}
