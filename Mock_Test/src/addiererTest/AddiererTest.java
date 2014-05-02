package addiererTest;
import junit.framework.TestCase;


public class AddiererTest extends TestCase{

	public void testAddiereZahlAusDB(){
		MockDatenbank mockDB = new MockDatenbank();
		Addierer addierer = new Addierer(mockDB);
		
		mockDB.schreibeZahlInDB(2);
		
		int result = addierer.addiereZahlAusDB();
		
		assertEquals(3, result);
	}

}
