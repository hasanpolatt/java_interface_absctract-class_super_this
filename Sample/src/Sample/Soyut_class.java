
package Sample;

abstract class Soyut_class implements Interface_class { // We create our abstract class where we implements interface_class
    
    public void Anna(){
        System.out.println("I am Anna");
    }
    
    protected int a = 10;
    protected int b = 5;
    public void funcA() {
        System.out.println("Result: " + this.b + this.a);
    }
}
