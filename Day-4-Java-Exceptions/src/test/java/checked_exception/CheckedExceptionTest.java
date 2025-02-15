package checked_exception;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CheckedExceptionTest {

   @Test
    void readingFileTest(){
       String filePath="src/main/java/checked_exception/Data.txt";
       assertDoesNotThrow(()->CheckedException.readingFile(filePath));
   }
}
