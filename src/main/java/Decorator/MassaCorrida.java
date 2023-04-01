package Decorator;

public class MassaCorrida extends ReformaDecorator{

    public MassaCorrida(Reforma reforma){
        super(reforma);
    }
    public float getCusto(){
        return 40.00f;
    }


}
