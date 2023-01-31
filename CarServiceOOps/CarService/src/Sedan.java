
public class Sedan extends Car{

    Sedan(String name){
        car_type=name;
        System.out.println("Type of car - "+car_type);
        this.map.put("BS01",4000);
        this.map.put("EF01",8000);
        this.map.put("CF01",4000);
        this.map.put("BF01",1500);
        this.map.put("GF01",6000);
    }

    public int  charge(String code){
        return this.map.get(code);

    }
}
