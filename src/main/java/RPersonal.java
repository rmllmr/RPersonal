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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasePersonal that = (BasePersonal) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        return birthday != null ? birthday.equals(that.birthday) : that.birthday == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        return result;
    }

    public BasePersonal(){
        this("A","B",1,"01.01.1900");
    }

    public BasePersonal(String N, String SN, int A, String BD){
        this.name = N;
        this.surname = SN;
        this.age = A;
        this.birthday = stringToDate(BD);
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public Map<BasePersonal, Integer> findName(Map<BasePersonal, Integer> localBasePersonal, String seachName){
        Map<BasePersonal, Integer> returnBasePersonal = new HashMap<BasePersonal, Integer>();
        for (BasePersonal rPersonal: localBasePersonal.keySet()
                ) {
            if (rPersonal.getName().equals(seachName)){
                returnBasePersonal.put(rPersonal,localBasePersonal.get(rPersonal));
            }
        }
        return returnBasePersonal;
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
        baseRPersonal.put(new BasePersonal("Katya", "Petrova", 20, "01.02.1985"), 9545);
        baseRPersonal.put(new BasePersonal("Katya", "NePetrova", 25, "01.02.1985"), 9545);
        baseRPersonal.put(new BasePersonal("Ira", "NePetrova", 25, "01.02.1985"), 9545);

        for (BasePersonal rPersonal: new BasePersonal().findName(baseRPersonal,"Katya").keySet()
             ) {
            System.out.println(rPersonal.getSurname());
            
        }
        baseRPersonal.equals(new BasePersonal("Katya","Petrova", 21, "01.02.1980"));

    }
}
