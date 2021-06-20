import java.util.Scanner;

class trr{
    String name, fam, mes;
    double rat;
}
public class theathre1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько всего театров, вы хотите записать? ");
        int n = sc.nextInt();
        trr trr1[] = new trr[n];

        System.out.println("Введите информацию: ");
        for (int i = 0; i < trr1.length; i++) {
            sc.nextLine();
            trr1[i] = new trr();
            System.out.print("Введите название театра: ");
            trr1[i].fam = sc.nextLine();
            System.out.print("введите художественного руководителя: ");
            trr1[i].name = sc.nextLine();
            System.out.print("Введите рейтинг: ");
            trr1[i].rat = sc.nextDouble();
            System.out.print("Введите адресс: ");
            trr1[i].mes = sc.nextLine();
        }


        int maxrat=0;
        double max=trr1[maxrat].rat;
        for (int i = 0; i < trr1.length; i++)
            if (trr1[i].rat>maxrat) {
                max= trr1[i].rat;
                maxrat=i;
            }
        System.out.println("\n ");
        System.out.println("определить театр с самым большим рейтингом: "+ trr1[maxrat].fam +"  " +trr1[maxrat].name+"\t"+trr1[maxrat].rat);

        double s = 0;
        for (int i = 0; i < trr1.length; i++)
            s=trr1[i].rat;
        double sr=trr1.length;

        System.out.println("\nОтсортированный список:");
        for (int i = 0; i < trr1.length; i++) {
            System.out.println(""+trr1[i].fam + " театр "+"\t"+trr1[i].name + " руководитель ");

        }

        sc.nextLine();
        System.out.println("- ЭТО ПОИСКОВИК -");
        System.out.println("Введите название театра, которого хотите найти:  ");
        String fam=sc.nextLine();
        int nom=-1;

        for (int i = 0; i < trr1.length; i++)
            if (fam.equalsIgnoreCase(trr1[i].fam))

                nom=i;
        if (nom!= -1) {
            System.out.println("Такой театр у вас есть " +trr1[nom].fam+" "+trr1[nom].name+ " "+trr1[nom].rat + " рейтинг "  +trr1[nom].mes + " адрес");
        }else System.out.println("Ошибка! такого театра в этом списке нет. Проверьте правильность введенных данных");

    }
}

