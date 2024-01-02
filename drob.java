public class drob {
    public int many = 3; //зачем?
    public int a; //целое 
    public int b; //числ
    public int c; //знам
    
    public drob(int _a, int _b, int _c){
        a = _a;
        b = _b;
        c = _c;
    }
    public void pravelnoe(){
        a = (a * c + b) / c;
        b = (a * c + b) % c;
        //System.out.println(this);
    }

    public void nepravilnaia(){ //поправить
        b = a * c + b;
        a = 0;
    }
    public void slojenie(){
         
    }
    
    @Override
    public String toString() {
        return "Drob: " + a +"  " + b +"  " + c;
    }
}  
    
