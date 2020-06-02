
package Sample;

abstract class Soyut_class implements Interface_class { // interface sınıfını implement ettiğimiz abstract class'ımızı oluşturuyoruz
    
    public void Anna(){
        System.out.println("Benim adım Anna");
    }
    
    protected int a = 10;
    protected int b = 5;
    public void funcA() {
        System.out.println("Sonuç: " + this.b + this.a);
    }
}
