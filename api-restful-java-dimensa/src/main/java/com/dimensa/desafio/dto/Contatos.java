package com.dimensa.desafio.dto;

public class Contatos {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String dataNascimento;
    private Enderecos listaEnderecos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Enderecos getListaEnderecos() {
        return listaEnderecos;
    }

    public void setListaEnderecos(Enderecos listaEnderecos) {
        this.listaEnderecos = listaEnderecos;
    }
}
