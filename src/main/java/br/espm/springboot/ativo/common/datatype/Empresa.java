package br.espm.springboot.ativo.common.datatype;

public class Empresa {

    private String id;
    private String nome;
    private String simbolo;

    // Get 
    public String getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getSimbolo(){
        return simbolo;
    }


    // Set
    public void setId(String id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSimbolo(String simbolo){
        this.simbolo = simbolo;
    }

    
}
