package edu.nyu.cs9053.homework5;

abstract class Electrophones implements MusicalInstrument {

	private String origin;
	private String hsNumber;
	private String imageUrl;
	private static final String CLASSIFICATION_NAME = "Electrophones";

	public Electrophones(String origin, String hsNumber, String imageUrl){
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

		Electrophones electroObj = (Electrophones) o;

        if ((origin == null) ? (electroObj.getOrigin() != null) : !origin.equals(electroObj.getOrigin())) {
            return false;
        }
        if ((hsNumber == null) ? (electroObj.getHsNumber() != null) : !hsNumber.equals(electroObj.getHsNumber())) {
            return false;
        }
        if ((imageUrl == null) ? (electroObj.getImageUrl() != null) : !imageUrl.equals(electroObj.getImageUrl())) {
            return false;
        }
		if ((CLASSIFICATION_NAME == null) ? (electroObj.getClassificationName() != null) : !CLASSIFICATION_NAME.equals(electroObj.getClassificationName())) {
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