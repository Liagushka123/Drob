public class drob {
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
    }

    public void nepravilnaia(){ 
        b = a * c + b;
        a = 0;
    }
    
    public drob slojenie(drob nameDrob){
        return new drob(a + nameDrob.a, b * nameDrob.c + nameDrob.b * c, c * nameDrob.c);
    }
    
    public drob vichitanie(drob lDrob){
        return new drob(a - lDrob.a,b * lDrob.c - lDrob.b * c, c * lDrob.c);
    }
    
    public drob ymnojenie(drob Xdrob){
        Xdrob.nepravilnaia();
        this.nepravilnaia();
        return new drob(a * Xdrob.a,b * Xdrob.b,c * Xdrob.c);
    }
    
    public drob dilenie(drob Mdrob){
        this.nepravilnaia();
        Mdrob.nepravilnaia();
        return new drob(a * Mdrob.a,b * Mdrob.c, c * Mdrob.b );
    }
    
    public void socrashenie(){
        int h = 2;
        while(h <= b ){
            if (b % h == 0 && c % h == 0) {
                System.out.println("делитель: "+h );
                b = b / h;
                c = c / h;
            }
            else{
                h = h+1;
            }
        }
    }
    
    @Override
    public String toString() {
        return "Drob: " + a +"  " + b +"  " + c;
    }
}    
