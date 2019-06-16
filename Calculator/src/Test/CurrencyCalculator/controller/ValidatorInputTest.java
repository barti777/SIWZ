package CurrencyCalculator.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/*
        static class ValidatorInput{

            static Boolean validate(String _input) {
                if (_input == null || _input.isEmpty()) return false;
                try {
                    Float input = Float.parseFloat(_input);
                    if (input < 0) {
                        return false;
                    }
                } catch (Exception ex) {
                    return false;
                }
                return true;
            }
        }
*/
public class ValidatorInputTest {


    private ValidatorInput validatorInput = new ValidatorInput();

    @Test
    public void whenInputIsPositiveNumberShouldReturnTrue(){

        assertTrue(validatorInput.validate("1.7"));
    }

    @Test
    public void whenInputIsEmptyShouldReturnFalse(){
        assertFalse(validatorInput.validate(""));
    }

    @Test
    public void whenInputIsNotPositiveNumberShouldReturnFalse(){
        assertFalse(validatorInput.validate("-5"));
    }

    @Test
    public void whenInputIsLetterShouldReturnFalse(){
        assertFalse(validatorInput.validate("ABC"));
    }

    @Test
    public void whenInputIsNULLShouldReturnFalse(){
        assertFalse(validatorInput.validate(null));
    }




}
