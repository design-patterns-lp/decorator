package Decorator;

public class ReformaSala implements Reforma{
    public float orcamento;

    public ReformaSala(){
    }

    public ReformaSala(float orcamento){
        this.orcamento = orcamento;
    }

    public float getOrcamento(){
        return orcamento;
    }


}
