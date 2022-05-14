package masgan.test;

public class Calculator {
    
    public Integer add(Integer first, Integer second){
        return first + second;
    }

    /**
     * NB : Dalam java tpackage masgan.test;

public class Calculator {
    
    public Integer add(Integer first, Integer second){
        return first + second;
    }

    /**
     * NB : Dalam java tidak ada pembagian yang di bagi oleh 0
    */
    public Integer divide(Integer first, Integer second){
        if( second == 0 ){
            throw new IllegalArgumentException("Can\'t divide by zero");
        }else{
            return first/second;
        }
    }

}
