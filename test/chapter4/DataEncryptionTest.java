package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataEncryptionTest {


    @Test
    void testThatNumberEnterDoesntExceedFourDigits(){
        assertTrue(DataEncryption.isValidNumber("1000"));
    }
    @Test
    void testThatDataCanBeEncrypted(){
        String expectedEncryptedValue = "7816";
        String encryptedData = DataEncryption.encryptData("0149");
        assertEquals(expectedEncryptedValue, encryptedData);
    }
    @Test
    void testThatDataCanBeDecrypted(){
        String expectedDecryptedData = "0149";
        String decryptedData = DataEncryption.decryptData("7816");
        assertEquals(expectedDecryptedData, decryptedData);
    }

}