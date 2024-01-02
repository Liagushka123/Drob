public class drob {
    public int many = 3; //зачем?
    public int a; //что это?
    public int b; //что это?
    public int c; //что это?
    
    public drob(int _a, int _b, int _c){
        a = _a;
        b = _b;
        c = _c;
    }
    public void pravelnoe(){
         int s = a + b / c;
         int g = b % c;
               
        System.out.println( s + "  " + g + "  " + c);

    }

    public void nepravilnaia(){ //поправить
        int mnoj= a * c;
        b = b + mnoj;
        a = 0;
        System.out.println(this); 

    }
    public void slojenie(){
         
    }
    public void writtt(){
        System.out.println("Drob:" + a +"  " + b +"  " + c );
    }





}  
    
