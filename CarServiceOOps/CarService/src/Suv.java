
public class Suv extends Car{

    Suv(String name){
        car_type=name;
        System.out.println("Type of car - "+car_type);
        this.map.put("BS01",5000);
        this.map.put("EF01",10000);
        this.map.put("CF01",6000);
        this.map.put("BF01",2500);
        this.map.put("GF01",8000);
       // System.out.println(map);
    }

    public int  charge(String code){
        return this.map.get(code);

    }

}
