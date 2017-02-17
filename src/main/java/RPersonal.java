/**
 * Created by LuMoR on 16.02.2017.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class BasePersonal {
    private String name;
    private String surname;
    private int age;
    private Date birthday;

    public BasePersonal(String N, String SN, int A, String BD){
        this.name = N;
        this.surname = SN;
        this.age = A;
        this.birthday = stringToDate(BD);
    }

    public Date stringToDate(String strBD) {
        SimpleDateFormat strDate = new SimpleDateFormat();
        strDate.applyPattern("dd.MM.yyyy");
        try {
            Date docDate= strDate.parse(strBD);
            return docDate;
        } catch (ParseException e) {
            e.printStackTrace();
            try {
                return strDate.parse("01.01.2000");
            } catch (ParseException e1) {
                e1.printStackTrace();
            }
        }
        return null;
    }
}

public class RPersonal{
    public static void main(String[] args){
        Map<BasePersonal, Integer> baseRPersonal= new HashMap<BasePersonal, Integer>();
        baseRPersonal.put(new BasePersonal("First", "First", 20, "01.02.1980"), 0452);
        baseRPersonal.put(new BasePersonal("Second", "Second", 25, "01.05.1985"), 0245);
        baseRPersonal.
        baseRPersonal.get(new )
    }
}
