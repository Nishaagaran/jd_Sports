package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Application {
	
	
@BeforeEach
public void demo()
{
	System.out.println("Before ");
}

	@Test
	void test() {
		System.out.println("hello Junit");
	}

	@DisplayName("hello demo")
	@Test
	void test1()
	{
		System.out.println("demo");
	}
	
	
	@AfterEach
	public void teardown()
	{
		System.out.println("after");
	}

}
