
package Ornek;

class Yan_sinif extends Super_soyut{
    
    private int a = 34;
    
    public void fonkA() {
        
        System.out.println("İçinde " + a);
        
        System.out.println("in subclass with super" + super.a);
        
        super.fonkA();
    }
}
