package edu.nyu.cs9053.homework5;

public interface MusicalInstrument{

	int PRIME = 19;

	String getOrigin();

	String getHsNumber();

	String getImageUrl();

	String getClassificationName();

	void play(Rhythm rhythm, Note note, NoteCallback noteCallback);

}

