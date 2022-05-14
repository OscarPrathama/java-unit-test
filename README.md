# Unit TEST
- Fokus menguji bagian kode program terkecil seperti method dan calss
- Harusnya minim, kecil dan cepat
- Umumnya kode unit test lebih banyak dari kode program aslinya, karena semua skenario pengujian dilakukan pada unit test.
- Terdiri dari beberapa skenario, seperti skenario sukses, gagal, dll. 
- Salah satu framework unit test terkenal di java adalah [JUnit](https://junit.org)
- Materi
    - membuat test
    - menggunakan Assertions
    - displayName()
    - disable unit test
    - before and after test (catatan baru sampai sini)
    - tags & tag
    - mengubah urutan eksekusi test
    - siklus hidup test
    - dependency injection
    - test dengan parameter
    - timeout di test
    - eksekusi test secara paralel
    - mocking
    - mocking di test
    - mocking verification
# Service TEST
# UI TEST
# Others
- Method2 pada Assertions bersifat static, jadi kita bisa mengimportnya seperti ini : 
    ```
    import static org.junit.jupiter.api.Assertions.*;
    ```
    Jadi nanti dalam pemanggilan methodnya kita cukup menuliskan :
    ```
    assertEquals(expected, actual);
    ```
    bukan
    ```
    Assertions.assertEquals(expected, actual);
    ```
    Contoh :
    ```
    @Test
    public void testAddSuccess(){
        int result = calculator.add(10, 10);
        assertEquals(20, result);
    }
    ```                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            # Unit TEST
- Fokus menguji bagian kode program terkecil seperti method dan calss
- Harusnya minim, kecil dan cepat
- Umumnya kode unit test lebih banyak dari kode program aslinya, karena semua skenario pengujian dilakukan pada unit test.
- Terdiri dari beberapa skenario, seperti skenario sukses, gagal, dll. 
- Salah satu framework unit test terkenal di java adalah [JUnit](https://junit.org)
- Materi
    - membuat test
    - menggunakan Assertions
    - displayName()
    - disable unit test
    - before and after test (catatan baru sampai sini)
    - tags & tag
    - mengubah urutan eksekusi test
    - siklus hidup test
    - dependency injection
    - test dengan parameter
    - timeout di test
    - eksekusi test secara paralel
    - mocking
    - mocking di test
    - mocking verification
# Service TEST
# UI TEST
# Others
- Method2 pada Assertions bersifat static, jadi kita bisa mengimportnya seperti ini : 
    ```
    import static org.junit.jupiter.api.Assertions.*;
    ```
    Jadi nanti dalam pemanggilan methodnya kita cukup menuliskan :
    ```
    assertEquals(expected, actual);
    ```
    bukan
    ```
    Assertions.assertEquals(expected, actual);
    ```
    Contoh :
    ```
    @Test
    public void testAddSuccess(){
        int result = calculator.add(10, 10);
        assertEquals(20, result);
    }
    ```