package edu.nyu.cs9053.homework5;

public abstract class Chordophones implements MusicalInstrument {

	private final String origin;
	private final String hsNumber;
	private final String imageUrl;
	private static final String CLASSIFICATION_NAME = "Chordophones";

	public Chordophones(String origin, String hsNumber, String imageUrl){
		this.origin = origin;
		this.hsNumber = hsNumber;
		this.imageUrl = imageUrl;
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

		Chordophones chordObj = (Chordophones) o;

        if ((origin == null) ? (chordObj.getOrigin() != null) : !origin.equals(chordObj.getOrigin())) {
            return false;
        }
        if ((hsNumber == null) ? (chordObj.getHsNumber() != null) : !hsNumber.equals(chordObj.getHsNumber())) {
            return false;
        }
        if ((imageUrl == null) ? (chordObj.getImageUrl() != null) : !imageUrl.equals(chordObj.getImageUrl())) {
            return false;
        }
		if ((CLASSIFICATION_NAME == null) ? (chordObj.getClassificationName() != null) : !CLASSIFICATION_NAME.equals(chordObj.getClassificationName())) {
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