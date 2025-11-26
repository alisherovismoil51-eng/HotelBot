package Bahrom;

import java.util.HashMap;
import java.util.Map;

public class Tarjima {

    private static final Map<String, Map<String, String>> dictionary = new HashMap<>();

    static {
        Map<String, String> uz = new HashMap<>();
        uz.put("choose_lang", "Tilingizni tanlang");
        uz.put("search", "Qidirish");
        uz.put("choose_region", "Mehmonxona izlash uchun viloyatni tanlang");
        uz.put("tashkent", "Toshkent viloyati");
        uz.put("samarkand", "Samarqand viloyati");
        dictionary.put("uz", uz);

        Map<String, String> ru = new HashMap<>();
        ru.put("choose_lang", "Выберите язык");
        ru.put("search", "Поиск");
        ru.put("choose_region", "Выберите регион для поиска отеля");
        ru.put("tashkent", "Ташкентская область");
        ru.put("samarkand", "Самаркандская область");
        dictionary.put("ru", ru);

        Map<String, String> en = new HashMap<>();
        en.put("choose_lang", "Choose language");
        en.put("search", "Search");
        en.put("choose_region", "Choose a region to find a hotel");
        en.put("tashkent", "Tashkent region");
        en.put("samarkand", "Samarkand region");
        dictionary.put("en", en);

        Map<String, String> uz_cyr = new HashMap<>();
        uz_cyr.put("choose_lang", "Тилингизни танланг");
        uz_cyr.put("search", "Қидириш");
        uz_cyr.put("choose_region", "Меҳмонхона излаш учун вилоятни танланг");
        uz_cyr.put("tashkent", "Тошкент вилояти");
        uz_cyr.put("samarkand", "Самарқанд вилояти");
        dictionary.put("uz_cyr", uz_cyr);
    }

    public static String get(String lang, String key) {
        if (dictionary.containsKey(lang) && dictionary.get(lang).containsKey(key)) {
            return dictionary.get(lang).get(key);
        }
        return key;
    }
}