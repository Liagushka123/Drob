import java.util.Scanner;

public class drobtest {
    public static void main(String[] args){
        Scanner sdf = new Scanner(System.in);
        System.out.println("Здраствуйте.\n Рады приветствовать вас в нашем калькуляторе дробных чисел.\n Вы хотите создать дробь.\nВведите"  + " Yes " + "или " + "NO. " + "Соблюдайте регистер букв.");
        String vibr = sdf.nextLine();
        String vibr1 = "Yes";
        
        if(vibr.equals(vibr1)){
            System.out.println("О вы выбрали Да. я почтён вашим выбором.\nТогда не будем медлить и начнём.");
            System.out.println("введите целое число,числитель и знаменатель, соблюдайте порядок ввода.");
            int a = sdf.nextInt();
            int b = sdf.nextInt();
            int c = sdf.nextInt();
            drob kl = new drob( a, b, c);
            System.out.println("Отлично мы создали дробь." + a + " "  + b  + " " + c + " " + " это твоя дробь.");
            System.out.println("Ты можешь превратить дробь в правельную или не правильную.\nЕсли хочешь сделать дробь правельной  введи слово Правельная\nили\nВведи Неправильная если хочешь сделать её не правильной\nДля сложения введите Сложение\nДля вычитания Вычитание\nДля диления введите Диление\nДля умножения введите Умножение\nДля сокращения введите Сокращение\n Если вам нужно создать 2 дробь введите Создать\n");
            String vibru = sdf.nextLine();
            String vibr2 = "Правельная";
            String vibr3 = "Неправльная";
            String vibr4 = "Создание";
            String vibr5 = "сложение";
            
            if (vibru.equals(vibr2)) {
               kl.pravelnoe();
               System.out.println(kl); 
            }
            if (vibru.equals(vibr3)){
                kl.nepravilnaia();
                System.out.println(kl);
            }
            if(vibru.equals(vibr4)){
            System.out.println("введите целое число,числитель и знаменатель, соблюдайте порядок ввода.");
            int v = sdf.nextInt();
            int n = sdf.nextInt();
            int m = sdf.nextInt();
            drob lo = new drob( v, n, m);
            System.out.println("Отлично мы создали дробь." + v + " "  + n  + " " + m + " " + " это твоя дробь.");
            if () {
                
            }
            }




        } 
        else{
            System.out.println("Жаль что вы выбрали нет. Досвидания");
        }
    

        
    }

        
        
        
}

    


    

