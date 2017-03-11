package edu.nyu.cs9053.homework5;

public class KeyBoard extends Electrophones{

	private static final String  ORIGIN = "USA";
	private static final String HS_NUMBER = "NAN";
	private static final String IMAGE_URL = "https://upload.wikimedia.org/wikipedia/commons/b/bf/YamahaKeyboard-2.jpg";

	private final String name;
	private final int age;


	public KeyBoard(String name, int age){
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

        KeyBoard keyObj = (KeyBoard) o;

        if ((name == null) ? (keyObj.getName() != null) : !name.equals(keyObj.getName())) {
            return false;
        }
        return age == keyObj.getAge();

    }


    @Override public int hashCode(){

        int hash = super.hashCode();
        hash = PRIME * hash + ((Integer.valueOf(age) != null) ? Integer.valueOf(age).hashCode() : 0);
        hash = PRIME * hash + ((name != null) ? name.hashCode() : 0);
        return hash;
    }

}