package service;

import java.util.HashMap;
import java.util.Map;

public class Library {
    public Map<String, String> dictionary = new HashMap<>();

    public Library(){
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "thế nào");
        dictionary.put("name", "tên");
        dictionary.put("pen", "bút");
        dictionary.put("table", "cái bàn");
    }
}
