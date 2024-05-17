package main;

import java.util.ArrayList;
import java.util.List;

public class Result {
    List<Integer> ObjectIndices = new ArrayList<Integer>();
    int num;
    int sumWeight;
    int sumVal;
    @Override public String toString(){
        String str ="Object indices:\n";
        for (int i=0;i<ObjectIndices.size(); i++){
            str += ObjectIndices.get(i).toString()+"\n";
        }
        str+="\nTotal value: "+sumVal+"\tTotal weight: "+sumWeight;
        return str;
    }

    Result(List<Integer> l,int sumWeight, int sumVal){
        this.ObjectIndices = l;
        this.sumWeight = sumWeight;
        this.sumVal = sumVal;
    }
}
