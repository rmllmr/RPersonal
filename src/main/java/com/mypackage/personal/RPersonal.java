package com.mypackage.personal; /**
 * Created by LuMoR on 16.02.2017.
 */
import com.mypackage.personal.BasePersonal;

import java.util.*;

public class RPersonal{
    public static void main(String[] args){
        Map<BasePersonal, Integer> baseRPersonal= new HashMap<BasePersonal, Integer>();
        baseRPersonal.put(new BasePersonal("Katya", "Petrova", 20, "01.02.1985"), 9545);
        baseRPersonal.put(new BasePersonal("Katya", "NePetrova", 25, "01.02.1985"), 9545);
        baseRPersonal.put(new BasePersonal("Ira", "NePetrova", 25, "01.02.1985"), 9545);

        for (BasePersonal rPersonal: BaseUtil.findName(baseRPersonal,"Katya").keySet()
             ) {
            System.out.println(rPersonal.getSurname());
            
        }
        baseRPersonal.equals(new BasePersonal("Katya","Petrova", 21, "01.02.1980"));

    }
}
