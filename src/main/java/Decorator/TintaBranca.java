package Decorator;

public class TintaBranca extends ReformaDecorator{
    public TintaBranca(Reforma reforma){
        super(reforma);
    }
    public float getCusto(){
        return 360.00f;
    }


}
