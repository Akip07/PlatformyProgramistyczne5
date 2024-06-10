package main;

import java.util.*;

public class Problem {
    int objCatNum;
    Item[] objectCategories;
    int seed;
    int upperBound;
    int lowerBound;

    public Problem(int n, int seed, int lowerBound, int upperBound){
        this.objCatNum = n;
        this.seed = seed;
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;

        Random rnd = new Random(seed);
        int x = (rnd.nextInt(upperBound-lowerBound))+lowerBound;
        Item[] cat = new Item[n];
        for (int i=0; i<n;i++)
        {
            int w = (rnd.nextInt(upperBound-lowerBound))+lowerBound;
            int s = (rnd.nextInt(upperBound-lowerBound))+lowerBound;
            cat[i] = new Item(i,w,s);
        }
        objectCategories = cat;
    }
@Override public String toString(){
        String str ="";
        for (int i=0; i<objCatNum; i++){
            str+=objectCategories[i]+"\n";
        }
        return str;
    }

    public Result Solve(int capacity){
        Arrays.sort(objectCategories, new Comparator<Item>(){
            public int compare(Item o2, Item o1){
                return Float.compare(o1.ratio, o2.ratio);
            }
        });

        int weight = 0;
        int index = 0;
        int val = 0;
        List<Integer> resultList = new ArrayList<>();
        while(index<objCatNum){
            if(objectCategories[index].weight+weight<=capacity){
                resultList.add(objectCategories[index].id);
                weight+=objectCategories[index].weight;
                val+=objectCategories[index].value;
            }
            else {
                index++;
            }
        }

        Result res = new Result(resultList,weight,val);
        return res;

    }
}
