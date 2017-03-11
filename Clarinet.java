package edu.nyu.cs9053.homework5;

public class Clarinet extends Aerophones{

	static private final String  ORIGIN = "Western Europe";
	static private final String HS_NUMBER = "422.112.2–71";
    static private final String  IMAGE_URL = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Yamaha_Clarinet_YCL-457II-22.tiff/lossy-page1-320px-Yamaha_Clarinet_YCL-457II-22.tiff.jpg";

	private final String name;
	private final int age;

	public Clarinet(String name, int age){
		super(IMAGE_URL, ORIGIN, HS_NUMBER);
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

        Clarinet clarinetObj = (Clarinet) o;

        if ((name == null) ? (clarinetObj.getName() != null) : !name.equals(clarinetObj.getName())) {
            return false;
        }
        return age == clarinetObj.getAge();

    }


    @Override public int hashCode(){

        int hash = super.hashCode();
        hash = PRIME * hash + ((Integer.valueOf(age) != null) ? Integer.valueOf(age).hashCode() : 0);
        hash = PRIME * hash + ((name != null) ? name.hashCode() : 0);
        return hash;
    }

}