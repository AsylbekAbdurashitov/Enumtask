import java.util.Arrays;

public enum Days {
//    Дуйшомбу - понедельник
//    Шейшемби - вторник
//    Шаршемби - среда
//    Бейшемби - четверг
//    Жума - пятница
//    Ишемби - суббота
//    Жекшемби - воскресение
DUISHOMBU("kunu-Java okuim"),
    SHEISHEMBI("kunu-English sabagyn okuim"),
    SHARSHEMBI("kunu-Soft skills sabagyn okuim"),
    BEISHEMBI("kunu-Praktika kylabyz"),
    JUMA("kunu-Teoria okuibuz"),
    ISHEMBI("kunu-Oz aldyncha okuibuz"),
    JEKSHEMBI("kunu-Es alabyz");
String Sabaktarym;

    Days(String sabaktarym) {
        Sabaktarym = sabaktarym;
    }

    public String getSabaktarym() {
        return Sabaktarym;
    }

    public void setSabaktarym(String []sabaktarym) {
        Sabaktarym = Arrays.toString(sabaktarym);
    }

    @Override
    public String toString() {
        return super.toString()+" "+
                 Sabaktarym ;

    }
}
