
package Sample;

public class Test extends Soyut_class{ // By creating a subclass of the abstract class, we can continue our operations here, thanks to heredity
    
    public void Oliver(){
        System.out.println("I am Benjamin");
    }
    
    public void Anna(){ // Override
        System.out.println("I am Anna Claire");
    }
    
    public void Benjamin() {
        System.out.println("I am Benjamin");
    }
    
    public void Elizabeth(){
        System.out.println("I am Elizabeth");
    }

    
    
    
    int c = 35;
    
    public void funcA() {
        
        System.out.println("Result: " + super.a + super.b + c);
        
        // We use super to use the value of a and b in the Super_Abstract class here
        super.funcA();
    }
}
