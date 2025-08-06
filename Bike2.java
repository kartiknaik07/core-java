class Bike2{
    private String name;
    private String color;
    private int number_plate;
    private float milage;
    private int Wheels;

public Bike2(){
	
}
public Bike2(String name){
    this.name=name;
}
public Bike2(String name,String color){
    this(name);
    this.color=color;
}
public Bike2(String name,String color,int number_plate){
    this(name,color);
    this.number_plate=number_plate;
}
public Bike2(String name,String color,int number_plate,float milage){
    this(name,color,number_plate);
    this.milage=milage;
}
public Bike2(String name,String color,int number_plate,float milage,int Wheels){
    this(name,color,number_plate,milage);
    this.Wheels=Wheels;
}
public String getName(){
    return name;
}
public String getColor(){
    return color;
}
public int getNumber_plate(){
    return number_plate;
}
public float getMilage(){
   return milage;
}
public int getWheels(){
   return Wheels;
}
}