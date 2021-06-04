package people;
import java.util.Scanner;
class Singer {
    String fam, im;
    int rating, kolvo;
}
public class people {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");

        System.out.println("Введите количество певцов => ");
        int kol = sc.nextInt();
        sc.nextLine();
        Singer[] sotr = new Singer[kol];
        System.out.println("Введите информацию о каждом певце: ");
        for (int i = 0; i < sotr.length; i++) {
            sotr[i] = new Singer();
            System.out.print("Введите фамилию " + (i + 1) + " сотрудника => ");
            sotr[i].fam = sc.nextLine();

            System.out.print("Введите его имя => ");
            sotr[i].im = sc.nextLine();

            System.out.print("Введите его рейтинг => ");
            sotr[i].rating = sc.nextInt();

            System.out.print("Введите его количество выпущенных альбомов => ");
            sotr[i].kolvo = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("\n Сотрудники фирмы: \n фам \t имя \t рейтинг \t альбомы");
        for (Singer s : sotr) {
            System.out.print(s.fam + "\t" + s.im + "\t " + s.rating + "\t\t" + s.kolvo + "\n");
        }
        int nommax = 0;
        double max = sotr[nommax].rating;
        for (int i = 0; i < sotr.length; i++)
            if (sotr[i].rating > max) {
                max = sotr[i].rating;
                nommax = i;
            }

        System.out.println("\nСамый популярный певец :");
        System.out.println("" + sotr[nommax].fam + "\t" + sotr[nommax].im + "\t" + "с "+sotr[nommax].kolvo + " альбомами");
        double s=0;
        for (int i = 0; i < kol; i++)
            { s += sotr[i].kolvo;
            }

                double sr =s/kol;
        double sredalb=0;
        for (int i=0;i<kol;i++){
            if (sotr[i].kolvo>sr){
                sredalb+=1;
            }
        }
                System.out.println("\nсреднее количество альбомов:"+ s/sotr.length+"");
        System.out.println("\nисполнители с количеством выпущенных альбомов больше среднего:"+ sredalb+"");

    }
}
