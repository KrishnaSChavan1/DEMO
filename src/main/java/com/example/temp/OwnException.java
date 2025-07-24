package com.example.temp;

class InvalidName extends Exception{
    InvalidName(String s){
        super(s);
    }
}

public class OwnException {

    public static void test(String s)throws InvalidName{
        if(s.equals("Krishna")){
            throw new InvalidName("Can't use Krishna");
        }
    }
    
    public static void main(String[] args) {
        try{
            test("Krishna");
        }catch(InvalidName e){
            System.out.println(e.getMessage());
        }
        
    }

}
