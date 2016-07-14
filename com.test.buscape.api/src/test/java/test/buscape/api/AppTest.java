package test.buscape.api;

import java.io.FileNotFoundException;
import java.text.ParseException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.buscape.api.business.CommandBusinessImpl;
import com.test.buscape.api.business.interfaces.CommandBusiness;
import com.test.buscape.api.core.AppCore;
import com.test.buscape.api.core.enums.CompassPoint;
import com.test.buscape.api.core.model.Coordinates;

import junit.framework.TestCase;

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
		String row = "LMRDDMMUU";
		Coordinates coordinate = this.business.processCommand(row);
		
		TestCase.assertEquals(coordinate.getX(), -1);
		TestCase.assertEquals(coordinate.getY(), 2);
		TestCase.assertEquals(coordinate.getZ(), 0);
		TestCase.assertEquals(coordinate.getCompassPoint(), CompassPoint.NORTH);
		
		row = "RMMLMMMDDLL";
		coordinate = this.business.processCommand(row);
		
		TestCase.assertEquals(coordinate.getX(), 2);
		TestCase.assertEquals(coordinate.getY(), 3);
		TestCase.assertEquals(coordinate.getZ(), -2);
		TestCase.assertEquals(coordinate.getCompassPoint(), CompassPoint.SOUTH);
	}	
}
