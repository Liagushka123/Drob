public class drobtest {
    
    public static void main(String[] args){
        drob test = new drob(2, 16, 3);
        drob dsd = new drob(1, 4, 7);
        
        System.out.println("dsd: " + dsd);
        dsd.pravelnoe();
        System.out.println("dsd: " + dsd);
        dsd.nepravilnaia();
        System.out.println("dsd: " + dsd);

        System.out.println("test: " + test);
        test.pravelnoe();
        System.out.println("test: " + test);
        test.nepravilnaia();
        System.out.println("test: " + test );   
    }
    
}
