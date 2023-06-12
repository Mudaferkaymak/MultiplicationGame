import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class fileManagerTest {
    private fileManager manager;
    private String fileName;

    public fileManagerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        fileName = "test.ser";
        manager = new fileManager(fileName);
    }

    @After
    public void tearDown() {
        // Her test tamamlandığında dosyayı temizle
        manager.setChildren(new ArrayList<>());
        manager.setSettings(new ArrayList<>());
        manager.setRecords(new ArrayList<>());
    }

    @Test
    public void testSetChildren() {
        // Test verileri hazırlanır
        List<Child> children = new ArrayList<>();
        // children listesine test verileri eklenir

        // Metodun çağrılması
        manager.setChildren(children);

        // Beklenen sonuçlar kontrol edilir
        List<Child> result = manager.getChildren();
        assertEquals(children, result);
    }

    @Test
    public void testSetSettings() {
        // Test verileri hazırlanır
        List<settings> settings = new ArrayList<>();
        // settings listesine test verileri eklenir

        // Metodun çağrılması
        manager.setSettings(settings);

        // Beklenen sonuçlar kontrol edilir
        List<settings> result = manager.getSettings();
        assertEquals(settings, result);
    }

    @Test
    public void testGetChildren() {
        // Test verileri hazırlanır
        List<Child> children = new ArrayList<>();
        // manager instance'ı oluşturulduğunda çocuklar zaten yüklenir
        manager.setChildren(children);

        // Metodun çağrılması
        List<Child> result = manager.getChildren();

        // Beklenen sonuçlar kontrol edilir
        assertEquals(children, result);
    }

    @Test
    public void testGetSettings() {
        // Test verileri hazırlanır
        List<settings> settings = new ArrayList<>();
        // manager instance'ı oluşturulduğunda ayarlar zaten yüklenir
        manager.setSettings(settings);

        // Metodun çağrılması
        List<settings> result = manager.getSettings();

        // Beklenen sonuçlar kontrol edilir
        assertEquals(settings, result);
    }

    @Test
    public void testGetRecords() {
        // Test verileri hazırlanır
        List<Record> records = new ArrayList<>();
        // manager instance'ı oluşturulduğunda kayıtlar zaten yüklenir
        manager.setRecords(records);

        // Metodun çağrılması
        List<Record> result = manager.getRecords();

        // Beklenen sonuçlar kontrol edilir
        assertEquals(records, result);
    }

    @Test
    public void testSetRecords() {
        // Test verileri hazırlanır
        List<Record> records = new ArrayList<>();
        // records listesine test verileri eklenir

        // Metodun çağrılması
        manager.setRecords(records);

        // Beklenen sonuçlar kontrol edilir
        List<Record> result = manager.getRecords();
        assertEquals(records, result);
    }

 

    @Test
    public void testSaveChildren() {
        // Test verileri hazırlanır
        List<Child> children = new ArrayList<>();
        // children listesine test verileri eklenir
        manager.setChildren(children);

        // Metodun çağrılması
        manager.saveChildren();

        // Kaydedilen çocuklar okunur
        manager.readChildren();

        // Beklenen sonuçlar kontrol edilir
        List<Child> result = manager.getChildren();
        assertEquals(children, result);
    }

    @Test
    public void testSaveSetting() {
        // Test verileri hazırlanır
        List<settings> settings = new ArrayList<>();
        // settings listesine test verileri eklenir
        manager.setSettings(settings);

        // Metodun çağrılması
        manager.saveSetting();

        // Kaydedilen ayarlar okunur
        manager.readSetting();

        // Beklenen sonuçlar kontrol edilir
        List<settings> result = manager.getSettings();
        assertEquals(settings, result);
    }

    @Test
    public void testSaveRecord() {
        // Test verileri hazırlanır
        List<Record> records = new ArrayList<>();
        // records listesine test verileri eklenir
        manager.setRecords(records);

        // Metodun çağrılması
        manager.saveRecord();

        // Kaydedilen kayıtlar okunur
        manager.readRecords();

        // Beklenen sonuçlar kontrol edilir
        List<Record> result = manager.getRecords();
        assertEquals(records, result);
    }

    @Test
    public void testReadChildren() {
        // Test verileri hazırlanır
        List<Child> children = new ArrayList<>();
        // children listesine test verileri eklenir
        manager.setChildren(children);

        // Metodun çağrılması
        manager.saveChildren();

        // Çocuklar okunur
        manager.readChildren();

        // Beklenen sonuçlar kontrol edilir
        List<Child> result = manager.getChildren();
        assertEquals(children, result);
    }

    @Test
    public void testReadSetting() {
        // Test verileri hazırlanır
        List<settings> settings = new ArrayList<>();
        // settings listesine test verileri eklenir
        manager.setSettings(settings);

        // Metodun çağrılması
        manager.saveSetting();

        // Ayarlar okunur
        manager.readSetting();

        // Beklenen sonuçlar kontrol edilir
        List<settings> result = manager.getSettings();
        assertEquals(settings, result);
    }

    @Test
    public void testReadRecords() {
        // Test verileri hazırlanır
        List<Record> records = new ArrayList<>();
        // records listesine test verileri eklenir
        manager.setRecords(records);

        // Metodun çağrılması
        manager.saveRecord();

        // Kayıtlar okunur
        manager.readRecords();

        // Beklenen sonuçlar kontrol edilir
        List<Record> result = manager.getRecords();
        assertEquals(records, result);
    }
}
