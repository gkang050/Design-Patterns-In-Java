
//Abstract Factory patterns work around a super-factory which creates other factories
public abstract class AbstractFactory {
   abstract Color getColor(String color);
   abstract Shape getShape(String shape) ;
}