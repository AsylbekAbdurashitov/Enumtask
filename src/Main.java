import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /***Күндөргө enum түзүңүз (Monday, Tuesday ...)
         Консолдон бир күндү белгилеңиз. Эгер Monday болсо - анда "Дуйшөмбү куну жава окуйм" же Tuesday болсо -
         анда "Шейшемби күнү англис тили сабагын окуйм" деп күнгө жараша кайсы сабакты окуганыңызды консолго чыгарыңыз.
         Жуманын күндөрүн кыргыз тилинде көрсөтүңүз.*/



        Days days=Days.SHEISHEMBI;
switch (days){
    case   DUISHOMBU: System.out.println(days.toString());
    break;
    case   SHEISHEMBI: System.out.println(days.toString());
    break;
    case   SHARSHEMBI:System.out.println(days.toString());
    break;
    case    BEISHEMBI: System.out.println(days.toString());
    break;
    case   JUMA: System.out.println(days.toString());
    break;
    case   ISHEMBI: System.out.println(days.toString());
    break;
    case   JEKSHEMBI : System.out.println(days.toString());
    break;
}


        }
    }
