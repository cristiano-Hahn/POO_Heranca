/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrimonio;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author Cristiano Hahn
 */
public class Patrimonio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BemImovel casa = new BemImovel("casa",Date.from(Instant.MIN),1,120f, 2200f);
        BemSemovente touro = new BemSemovente("Mineiro",Date.from(Instant.MIN), 1,Date.from(Instant.MIN),TpAnimal.CAPRINO);
        BemMovel carro = new BemMovel("Carro", Date.from(Instant.MIN),123, "ModeloDeNota", "Fiat");
        
        casa.getDescricao();
        casa.setSituacao(TpSituacao.TOMBADO);
        casa.getNumeroIdentificacao();
        
        touro.setAnimal(TpAnimal.BOVINO);
        touro.getDatanascto();
        touro.getSituacao();
        touro.colocarEmInventario();
        
        carro.setNumeroIdentificacao(500);
        carro.tombar();
        carro.getSituacao();
    }
    
}
