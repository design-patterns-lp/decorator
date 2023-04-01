package Decorator;

public class Rejunte extends ReformaDecorator{
    public Rejunte(Reforma reforma){
        super(reforma);
    }
    public float getCusto(){
        return 18.00f;
    }

}
