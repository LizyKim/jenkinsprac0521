package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator calc;

	@BeforeEach
	void setUp() {
		calc = new Calculator();
	}

	@Test
	void testAddIntInt() {
		assertEquals(10, calc.add(3, 7));
		//calc.add()를 실행할건데, 그 결과인 3+7이 내가 제시하는 10과 동일한지 확인하는 것이 assertEquals
	}

	@Test
	void testAddStringString() {
		assertEquals("apple", calc.add("app", "le"));
	}

}
//실행 결과가 Error(: runtime error 등), Failure(: 작동은 됐는데, 원하는 결과가 안나옴)
