package Decorator;

public abstract class ReformaDecorator implements Reforma{

    private Reforma reforma;

    public ReformaDecorator(Reforma reforma){
        this.reforma = reforma;
    }

    public Reforma getReforma() {
        return reforma;
    }

    public void setReforma(Reforma reforma) {
        this.reforma = reforma;
    }

    public abstract float getCusto();


    public float getOrcamento(){
        return this.reforma.getOrcamento() + this.getCusto();
    }

}
