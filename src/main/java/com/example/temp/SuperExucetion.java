package com.example.temp;
class Inner{
    int a = 10;
    int b = 20;
}

class outer extends Inner{
    outer() {
        super();
    }
    void pr(){
        System.out.println(a+" This is 2nd class");
    }
}
class InnerSuperExucetion extends outer{
    InnerSuperExucetion(){
        super();
    }
    @Override
    void pr(){
        System.out.println("This is 3rd class");
        System.out.println(a);
    }
    
}


public class SuperExucetion {
    public static void main(String[] args) {
        outer o = new outer();
        o.pr();
        InnerSuperExucetion i = new InnerSuperExucetion();
        i.pr();

    }
}
