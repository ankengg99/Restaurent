
public class Hatchback extends Car{

  Hatchback(String name){
    car_type=name;
      System.out.println("Type of car - "+car_type);
      this.map.put("BS01",2000);
      this.map.put("EF01",5000);
      this.map.put("CF01",2000);
     this.map.put("BF01",1000);
      this.map.put("GF01",3000);
}

   public int charge(String code){
      return this.map.get(code);

    }
}
