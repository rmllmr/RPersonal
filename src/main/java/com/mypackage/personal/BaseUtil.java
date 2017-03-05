package com.mypackage.personal;

import jdk.internal.dynalink.beans.StaticClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by LuMoR on 05.03.2017.
 */
public class BaseUtil {
    public static Map<BasePersonal, Integer> findName(Map<BasePersonal, Integer> localBasePersonal, String seachName){
        Map<BasePersonal, Integer> returnBasePersonal = new HashMap<BasePersonal, Integer>();
        for (BasePersonal rPersonal: localBasePersonal.keySet()
                ) {
            if (rPersonal.getName().equals(seachName)){
                returnBasePersonal.put(rPersonal,localBasePersonal.get(rPersonal));
            }
        }
        return returnBasePersonal;
    }

    public static Date stringToDate(String strBD) {
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


