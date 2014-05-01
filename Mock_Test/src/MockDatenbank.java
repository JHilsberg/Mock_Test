import java.util.LinkedList;

public class MockDatenbank implements Datenbank{

	private LinkedList<Integer> dbListe = new LinkedList<Integer>();
	
	@Override
	public int getLetzteZahlInDB() {
		return dbListe.get(dbListe.size()-1);
	}

	@Override
	public void schreibeZahlInDB(int zahl) {
		dbListe.add(zahl);
	}

}
