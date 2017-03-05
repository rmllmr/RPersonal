package com.mypackage.personal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by LuMoR on 05.03.2017.
 */
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
        this.birthday = BaseUtil.stringToDate(BD);
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }


}
