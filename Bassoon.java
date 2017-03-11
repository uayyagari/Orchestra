package edu.nyu.cs9053.homework5;

public class Bassoon extends Aerophones{

	static private final String  ORIGIN = "Western Europe";
	static private final String HS_NUMBER = "422.112.2–71";

	private final String name;
	private final int age;

	public Bassoon(String imageUrl, String name, int age){
		super(imageUrl, ORIGIN, HS_NUMBER);
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

        Bassoon bassoonObj = (Bassoon) o;

        if ((name == null) ? (bassoonObj.getName() != null) : !name.equals(bassoonObj.getName())) {
            return false;
        }
        return age == bassoonObj.getAge();

    }


    @Override public int hashCode(){

        int hash = super.hashCode();
        hash = PRIME * hash + ((Integer.valueOf(age) != null) ? Integer.valueOf(age).hashCode() : 0);
        hash = PRIME * hash + ((name != null) ? name.hashCode() : 0);
        return hash;
    }

}