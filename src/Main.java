import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача на циклы "Автобус и мосты"
        /*
        * Оргкомитет олимпиады решил организовать обзорную экскурсию
        * для участников олимпиады. Для этого был заказан
        * двухэтажный автобус высотой 437 сантиметров.
        * На экскурсионном маршруте встречаются N мостов.
        * Жюри и оргкомитет олимпиады очень обеспокоины тем,
        * что высокий автобус может не проехать под одним из них.
        * Им удалось выяснить точную высоту каждого из мостов.
        * Автобус может проехать под мостом тогда и только тогда,
        * когда высота моста превосходит высоту автобуса.
        * Помогите организаторам узнать, закончится ли экскурсия
        * благополучно, а если нет то установить, где
        * произойдет авария.
        *
        * Входные данные:
        * Сначала содержится число N (1<=N<=1000).
        * Далее идут N натуральных чисел, не превосходящих
        * 10000 - высоты мостов в см в том порядке, в котором они
        * встречают на пути автобуса.
        *
        * Выходные данные:
        * В единственную строку выходного файла нужно ввести
        * фразу "No crash", если экскурия закончится благополучно.
        * Если же произойдет авария, то нужно вывести собщеение
        * "Crash i", где i - номер моста, где произойдет авария.
        * */
            Scanner in = new Scanner(System.in);
            int t = 0; // высота мостов
            int t2 = 437; //высота автобуса
            int i = 1; //кол-во мостов
            int N = in.nextInt(); // кол-во мостов
            while (i <= N){ //скорее всего здесь  <=, чем <
                t = in.nextInt();
                if (t < t2) {
                    System.out.println("Crash " + i);
                    break;
                }
                i++;
            }
            if(t > t2){
                System.out.println("No crash");
            }
            //Выходные данные: (1 500) "";
                            // (4 500 400 550 500) "Crash 2";
                            // (3 500 555 300) "No crash"
            //Выходные данные (Елена): (1 500) "No crash";
                            // (4 500 400 550 500) "Crash 2";
                            // (3 500 555 300) "Crash 3"

    }
}