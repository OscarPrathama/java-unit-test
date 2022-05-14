package masgan.test;

public class AppTest {
    
}
package masgan.test;

import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import java.util.Properties;

// import org.junit.jupiter.api.AfterAll;
// import org.junit.jupiter.api.AfterEach;
// import org.junit.jupiter.api.BeforeAll;
// import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

@DisplayName ("Test untuk Calculator Class")
public class CalculatorTest {
    
    private Calculator calculator = new Calculator();

    /**
     * Baca @BeforeEach dan @AfterEach lebih dulu !!!, sebelum membaca section ini.
     * Namun kita juga dapat menjalankan method/melakukan sesuatu sebelum semua method unit testnya berjalan
     * kita bisa menggunakan annotation @BeforeAll dan @AfterAll
     * namun hanya static function yang dapat menggunakan @BeforeAll dan @AfterAll
    */
    // @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    // @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }

    /**
     * Terkadang kita ingin menjalankan code yang sama sebelum dan setelah mengeksekusi unit test
     * hal ini sebenarnya bisa dilakukan secara manual pada function @Test, namun hal ini akan membuat banyak code duplicat
     * JUnit memiliki annotation @BeforeEach & @AfterEach
     * @BeforeEach digunakan untuk menandai func yang akan di eksekusi sebelum tiap unit test dijalankan
     * @AfterEach digunakan untuk menandai func yang akan di eksekusi setelah tiap unit test dijalankan
     * INGAT, bahwa ini akan selalu dieksekusi setiap kali, pada tiap function @Test, bukan pada class test saja.
     * jika ingin menggunakan cara ini, silahkan tulisan code beforeEach dan afterEach di posisi teratas
    */
    // @BeforeEach
    public void setUp() {
        System.out.println("Function before each unit test");
    }

    // @AfterEach
    public void tearDown() {
        System.out.println("Function after each unit test");
        System.out.println();
    }

    /**
     * Simple unit test
    */
    @Test
    public void testAddSuccess(){
        int result = calculator.add(10, 10);
        assertEquals(20, result);
    }

    /**
     * Menggagalkan test
     * Kadang dalam membuatt unit test, kita tidak hanya ingin mengetest kasus itu sukses atau gagal
     * Ada kalanya kita ingin mengetes sebuah Exception
     * Assertions juga bisa digunakan untuk mengecek apakah sebuah Exception terjadi ?
    */
    @Test
    public void testDivideSuccess(){
        var result = calculator.divide(100, 10);
        assertEquals(10, result);
    }

    /**
     * Tidak bisa melakukan throw error pada unit test seperti di bawah ini
     * Saat dijalankan pun pasti akan error
     * Karena tidak boleh melakukan throw error langsung pada unit test
     * Dan pasti akan di anggap gagal
    */
    @Test
    public void testDivideFailed(){
        calculator.divide(10, 0);
    }

    /**
     * Jika ingin menerapkan throw errors, gunakan assertThrows()
    */
    @Test
    public void testDivideFailed2(){
        assertThrows(IllegalArgumentException.class, () -> {
            // contoh code error
            calculator.divide(100, 0);

            /**
             * Namun jika unit test dibuat sukses, maka unit test ini akan error
             * karena expektasi kita pada unit test ini adalah error, bukannya sukses
             * message errornya -> Expected java.lang.IllegalArgumentException to be thrown, but nothing was thrown
            */
            // contoh code sukses
            // calculator.divide(10, 10);
        });
    }

    /**
     * Kita bisa menambahkan deskripsi untuk tiap test dengan annotasi @DisplayName("keterangan")
    */
    @Test
    @DisplayName("Test penggunaan displayName() pada unit testing")
    public void testDisplayName(){
        System.out.println("Test fitur displayName() unit testing");
    }

    /**
     * Contoh menonaktifkan unit test
     * sebenarnya kita bisa dengan menghilangkan @Test
     * namun khawatirnya kita tidak bisa mendeteksi kalau ada unit test tersebut
     * gunakan @Disabled untuk mendisabled unit test tersebut
     * maka secara otomatis test ini tidak akan di jalankan
    */
    @Test
    @Disabled
    public void testDisabledTest(){
        System.out.println("Disabled unit test");
    }

    /**
     * Membatalkan test karena kondisi tertentu
     * Kadang kita ingin membatalkan Test karena kondisi tertentu
     * Untuk menerapkannya kita bisa menggunakan exception TestAbortedException
     * Jika JUnit mendapatkan exception TestAbortedException, secara otomatis test tersebut akan dibatalkan
    */
    @Test
    public void testAborted() {
        var ENV = "PROD";
        if(!"DEV".equals(ENV)){
            throw new TestAbortedException("Test dibatalkan karena bukan DEV");
        }
        System.out.println("Test dijalankan");
    }

    @Test
    public void testAssumpotions() {
        var ENV = "PROD";
        assumeTrue("DEV".equals(ENV));
    }

    @Test
    public void getEnv() {
        System.out.println(System.getenv("PROFILE"));
    }

    @Test
    public void systemProperties() {
        Properties properties = System.getProperties();
        properties.forEach((key, value) -> System.out.println(key + " : " + value) );
    }

}
