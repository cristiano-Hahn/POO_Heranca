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
public class BemImovel extends BemPatrimonial{
    private float area;
    private float vlrUltimoIPTU; 
    
    public BemImovel(String descricao, Date dataAquisitacao, Integer numeroIdentificacao, float area, float vlrUltimoIPTU) {
        super(descricao, dataAquisitacao, numeroIdentificacao);
        this.area = area;
        this.vlrUltimoIPTU = vlrUltimoIPTU;
    }
    
}
