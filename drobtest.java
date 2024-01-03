public class drobtest {
    
    public static void main(String[] args){
        drob test = new drob(2, 16, 3);
        drob dsd = new drob(1, 4, 7);
        drob test1 = new drob(0, 8, 12);
        // System.out.println("dsd: " + dsd);
        // dsd.pravelnoe();
        // System.out.println("dsd: " + dsd);
        // dsd.nepravilnaia();
        // System.out.println("dsd: " + dsd);

        // System.out.println("test: " + test);
        // test.pravelnoe();
        // System.out.println("test: " + test);
        // test.nepravilnaia();
        // System.out.println("test: " + test );   
        
        drob ddrob =  test.slojenie(dsd);
        System.out.println(ddrob);
        drob gDrob = test.vichitanie(dsd);
        System.out.println(gDrob);
        drob zDrob = test.ymnojenie(dsd);
        System.out.println(zDrob);
        drob pDrob = test.dilenie(dsd);
        System.out.println(pDrob);
        dsd.socrashenie();
        System.out.println(dsd);
        pDrob.socrashenie();
        System.out.println(pDrob);
        test1.socrashenie();
        System.out.println(test1);

    }
    
}
