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
public class BemMovel extends BemPatrimonial{
    private String notaFiscal;
    private String fornecedor;

    public BemMovel(String descricao, Date dataAquisitacao, Integer numeroIdentificacao, String notaFiscal, String fornecedor) {
        super(descricao, dataAquisitacao, numeroIdentificacao);
        this.notaFiscal = notaFiscal;
        this.fornecedor = fornecedor;
    }
    
    public void setnotaFiscal(String value){
        this.notaFiscal = value;
    }
    
    public void setfornecedor(String value){
        this.fornecedor = value;
    }
    
    public String getFornecedor(){
        return fornecedor;
    }
    
    public String getnotaFiscal(){
        return notaFiscal;
    }
}
