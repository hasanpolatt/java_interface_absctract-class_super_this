
package Sample;

class Sub_class extends Super_abstract{
    
    private int a = 34;
    
    public void funcA() {
        
        System.out.println("İçinde " + a);
        
        System.out.println("in subclass with super" + super.a);
        
        super.funcA();
    }
}
