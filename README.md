# Orchestra

    - Created an object hierarchy which mimics the [musical instruments](https://en.wikipedia.org/wiki/List_of_musical_instruments) taxonomy.
        - The hierarchy is contained within package [edu.nyu.cs9053.homework4.hierarchy]
        - There is a base interface called [MusicalInstrument]
        - The following subtypes are included:
            - [Tenoroon]
            - [Triangle]
            - [Clarinet]
            - [Keyboard]
            - [BassGuitar]
            - [Sanxian]
            - [Tsuzumi]
            - [DrumMachine]
            - [Bassoon]
            - [Sitar]
            - [Cello]
            - [ElectricGuitar]
            - [Chenda]
            - [Piccolo]
            - [Xylophone]
        - Each of the types have the following methods:
            - `getOrigin` which returns a `String` indicating the origin country
            - `getHsNumber` which returns the instrument's [Hornbostel–Sachs number](https://en.wikipedia.org/wiki/Hornbostel%E2%80%93Sachs) as a `String`
            - `getImageUrl` which returns an image URL of the instrument as a `String`
            - `getClassificationName` which returns the classification name of the instrument as a `String` (as detailed in the linked Wikipedia entry).
        - Each of the concrete types have the following methods:
            - `getName` returns a name for the instrument as a `String`. This value is different per object.
            - `getAge` returns the age of the instrument as an `int` (this is the age of the object not of the instrument's existence). This value is different per object.
        
    - Provided implementations of the `equals` and `hashCode` methods for each class within package [edu.nyu.cs9053.homework4.hierarchy]
        
   
    - Implemented music!
    
            - Added the following public method:
                - `void play((Rhythm rhythm, Note note, NoteCallback noteCallback)`
        - Implemented three versions of the [Musician]
            - Made an implementation of [Musician] which plays at [tempo largo](https://en.wikipedia.org/wiki/Tempo#Measuring_tempo)
            - Made an implementation of [Musician] which plays at [tempo moderato](https://en.wikipedia.org/wiki/Tempo#Measuring_tempo)
            - Made an implementation of [Musician] which plays at [tempo prestissimo](https://en.wikipedia.org/wiki/Tempo#Measuring_tempo)
        
        - The actual music was played via the [Conductor] main program
            - Each "ditty" (i.e. all [Note] objects comprising it) was be performed in 30 seconds at tempo of 100 bpm. Scaling of the musicians was done according to their tempo.
            - For simplicity, each [Note] within a "ditty" can be evenly spaced
    
    - Construct your appropriate musician implementations in the [MusicianProvider]
        - As well as randomly create one of your [MusicalInstrument] implementations at each invocation of the `randomlyChoose` method
    
    - Create your own ditty and add into the appropriate place within the [Conductor]
        - This should be the only modification to `Conductor` you do


    

    
