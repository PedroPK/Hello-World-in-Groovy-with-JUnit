import org.junit.Assert
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MathGroovyTest {

    @Test
    public void testDeltaJava_A1_B2_C3_ResultMinus8() {
        // Arrange
        BigDecimal a = new BigDecimal(1);
        BigDecimal b = new BigDecimal(2);
        BigDecimal c = new BigDecimal(3);

        // Act
        BigDecimal delta = MathGroovy.deltaJava(a, b, c);

        // Assert
        BigDecimal expected = new BigDecimal(-8);
        Assertions.assertEquals(expected, delta);
    }

    @Test
    public void testDeltaGroovy_A1_B2_C3_ResultMinus8() {
        // Arrange
        BigDecimal a = 1;
        BigDecimal b = 2;
        BigDecimal c = 3;

        // Act
        BigDecimal delta = MathGroovy.deltaGroovy(a, b, c);

        // Assert
        BigDecimal expected = -8;
        Assertions.assertEquals(expected, delta);
    }

    @Test
    public void testDeltaSimpleBigDecimals_A1_B2_C3_ResultMinus8() {
        // Arrange
        BigDecimal a, b, c
        a = 1
        b = 2
        c = 3

        // Act
        BigDecimal delta = MathGroovy.deltaGroovy(a, b, c);

        // Assert
        BigDecimal expected = -8;
        Assertions.assertEquals(expected, delta);
    }
	
	@Test
	public void testDeltaSimpleDef_A1_B2_C3_ResultMinus8() {
		// Arrange
		def a = 1;
		def b = 2;
		def c = 3;

		// Act
		def delta = MathGroovy.deltaGroovy(a, b, c);

		// Assert
		BigDecimal expected = -8;
		Assertions.assertEquals(expected, delta);
	}
}