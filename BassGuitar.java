package edu.nyu.cs9053.homework5;

public class BassGuitar extends Guitar{

	static private final String IMAGE_URL = "http://thehub.musiciansfriend.com/images/bassguide/fender-american-deluxe-jazz-bass.jpg";
	private final String name;
	private final int age;

	public BassGuitar(String name, int age){
		super(IMAGE_URL);
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

        if ((name == null) ? (getName() != null) : !name.equals(getName())) {
            return false;
        }
        return age == getAge();
    }

    @Override public int hashCode(){

        int hash = super.hashCode();
        hash = PRIME * hash + ((Integer.valueOf(age) != null) ? Integer.valueOf(age).hashCode() : 0);
        hash = PRIME * hash + ((name != null) ? name.hashCode() : 0);
        return hash;
    }
}