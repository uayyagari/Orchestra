package edu.nyu.cs9053.homework5;

public class Tsuzumi extends Membranophones{

	private static final String  ORIGIN = "China/Japan";
	private static final String HS_NUMBER = "1/2";
	private static final String IMAGE_URL = "https://upload.wikimedia.org/wikipedia/commons/c/cc/Tsuzumi.jpg";

	private final String name;
	private final int age;


	public Tsuzumi(String name, int age){
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

        Tsuzumi tsuzumiObj = (Tsuzumi) o;

        if ((name == null) ? (tsuzumiObj.getName() != null) : !name.equals(tsuzumiObj.getName())) {
            return false;
        }
        return age == tsuzumiObj.getAge();

    }


    @Override public int hashCode(){

        int hash = super.hashCode();
        hash = PRIME * hash + ((Integer.valueOf(age) != null) ? Integer.valueOf(age).hashCode() : 0);
        hash = PRIME * hash + ((name != null) ? name.hashCode() : 0);
        return hash;
    }
}