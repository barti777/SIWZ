package CurrencyCalculator.controller;

import CurrencyCalculator.model.Currency;
import CurrencyCalculator.model.CurrencyList;
import org.junit.Test;

import javax.xml.parsers.ParserConfigurationException;
import java.net.MalformedURLException;
import java.util.List;

import static org.junit.Assert.*;


public class ValidatorCurrencyTest {


    private ValidatorCurrency validator = new ValidatorCurrency();

    @Test
    public void whenInputIsNullShouldReturnFalse() throws MalformedURLException, ParserConfigurationException {
        assertFalse(validator.validate(null));
    }

    @Test
    public void whenInputIsEmptyStringShouldReturnFalse() throws MalformedURLException, ParserConfigurationException {
        assertFalse(validator.validate(""));
    }


    /*
        @Test
        public void whenInputIsNotNullShouldReturnTrue() throws MalformedURLException, ParserConfigurationException {
            assertEquals(true, Validator.validate("AbcdEf"));
        }

        @Test
        public void whenInputIsNullShouldReturnFalse(){
            try {
                assertFalse(!Validator.validate(null));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            }
        }
*/




}