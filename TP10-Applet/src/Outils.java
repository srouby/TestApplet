
public class Outils {

	public static float Note(float laDistance, char leSexe)
	{
		float note;
		if (leSexe == 'F' || leSexe == 'f')
			note = 3 * laDistance - 8.5f;
		else
			note = 2.57f * laDistance - 8.28f;
		if (note < 0)
			note = 0;
		else
			if (note > 20)
				note = 20;
		note = Math.round(note*10)/10f;
		return (note);
	}

}
