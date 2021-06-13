package br.espm.springboot.ativo.common.datatype;

import java.math.BigDecimal;
import java.util.Date;

public class Ativo {

    private String id;
    private Empresa empresa;
    private BigDecimal valor;
    private Date data;

    // Get 
    public String getId(){
        return id;
    }

    public Empresa getEmpresa(){
        return empresa;
    }

    public BigDecimal getValor(){
        return valor;
    }

    public Date getData(){
        return data;
    }

    // Set
    public void setId(String id){
        this.id = id;
    }

    public void setEmpresa(Empresa empresa){
        this.empresa = empresa;
    }

    public void setValor(BigDecimal valor){
        this.valor = valor;
    }

    public void setData(Date data){
        this.data = data;
    }
    
}
