
package Ornek;

abstract class Soyut_sinif implements Interface_sinifi { // interface sınıfını implement ettiğimiz abstract class'ımızı oluşturuyoruz
    
    public void Faruk(){
        System.out.println("Benim adım Faruk");
    }
    
    protected int a = 10;
    protected int b = 5;
    public void fonkA() {
        System.out.println("Sonuç: " + this.b + this.a);
    }
}
