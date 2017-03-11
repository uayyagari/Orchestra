package edu.nyu.cs9053.homework5;

public class Cello extends Chordophones{

	private static final String  ORIGIN = "Italy";
	private static final String HS_NUMBER = "321.322-71";
	private static final String IMAGE_URL = "https://upload.wikimedia.org/wikipedia/commons/5/5f/Cello_front_side.png";
	private final String name;
	private final int age;


	public Cello(String name, int age){
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

        Cello celloObj = (Cello) o;

        if ((name == null) ? (celloObj.getName() != null) : !name.equals(celloObj.getName())) {
            return false;
        }
        return age == celloObj.getAge();

    }


    @Override public int hashCode(){

        int hash = super.hashCode();
        hash = PRIME * hash + ((Integer.valueOf(age) != null) ? Integer.valueOf(age).hashCode() : 0);
        hash = PRIME * hash + ((name != null) ? name.hashCode() : 0);
        return hash;
    }
}