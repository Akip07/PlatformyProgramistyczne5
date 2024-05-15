package main;

public class Item {
    int weight;
    int size;

    public Item(int weight, int size){
        this.weight=weight;
        this.size=size;
    }

@Override
    public String toString(){
        String str = "weight: " + weight + "\tsize:" + size;
        return str;
    }
}
