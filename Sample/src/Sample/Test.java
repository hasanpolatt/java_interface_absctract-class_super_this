
package Sample;

public class Test extends Soyut_class{ // soyut sınıfın alt sınıfını oluşturarak kalıtım ile diğer işlemlerimizi burada da devam ettirebiliriz
    
    public void Oliver(){
        System.out.println("Benim adım Benjamin");
    }
    
    public void Anna(){ // Override
        System.out.println("Benim adım Anna Claire");
    }
    
    public void Benjamin() {
        System.out.println("Benim adım Benjamin");
    }
    
    public void Elizabeth(){
        System.out.println("Benim adım Elizabeth");
    }

    
    
    
    int c = 35;
    
    public void func() {
        
        System.out.println("Sonuç: " + super.a + super.b + c);
        
        //SuperAbstract sınıfındaki a ve b nin değerini burada kullanabilmek için super kullanıyoruz
        super.funcA();
    }
}
