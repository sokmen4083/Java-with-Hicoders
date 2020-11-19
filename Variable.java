public class Variable {
    public static void main(String[] args) {
    
        byte sayiByte= 5;
        short sayiShort=15;
        int sayiInt=10;
        long sayiLong=13;
        
        float sayiFloat=5.665859f; 
        /*Float tipindeki değişkende 
        sonda f koymamız gerekiyor.*/
        double sayiDouble=9.687845654665d; 
        /*Double değikeninde d koymak zorunlu değil.*/
        
        char unicodeAyYildiz='\u262A'; //Tek karakter tutabiliyor
        boolean dogruMu=true; //True yada False değerini alabiliyor.
        
        System.out.println("Byte = "+sayiByte);
        System.out.println("Short = "+sayiShort);
        System.out.println("Int = "+sayiInt);
        System.out.println("Long = "+sayiLong);
        
        System.out.println("Float = "+sayiFloat);
        System.out.println("Double = "+sayiDouble);
        
        System.out.println("Char = "+unicodeAyYildiz);
        System.out.println("Boolean = "+dogruMu);  
    }
    
}
