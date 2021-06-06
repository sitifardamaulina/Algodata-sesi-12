
public class Rekursif {

    public static void main(String[] args) {
        
        //System.out.println(pangkat(8,2));
        
        //for (int = 0; i < 10; i++) ;
        //System.out.println((i + 1) + " : " + fibonacci(i));
                
        
        //System.out.println(deret(7));
        
        //System.out.println(nameRepeat("Siti Farda", 1)));
    }
   
    
        
  
    public static int pangkat(int angka, int eksponen) {
        if (eksponen == 1 ) {
            return angka;
        } else {
            return angka * pangkat(angka, eksponen -1);
        }
       
    }
    
    public static int fibonacci(int n) {
        if ( n == 0) {
            return 0;
        }
        
        if ( n == 1){
            return 1;
        }
        
        if ( n == 1){
            return 1;
        }
        
        return (fibonacci(n - 1) + fibonacci(n - 2));
           
    }
   
    
    public static int deret(int n) {
        System.out.println(n);
        
        if (n > 100) {
            return n;
        } else {
            return deret(n + 2);
        }
        
    }
    
    public static String nameRepeat(String nama, int n) {
        System.out.println(nama);
        if (n == 99) {
            return nama;
        } else {
            return nameRepeat(nama, n + 1);
     }
    
    }
}
    
    

