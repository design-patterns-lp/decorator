package Decorator;

public class Lixa extends ReformaDecorator{

    public Lixa(Reforma reforma){
        super(reforma);
    }
    public float getCusto (){
        return 20.00f;
    }


}
