package DesignPattern.FactoryMethod;

public class CandyFactory {
    private CandyFactory(){}
    public static Candy getCandy(CandyType candyType){
//        switch (candyType){
//            case MINTY :
//                return new MintyCandy();
//            case HARD :
//                return new HardCandy();
//            default :
//                throw  new IllegalArgumentException("This candy type is unsupported");
//        }
        if(candyType == CandyType.MINTY)
            return new MintyCandy();
        else if(candyType == CandyType.HARD)
            return new HardCandy();
        else return null;
    }
}
