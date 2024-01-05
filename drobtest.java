import java.util.Scanner;

public class drobtest {
    public static void main(String[] args){
        
        Scanner sdf = new Scanner(System.in, "cp866");
        System.out.println("Здраствуйте.\n Рады приветствовать вас в нашем калькуляторе дробных чисел.\n Вы хотите создать дробь.\nВведите"  + " Yes " + "или " + "NO. " + "Соблюдайте регистер букв.");
        
        String vibr = sdf.nextLine();
        String vibr1 = "Yes";
        
        while(vibr.equals(vibr1)){
            System.out.println("О вы выбрали Да. я почтён вашим выбором.\nТогда не будем медлить и начнём.");
            System.out.println("введите целое число,числитель и знаменатель, соблюдайте порядок ввода.");
            int a = sdf.nextInt();
            int b = sdf.nextInt();
            int c = sdf.nextInt();
            sdf.nextLine();
            drob kl = new drob( a, b, c);
            System.out.println("Отлично мы создали дробь. " + kl + " это твоя дробь.");
            System.out.println("Ты можешь превратить дробь в правильную или не правильную.\nЕсли хочешь сделать дробь правильной введи правильная \nили\nВведи неправильная если хочешь сделать её не правильной\nДля сложения введите +\nДля вычитания -\nДля деления введите /\nДля умножения введите *\nДля сокращения введите сокращение.Соблюдайте регистер букв.");
            
            String vibru = sdf.nextLine();
            String vibr2 = "правильная";
            String vibr3 = "неправильная";
            String vibr5 = "+";
            String vibr6 = "/";
            String vibr7 = "*";
            String vibr8 = "-";
            String vibr9 = "сокращение";
            
            System.out.println(vibru);

            if (vibru.equals(vibr2)) {
               kl.pravelnoe();
               System.out.println(kl); 
            }
            if (vibru.equals(vibr3)){
                kl.nepravilnaia();
                System.out.println(kl);
            }
            if (vibru.equals(vibr5)|vibru.equals(vibr6)|vibru.equals(vibr7)|vibru.equals(vibr8)) {
                System.out.println("введите целое число,числитель и знаменатель, соблюдайте порядок ввода.");
                int v = sdf.nextInt();
                int n = sdf.nextInt();
                int m = sdf.nextInt();
                sdf.nextLine();
                drob lo = new drob( v, n, m);
                System.out.println("Отлично мы создали дробь. " + lo + " это твоя дробь новая.");
                System.out.println("С новой дробью вам открыты операционные функции такие как сложение вычитание т.д");
                if(vibru.equals(vibr6)){
                    drob oi = kl.dilenie(lo);
                    System.out.println(oi);
                }
                if(vibru.equals(vibr5)){
                    drob oi = kl.slojenie(lo);
                    System.out.println(oi);
                }
                if(vibru.equals(vibr7)){
                    drob oi = kl.ymnojenie(lo);
                    System.out.println(oi);
                }
                if(vibru.equals(vibr8)){
                    drob oi = kl.vichitanie(lo);
                    System.out.println(oi);
                }
            }
            if(vibru.equals(vibr9)){
                kl.socrashenie();
                System.out.println(kl);
            }
            System.out.println("Введите Yes что бы продолжить или NO что бы закончить. Соблюдайте регистер букв.");
            vibr = sdf.nextLine();
        }
    }
}