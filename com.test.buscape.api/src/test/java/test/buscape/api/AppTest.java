package test.buscape.api;

import java.io.FileNotFoundException;
import java.text.ParseException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.buscape.api.business.CommandBusinessImpl;
import com.test.buscape.api.business.interfaces.CommandBusiness;
import com.test.buscape.api.core.AppCore;
import com.test.buscape.api.core.model.Coordinates;

public class AppTest {

	private CommandBusiness business;
	
	@Before
	public void setUp() {
		this.business = new CommandBusinessImpl();
	}
	
	@After
	public void destroy() {
		this.business = null;
		AppCore.destroy();
	}
	
	@Test
	public void testLog() throws FileNotFoundException, ParseException {
		String row = "";
		Coordinates coordinate = this.business.processCommand(row);
		
	}	
}
