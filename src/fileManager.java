/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author MÜDAFERKAYMAK
 */
public class fileManager {
    private List<Child> children;
    private List<settings> settings;
    private List<Record> records;
    
    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public void setSettings(List<settings> settings) {
        this.settings = settings;
    }
    
    public List<Child> getChildren() {
        return children;
    }

    public List<settings> getSettings() {
        return settings;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }
    
    private String fileName;

    public fileManager(String fileName) {
        this.fileName = fileName;
        children = new ArrayList<>();
        readChildren();
        settings = new ArrayList<>();
        readSetting();
        records = new ArrayList<>();
        readRecords();
    }

    public void addChild(Child child) {
        children.add(child);
        saveChildren();
    }


    public void addSettings(settings setting){
        settings.add(setting);
        saveSetting();
    }
    public void addRecord(Record record){
        records.add(record);
        saveRecord();
    }
    
    public void saveChildren() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(children);
            System.out.println("Çocuk kaydedildi.");
        } catch (IOException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
    public void saveSetting(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(settings);
            System.out.println("Ayar kaydedildi.");
        } catch (IOException e) {
            System.out.println("Hata1: " + e.getMessage());
        }
    }
    public void saveRecord(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(records);
            System.out.println("Kayıt kaydedildi.");
        } catch (IOException e) {
            System.out.println("Hata2: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    public void readChildren() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            children = (List<Child>) ois.readObject();
            System.out.println("Çocuk yüklendi.");

            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Hata3: " + e.getMessage());
        }
        
    }

    public List<settings> readSetting(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            settings = (List<settings>) ois.readObject();
            System.out.println("Ayar yüklendi.");

            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Hata: " + e.getMessage());
        }    
        return settings;
    }
    public List<Record> readRecords(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            records = (List<Record>) ois.readObject();
            System.out.println("Kayıt yüklendi.");
       
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Hata: " + e.getMessage());
        }    
        return records;
    }
}
