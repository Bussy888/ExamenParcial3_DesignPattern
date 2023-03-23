package Templates.T5Decorator;

public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("ConcreteComponent > operation");
    }
}
