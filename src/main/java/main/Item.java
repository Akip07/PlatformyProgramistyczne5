package main;

public class Item {
    int id;
    int weight;
    int value;
    float ratio;

    public Item(int id, int weight, int value){
        this.id = id;
        this.weight=weight;
        this.value=value;
        this.ratio = (float)value/weight;
    }

@Override
    public String toString(){
        String str = "id: "+id+"\tweight: " + weight + "\tvalue: " + value + "\tratio: "+ratio;
        return str;
    }
}
