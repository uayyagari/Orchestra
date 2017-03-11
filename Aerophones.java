package edu.nyu.cs9053.homework5;

public abstract class Aerophones implements MusicalInstrument {

	private final String origin;
	private final String hsNumber;
	private final String imageUrl;
	static private final String CLASSIFICATION_NAME = "Aerophones";

	protected Aerophones(String imageUrl, String origin, String hsNumber){
		this.imageUrl = imageUrl;
		this.origin = origin;
		this.hsNumber = hsNumber;

	}

	@Override public String getOrigin(){
		return origin;
	}

	@Override public String getHsNumber(){
		return hsNumber;
	}

	@Override public String getImageUrl(){
		return imageUrl;	
	}
	
	@Override public String getClassificationName(){
		return CLASSIFICATION_NAME;
	}

	public void play(Rhythm rhythm, Note note, NoteCallback noteCallback){
		noteCallback.notePlayed(note);
		rhythm.perform();
	}


	@Override public boolean equals(Object o){
		
		if(this == o){
			return true;
		}

		if(o == null || getClass() != o.getClass()){
			return false;
		}

		Aerophones aero = (Aerophones) o;

        if ((origin == null) ? (aero.getOrigin() != null) : !origin.equals(aero.getOrigin())) {
            return false;
        }
        if ((hsNumber == null) ? (aero.getHsNumber() != null) : !hsNumber.equals(aero.getHsNumber())) {
            return false;
        }
        if ((imageUrl == null) ? (aero.getImageUrl() != null) : !imageUrl.equals(aero.getImageUrl())) {
            return false;
        }
		if ((CLASSIFICATION_NAME == null) ? (aero.getClassificationName() != null) : !CLASSIFICATION_NAME.equals(aero.getClassificationName())) {
            return false;
        }
        return true;
	}

	@Override public int hashCode(){
        int hash = (origin != null) ? origin.hashCode() : 0;
        hash = PRIME * hash + ((CLASSIFICATION_NAME != null) ? CLASSIFICATION_NAME.hashCode() : 0);
        hash = PRIME * hash + ((hsNumber != null) ? hsNumber.hashCode() : 0);
        hash = PRIME * hash + ((imageUrl != null) ? imageUrl.hashCode() : 0);
        return hash;
    }
}