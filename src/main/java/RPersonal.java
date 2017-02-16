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

    public Date stringToDate(String strBD) throws ParseException {
        SimpleDateFormat strDate = new SimpleDateFormat();
        strDate.applyPattern("dd.MM.yyyy");
        try {
            Date docDate= strDate.parse(strBD);
            return docDate;
        } catch (ParseException e) {
            e.printStackTrace();
            return strDate.parse("01.01.2000");
        }



    }
}

public class RPersonal{
    public static void main(String[] args){
        Map<Integer, BasePersonal> baseRPersonal= new HashMap<Integer, BasePersonal>();
        baseRPersonal.put(1, new BasePersonal("First", "First", 20, "01.02.1980"));

    }
}
