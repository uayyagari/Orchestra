package edu.nyu.cs9053.homework5;

public class DrumMachine extends Electrophones{

	private static final String ORIGIN = "USA";
	private static final String HS_NUMBER = "NAN";
	private static final String IMAGE_URL = "https://upload.wikimedia.org/wikipedia/commons/d/d3/Yamaha_RY30_front.png";
	private final String name;
	private final int age;

	public DrumMachine(String name, int age){
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

        DrumMachine drumObj = (DrumMachine) o;

        if ((name == null) ? (drumObj.getName() != null) : !name.equals(drumObj.getName())) {
            return false;
        }
        return age == drumObj.getAge();
    }

    @Override public int hashCode(){

        int hash = super.hashCode();
        hash = PRIME * hash + ((Integer.valueOf(age) != null) ? Integer.valueOf(age).hashCode() : 0);
        hash = PRIME * hash + ((name != null) ? name.hashCode() : 0);
        return hash;
    }
}