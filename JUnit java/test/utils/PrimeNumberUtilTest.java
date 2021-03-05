package utils;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PrimeNumberUtilTest {
    private Integer inputNumber;
    private Boolean expectedResult;
    private PrimeNumberUtil primeNumberUtil;

    @Before
    public void initialize() {
        primeNumberUtil = new PrimeNumberUtil();
    }



    public PrimeNumberUtilTest(Integer inputNumber, Boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
                {2, true},
                {6, false},
                {19, true},


        });
    }

    @Test
    public void testPrimeNumberChecker() {
        System.out.println("Параметр номера : " + inputNumber + " ; выход : " + expectedResult);
        assertEquals(expectedResult,
                primeNumberUtil.validate(inputNumber));
    }
}
