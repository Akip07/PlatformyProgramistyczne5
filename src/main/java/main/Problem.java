package main;

import java.util.Random;

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
        int x = (rnd.nextInt()%(upperBound-lowerBound))+lowerBound;
        Item[] cat = new Item[n];
        for (int i=0; i<n;i++)
        {
            int w = (rnd.nextInt(upperBound-lowerBound))+lowerBound;
            int s = (rnd.nextInt(upperBound-lowerBound))+lowerBound;
            cat[i] = new Item(w,s);
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
}
