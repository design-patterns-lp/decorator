package Decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReformaTest {

    @Test
    void deveRetornarOrcamentoReforma() {
        Reforma reforma = new ReformaSala(500.0f);
        assertEquals(500.0f, reforma.getOrcamento());
    }

    @Test
    void deveRetornarOrcamentoReformaUtilizandoMassaCorrida() {
        Reforma reforma = new MassaCorrida (new ReformaSala(500.0f));

        assertEquals(540.0f, reforma.getOrcamento());
    }

    @Test
    void deveRetornarOrcamentoReformaUtilizandoLixa() {
        Reforma reforma = new Lixa (new ReformaSala(500.0f));

        assertEquals(520.0f, reforma.getOrcamento());
    }

    @Test
    void deveRetornarOrcamentoReformaUtilizandoTintaBranca() {
        Reforma reforma = new TintaBranca (new ReformaSala(500.0f));

        assertEquals(860.0f, reforma.getOrcamento());
    }

    @Test
    void deveRetornarOrcamentoReformaUtilizandoMassaCorridaELixa() {
        Reforma reforma = new MassaCorrida(new Lixa(new ReformaSala(500.0f)));

        assertEquals(560.0f, reforma.getOrcamento());
    }

    @Test
    void deveRetornarOrcamentoReformaUtilizandoMassaCorridaETintaBranca() {
        Reforma reforma = new MassaCorrida(new TintaBranca(new ReformaSala(500.0f)));

        assertEquals(900.0f, reforma.getOrcamento());
    }

    @Test
    void deveRetornarOrcamentoReformaUtilizandoMassaCorridaERejunte() {
        Reforma reforma = new MassaCorrida(new Rejunte(new ReformaSala(500.0f)));

        assertEquals(558.0f, reforma.getOrcamento());
    }

    @Test
    void deveRetornarOrcamentoReformaUtilizandoLixaETintaBranca() {
        Reforma reforma = new Lixa(new TintaBranca(new ReformaSala(500.0f)));

        assertEquals(880.0f, reforma.getOrcamento());
    }

    @Test
    void deveRetornarOrcamentoReformaUtilizandoLixaERejunte() {
        Reforma reforma = new Lixa(new Rejunte(new ReformaSala(500.0f)));

        assertEquals(538.0f, reforma.getOrcamento());
    }

    @Test
    void deveRetornarOrcamentoReformaUtilizandoTintaBrancaERejunte() {
        Reforma reforma = new TintaBranca(new Rejunte(new ReformaSala(500.0f)));

        assertEquals(878.0f, reforma.getOrcamento());
    }

    @Test
    void deveRetornarOrcamentoReformaUtilizandoMassaCorridaELixaETintaBranca() {
        Reforma reforma = new MassaCorrida(new Lixa(new TintaBranca(new ReformaSala(500.0f))));

        assertEquals(920.0f, reforma.getOrcamento());
    }

    @Test
    void deveRetornarOrcamentoReformaUtilizandoMassaCorridaELixaERejunte() {
        Reforma reforma = new MassaCorrida(new Lixa(new Rejunte(new ReformaSala(500.0f))));

        assertEquals(578.0f, reforma.getOrcamento());
    }

    @Test
    void deveRetornarOrcamentoReformaUtilizandoMassaCorridaETintaBrancaERejunte() {
        Reforma reforma = new MassaCorrida(new TintaBranca(new Rejunte(new ReformaSala(500.0f))));

        assertEquals(918.0f, reforma.getOrcamento());
    }

    @Test
    void deveRetornarOrcamentoReformaUtilizandoLixaETintaBrancaERejunte() {
        Reforma reforma = new Lixa(new TintaBranca(new Rejunte(new ReformaSala(500.0f))));

        assertEquals(898.0f, reforma.getOrcamento());
    }

    @Test
    void deveRetornarOrcamentoReformaUtilizandoMassaCorridaELixaERejunteETintaBrancaEReformaSala() {
        Reforma reforma = new MassaCorrida(new Lixa(new Rejunte(new TintaBranca(new ReformaSala(500.0f)))));

        assertEquals(938.0f, reforma.getOrcamento());
    }



}