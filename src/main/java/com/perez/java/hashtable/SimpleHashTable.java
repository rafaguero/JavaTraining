package com.perez.java.hashtable;

public class SimpleHashTable {
    private StoredEmployee[] hashtable;

    public SimpleHashTable(){
        hashtable = new StoredEmployee[10];
    }

    public int hashKey(String key){
        return key.length() % hashtable.length;
    }

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    public void put(String key,Employee employee){
        int hashedKey = hashKey(key);
        if (occupied(hashedKey)){
            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length - 1){
                hashedKey = 0;
            }else {
                hashedKey++;
            }
            while ( occupied(hashedKey) && hashedKey != stopIndex){
                hashedKey = hashedKey % hashtable.length;
            }
        }
        if (occupied(hashedKey)){
            System.out.println("Sorry there is already an employee at position " + hashedKey);
        }else {
            hashtable[hashedKey] = new StoredEmployee(key,employee);
        }
    }
    public Employee get(String key){
        int hashKey = hashKey(key);
        return hashtable[hashKey].employee;
    }

    public void printHashTable(){
        for (int i = 0;i< hashtable.length; i++){
            System.out.println(hashtable[i]);

        }
    }
}
