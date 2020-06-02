
package Ornek;

public class Test extends Soyut_sinif{ // soyut sınıfın alt sınıfını oluşturarak kalıtım ile diğer işlemlerimizi burada da devam ettirebiliriz
    
    public void Ali(){
        System.out.println("Benim adım Ali");
    }
    
    public void Faruk(){ //Override
        System.out.println("Benim adım Ömer Faruk");
    }
    
    public void Ayse() {
        System.out.println("Benim adım Ayşe");
    }
    
    public void Zeynep(){
        System.out.println("Benim adım Zeynep");
    }

    
    
    
    int c = 35;
    
    public void fonkA() {
        
        System.out.println("Sonuç: " + super.a + super.b + c);
        
        //SuperAbstract sınıfındaki a ve b nin değerini burada kullanabilmek için super kullanıyoruz
        super.fonkA();
    }
}
