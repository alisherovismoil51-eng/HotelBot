package Telegram.bot;

import java.util.HashMap;
import java.util.Map;

public class location {

    private Map<String, String> hotelPhotos = new HashMap<>();

    public location() {

        String[] keys = {
                "amirsoyId",
                "amirsoy1Id",
                "archazorId",
                "bildirsoyId",
                "aziaId",
                "amirsoy2Id",
                "apacheId",
                "skyId",
                "nebesaId",
                "panoramicId"
        };

        int startNumber = 31;

        for (int i = 0; i < keys.length; i++) {
            String url = "https://t.me/dfghryu/" + (startNumber + i);
            hotelPhotos.put(keys[i], url);
        }
    }

    public String getHotelPhoto(String callbackData) {
        return hotelPhotos.get(callbackData);
    }
}
