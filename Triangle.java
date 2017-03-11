package edu.nyu.cs9053.homework5;

public class Triangle extends Idiophones{

	private static final String  ORIGIN = "England";
	private static final String HS_NUMBER = "111.2";
	private static final String IMAGE_URL = "https://upload.wikimedia.org/wikipedia/commons/4/4a/Triangle_001.jpg";

	private final String name;
	private final int age;


	public Triangle(String name, int age){
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

        Triangle triangleObj = (Triangle) o;

        if ((name == null) ? (triangleObj.getName() != null) : !name.equals(triangleObj.getName())) {
            return false;
        }
        return age == triangleObj.getAge();

    }


    @Override public int hashCode(){

        int hash = super.hashCode();
        hash = PRIME * hash + ((Integer.valueOf(age) != null) ? Integer.valueOf(age).hashCode() : 0);
        hash = PRIME * hash + ((name != null) ? name.hashCode() : 0);
        return hash;
    }
}