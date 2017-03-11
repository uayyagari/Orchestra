package edu.nyu.cs9053.homework5;

public class Xylophone extends Idiophones{

	private static final String  ORIGIN = "South east asia/ Africa";
	private static final String HS_NUMBER = "111.212";
	private static final String IMAGE_URL = "https://upload.wikimedia.org/wikipedia/commons/d/d3/Xylophone.jpg";

	private final String name;
	private final int age;


	public Xylophone(String name, int age){
		super(ORIGIN, HS_NUMBER, IMAGE_URL);
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	@Override public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        if(!super.equals(o)){
            return false;
        }

        Xylophone xyloObj = (Xylophone) o;

        if ((name == null) ? (xyloObj.getName() != null) : !name.equals(xyloObj.getName())) {
            return false;
        }
        return age == xyloObj.getAge();

    }


    @Override public int hashCode(){

        int hash = super.hashCode();
        hash = PRIME * hash + ((Integer.valueOf(age) != null) ? Integer.valueOf(age).hashCode() : 0);
        hash = PRIME * hash + ((name != null) ? name.hashCode() : 0);
        return hash;
    }
}