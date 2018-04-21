/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrimonio;

import java.util.Date;

/**
 *
 * @author Cristiano Hahn
 */
public class BemPatrimonial {
    private String descricao;
    private Date dataAquisitacao;
    private Integer numeroIdentificacao;
    private TpSituacao situacao;

    public BemPatrimonial(String descricao, Date dataAquisitacao, Integer numeroIdentificacao) {
        this.descricao = descricao;
        this.dataAquisitacao = dataAquisitacao;
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataAquisitacao(Date dataAquisitacao) {
        this.dataAquisitacao = dataAquisitacao;
    }

    public void setNumeroIdentificacao(Integer numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public void setSituacao(TpSituacao situacao) {
        this.situacao = situacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getDataAquisitacao() {
        return dataAquisitacao;
    }

    public Integer getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public TpSituacao getSituacao() {
        return situacao;
    }
    
    public void colocarEmInventario(){
        if (situacao == TpSituacao.TOMBADO){
            situacao = TpSituacao.INVENTARIO;
        }
    }
    
    public void tombar(){
        situacao = TpSituacao.TOMBADO;        
    }
    
    public void baixar(){
        if (situacao == TpSituacao.TOMBADO){
            situacao = TpSituacao.BAIXADO;        
        }
    }  
}
