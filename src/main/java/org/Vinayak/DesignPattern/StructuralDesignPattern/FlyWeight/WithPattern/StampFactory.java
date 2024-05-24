package org.Vinayak.DesignPattern.StructuralDesignPattern.FlyWeight.WithPattern;


import java.util.HashMap;
import java.util.Map;

public class StampFactory {

     static Map<String,Stamp> stampMap = new HashMap<>();

    public static Stamp getStamp(String stamp){
        if (stampMap.containsKey(stamp)){
            return stampMap.get(stamp);
        }else{
            if(stamp.equalsIgnoreCase("APPROVED")){
                ApprovedStamp approvedStamp = new ApprovedStamp("BLUE","APPROVED");
                stampMap.put(stamp,approvedStamp);
                return stampMap.get(stamp);
            }else if(stamp.equalsIgnoreCase("UNAPPROVED")){
                UnApprovedStamp approvedStamp = new UnApprovedStamp("RED","UNAPPROVED");
                stampMap.put(stamp,approvedStamp);
                return stampMap.get(stamp);
            }
        }
    return null;
    }
}
