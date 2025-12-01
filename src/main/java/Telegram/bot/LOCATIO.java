package Telegram.bot;

import org.telegram.telegrambots.meta.api.methods.send.SendLocation;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendSticker;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LOCATIO {

    public SendMessage kirish(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Xush kelibsiz");
        return sendMessage;
    }








    public SendMessage shareLocation(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("LOcatsiyangizni jo'nating");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Share Location");
        button.setRequestLocation(true);
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }










    public SendPhoto amirsoyMountainResort(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("")));
        sendPhoto.setCaption(
                "Amirsoy Mountain Resort — Chiroyli tog‘ manzaralari bilan mashhur dam olish maskani.\n" +
                        "Narxlari ~ 2 500 000 so‘mdan boshlanadi.\n" +
                        "Ma’lumot va bronlash: +998 71 200-11-22.\n" +
                        "Manzil va batafsil: amirsoy.com 🌐"
        );
        sendPhoto.setReplyMarkup(locationButton("https://maps.app.goo.gl/amirsoy"));
        return sendPhoto;
    }

    public SendPhoto leChaletmalumot(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:")));
        sendPhoto.setCaption(
                "Le Chalet by Amirsoy — Amirsoy hududida joylashgan premium darajadagi tog‘ kottejlari majmuasi.\n" +
                        "Kottej narxlari ~ 3 000 000 so‘mdan boshlanadi.\n" +
                        "Ma’lumot va bronlash: +998 71 200-22-90, +998 99 790-22-44.\n" +
                        "Manzil va batafsil: amirsoy.com 🌐"
        );
        sendPhoto.setReplyMarkup(locationButton("https://maps.app.goo.gl/BPGh7JVwHdcHBvie9"));
        return sendPhoto;
    }

    public SendPhoto archazorMountainResort(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("")));
        sendPhoto.setCaption(
                "ARCHAZOR Mountain Resort — Chiroyli tog‘ maskani va sport imkoniyatlari bilan mashhur.\n" +
                        "Narxlari ~ 2 800 000 so‘mdan boshlanadi.\n" +
                        "Ma’lumot va bronlash: +998 71 300-33-44.\n" +
                        "Manzil va batafsil: archazor.com 🌐"
        );
        sendPhoto.setReplyMarkup(locationButton("https://maps.app.goo.gl/archazor"));
        return sendPhoto;
    }

    public SendPhoto beldersayHotelResort(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("")));
        sendPhoto.setCaption(
                "Beldersay Hotel & Resort — Tog‘ sporti va dam olish uchun ideal joy.\n" +
                        "Narxlari ~ 2 200 000 so‘mdan boshlanadi.\n" +
                        "Ma’lumot va bronlash: +998 71 400-55-66.\n" +
                        "Manzil va batafsil: beldersay.com 🌐"
        );
        sendPhoto.setReplyMarkup(locationButton("https://maps.app.goo.gl/beldersay"));
        return sendPhoto;
    }

    public SendPhoto aziaChimganHotel(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("")));
        sendPhoto.setCaption(
                "Azia Chimgan Hotel — Quvnoq dam olish va tog‘ manzaralari bilan mashhur.\n" +
                        "Narxlari ~ 1 800 000 so‘mdan boshlanadi.\n" +
                        "Ma’lumot va bronlash: +998 71 500-66-77.\n" +
                        "Manzil va batafsil: azia.com 🌐"
        );
        sendPhoto.setReplyMarkup(locationButton("https://maps.app.goo.gl/aziaChimgan"));
        return sendPhoto;
    }

    public SendPhoto amirsoyAppleDacha(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("")));
        sendPhoto.setCaption(
                "Amirsoy Apple Dacha — Dam olish uchun shinam va qulay kottejlar.\n" +
                        "Narxlari ~ 2 700 000 so‘mdan boshlanadi.\n" +
                        "Ma’lumot va bronlash: +998 71 600-77-88.\n" +
                        "Manzil va batafsil: amirsoyapple.com 🌐"
        );
        sendPhoto.setReplyMarkup(locationButton("https://maps.app.goo.gl/amirsoyApple"));
        return sendPhoto;
    }

    public SendPhoto apacheDamOlish(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("")));
        sendPhoto.setCaption(
                "Apache dam olish maskani — Tog‘ va tabiat manzaralari bilan mashhur.\n" +
                        "Narxlari ~ 1 900 000 so‘mdan boshlanadi.\n" +
                        "Ma’lumot va bronlash: +998 71 700-88-99.\n" +
                        "Manzil va batafsil: apache.com 🌐"
        );
        sendPhoto.setReplyMarkup(locationButton("https://maps.app.goo.gl/apache"));
        return sendPhoto;
    }

    public SendPhoto skyVillageChimgan(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("")));
        sendPhoto.setCaption(
                "Sky Village, Chimgan — Chiroyli tog‘ manzaralari va shinam maskan.\n" +
                        "Narxlari ~ 2 100 000 so‘mdan boshlanadi.\n" +
                        "Ma’lumot va bronlash: +998 71 800-99-00.\n" +
                        "Manzil va batafsil: skyvillage.com 🌐"
        );
        sendPhoto.setReplyMarkup(locationButton("https://maps.app.goo.gl/skyVillage"));
        return sendPhoto;
    }

    public SendPhoto nebesaGuestHouse(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("")));
        sendPhoto.setCaption(
                "Nebesa Guest House — Shinam va qulay dam olish maskani.\n" +
                        "Narxlari ~ 1 500 000 so‘mdan boshlanadi.\n" +
                        "Ma’lumot va bronlash: +998 71 900-00-11.\n" +
                        "Manzil va batafsil: nebesa.com 🌐"
        );
        sendPhoto.setReplyMarkup(locationButton("https://maps.app.goo.gl/nebesa"));
        return sendPhoto;
    }

    public SendPhoto panoramicHotel(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("")));
        sendPhoto.setCaption(
                "Panoramic Hotel — Tog‘ va tabiat manzaralari bilan mashhur zamonaviy mehmonxona.\n" +
                        "Narxlari ~ 2 400 000 so‘mdan boshlanadi.\n" +
                        "Ma’lumot va bronlash: +998 71 100-11-22.\n" +
                        "Manzil va batafsil: panoramic.com 🌐"
        );
        sendPhoto.setReplyMarkup(locationButton("https://maps.app.goo.gl/panoramic"));
        return sendPhoto;
    }

    private InlineKeyboardMarkup locationButton(String url) {
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("📍 Manzilni ko‘rish");
        button.setUrl(url);

        List<InlineKeyboardButton> row = new ArrayList<>();
        row.add(button);

        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        rows.add(row);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        markup.setKeyboard(rows);
        return markup;
    }

    public SendPhoto humoId(Long chatId) {
        SendPhoto p = new SendPhoto();
        p.setChatId(chatId);
        p.setPhoto(new InputFile(""));
        p.setCaption("🏨 Humo Hotel\nNarxi: 250 000 so‘mdan.\nTel: +998 XX XXX-XX-XX");

        InlineKeyboardButton btn = new InlineKeyboardButton();
        btn.setText("📍 Manzil");
        btn.setUrl("https://maps.app.goo.gl/humo");

        InlineKeyboardMarkup m = new InlineKeyboardMarkup(List.of(List.of(btn)));
        p.setReplyMarkup(m);
        return p;
    }

    public SendPhoto safarobodId(Long chatId) {
        SendPhoto p = new SendPhoto();
        p.setChatId(chatId);
        p.setPhoto(new InputFile(""));
        p.setCaption("🏨 Safar-Obod Hotel\nNarxi: 300 000 so‘mdan.\nTel: +998 XX XXX-XX-XX");

        InlineKeyboardButton btn = new InlineKeyboardButton();
        btn.setText("📍 Manzil");
        btn.setUrl("https://maps.app.goo.gl/safarobod");

        p.setReplyMarkup(new InlineKeyboardMarkup(List.of(List.of(btn))));
        return p;
    }

    public SendPhoto sadafId(Long chatId) {
        SendPhoto p = new SendPhoto();
        p.setChatId(chatId);
        p.setPhoto(new InputFile(""));
        p.setCaption("🏨 Sadaf Hotel\nNarxi: 220 000 so‘mdan.\nTel: +998 XX XXX-XX-XX");

        InlineKeyboardButton btn = new InlineKeyboardButton();
        btn.setText("📍 Manzil");
        btn.setUrl("https://maps.app.goo.gl/sadaf");

        p.setReplyMarkup(new InlineKeyboardMarkup(List.of(List.of(btn))));
        return p;
    }

    public SendPhoto sayhunId(Long chatId) {
        SendPhoto p = new SendPhoto();
        p.setChatId(chatId);
        p.setPhoto(new InputFile(""));
        p.setCaption("🏨 Sayhun Hotel\nNarxi: 200 000 so‘mdan.\nTel: +998 XX XXX-XX-XX");

        InlineKeyboardButton btn = new InlineKeyboardButton();
        btn.setText("📍 Manzil");
        btn.setUrl("https://maps.app.goo.gl/sayhun");

        p.setReplyMarkup(new InlineKeyboardMarkup(List.of(List.of(btn))));
        return p;
    }

    public SendPhoto farovonId(Long chatId) {
        SendPhoto p = new SendPhoto();
        p.setChatId(chatId);
        p.setPhoto(new InputFile(""));
        p.setCaption("🏨 Farovon Hotel\nNarxi: 280 000 so‘mdan.\nTel: +998 XX XXX-XX-XX");

        InlineKeyboardButton btn = new InlineKeyboardButton();
        btn.setText("📍 Manzil");
        btn.setUrl("https://maps.app.goo.gl/farovon");

        p.setReplyMarkup(new InlineKeyboardMarkup(List.of(List.of(btn))));
        return p;
    }

    public SendPhoto shohruxId(Long chatId) {
        SendPhoto p = new SendPhoto();
        p.setChatId(chatId);
        p.setPhoto(new InputFile(""));
        p.setCaption("🏨 Shohrux Hotel\nNarxi: 260 000 so‘mdan.\nTel: +998 XX XXX-XX-XX");

        InlineKeyboardButton btn = new InlineKeyboardButton();
        btn.setText("📍 Manzil");
        btn.setUrl("https://maps.app.goo.gl/shohrux");

        p.setReplyMarkup(new InlineKeyboardMarkup(List.of(List.of(btn))));
        return p;
    }

    public SendPhoto islombekId(Long chatId) {
        SendPhoto p = new SendPhoto();
        p.setChatId(chatId);
        p.setPhoto(new InputFile(""));
        p.setCaption("🏨 Islombek Mehmonxonasi\nNarxi: 230 000 so‘mdan.\nTel: +998 XX XXX-XX-XX");

        InlineKeyboardButton btn = new InlineKeyboardButton();
        btn.setText("📍 Manzil");
        btn.setUrl("https://maps.app.goo.gl/islombek");

        p.setReplyMarkup(new InlineKeyboardMarkup(List.of(List.of(btn))));
        return p;
    }

    public SendPhoto gulistonId(Long chatId) {
        SendPhoto p = new SendPhoto();
        p.setChatId(chatId);
        p.setPhoto(new InputFile(""));
        p.setCaption("🏨 Guliston Mehmonxonasi\nNarxi: 240 000 so‘mdan.\nTel: +998 XX XXX-XX-XX");

        InlineKeyboardButton btn = new InlineKeyboardButton();
        btn.setText("📍 Manzil");
        btn.setUrl("https://maps.app.goo.gl/guliston");

        p.setReplyMarkup(new InlineKeyboardMarkup(List.of(List.of(btn))));
        return p;
    }

    public SendPhoto sarviId(Long chatId) {
        SendPhoto p = new SendPhoto();
        p.setChatId(chatId);
        p.setPhoto(new InputFile(""));
        p.setCaption("🏨 Sarvi Mehmonxonasi\nNarxi: 210 000 so‘mdan.\nTel: +998 XX XXX-XX-XX");

        InlineKeyboardButton btn = new InlineKeyboardButton();
        btn.setText("📍 Manzil");
        btn.setUrl("https://maps.app.goo.gl/sarvi");

        p.setReplyMarkup(new InlineKeyboardMarkup(List.of(List.of(btn))));
        return p;
    }

    public SendPhoto dunyoId(Long chatId) {
        SendPhoto p = new SendPhoto();
        p.setChatId(chatId);
        p.setPhoto(new InputFile(""));
        p.setCaption("🏨 Dunyo Mehmonxonasi\nNarxi: 180 000 so‘mdan.\nTel: +998 XX XXX-XX-XX");

        InlineKeyboardButton btn = new InlineKeyboardButton();
        btn.setText("📍 Manzil");
        btn.setUrl("https://maps.app.goo.gl/dunyo");

        p.setReplyMarkup(new InlineKeyboardMarkup(List.of(List.of(btn))));
        return p;
    }









}
