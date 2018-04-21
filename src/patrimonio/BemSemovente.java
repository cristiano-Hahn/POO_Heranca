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
public class BemSemovente extends BemPatrimonial{
    private Date datanascto;

    public BemSemovente(String descricao, Date dataAquisitacao, Integer numeroIdentificacao, Date datanascto, TpAnimal animal) {
        super(descricao, dataAquisitacao, numeroIdentificacao);
        this.animal = animal;
        this.datanascto = datanascto;
    }

    public void setDatanascto(Date datanascto) {
        this.datanascto = datanascto;
    }

    public void setAnimal(TpAnimal animal) {
        this.animal = animal;
    }

    public Date getDatanascto() {
        return datanascto;
    }

    public TpAnimal getAnimal() {
        return animal;
    }
    private TpAnimal animal;
}
