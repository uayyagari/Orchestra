package edu.nyu.cs9053.homework5;

public class Chenda extends Membranophones{

	private static final String  ORIGIN = "India";
	private static final String HS_NUMBER = "211.212";
	private static final String IMAGE_URL = "https://upload.wikimedia.org/wikipedia/commons/7/78/Chendaa.jpg";

	private final String name;
	private final int age;


	public Chenda(String name, int age){
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

        Chenda chendaObj = (Chenda) o;

        if ((name == null) ? (chendaObj.getName() != null) : !name.equals(chendaObj.getName())) {
            return false;
        }
        return age == chendaObj.getAge();

    }


    @Override public int hashCode(){

        int hash = super.hashCode();
        hash = PRIME * hash + ((Integer.valueOf(age) != null) ? Integer.valueOf(age).hashCode() : 0);
        hash = PRIME * hash + ((name != null) ? name.hashCode() : 0);
        return hash;
    }
}