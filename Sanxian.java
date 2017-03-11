package edu.nyu.cs9053.homework5;

public class Sanxian extends Chordophones{

	private static final String  ORIGIN = "China";
	private static final String HS_NUMBER = "3";
	private static final String IMAGE_URL = "https://upload.wikimedia.org/wikipedia/commons/e/e6/Sanxian.gif";
	private final String name;
	private final int age;

	public Sanxian(String name, int age){
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

        Sanxian sanxianObj = (Sanxian) o;

        if ((name == null) ? (sanxianObj.getName() != null) : !name.equals(sanxianObj.getName())) {
            return false;
        }
        return age == sanxianObj.getAge();
    }

    @Override public int hashCode(){

        int hash = super.hashCode();
        hash = PRIME * hash + ((Integer.valueOf(age) != null) ? Integer.valueOf(age).hashCode() : 0);
        hash = PRIME * hash + ((name != null) ? name.hashCode() : 0);
        return hash;
    }
}