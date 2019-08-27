package step_by_step;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.tws.refactoring.Driver;

public class DriverTest {

	@Test
	void should_return_not_null_when_new_diver() {
		//given
		Driver driver;
		int age = 10;
		//when
		driver = new Driver(age);
		//then
		assertNotNull(driver);
	}
}
