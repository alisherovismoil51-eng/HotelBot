package Telegram.bot;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;
public class Mybotservis {
    public SendMessage startBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId.toString());
        sendMessage.setText("Tilingizni tanglang");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Русский\uD83C\uDDF7\uD83C\uDDFA");
        button.setCallbackData("РусскийId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("O'zbekcha\uD83C\uDDFA\uD83C\uDDFF");
        button1.setCallbackData("ozbekchaId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Ўзбекча\uD83C\uDDFA\uD83C\uDDFF");
        button2.setCallbackData("ЎзбекчаId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("English\uD83C\uDDF1\uD83C\uDDF7");
        button3.setCallbackData("englishId");
        row3.add(button3);
        rowList.add(row3);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage uzbekchaBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Ushbu Bot O'zbekiston viloyatlari boyicha mehmonhona izlashda yordam beradi ");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Toshkent viloyati");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Sirdaryo viloyati");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Jizzax viloyati");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Samarqand viloyati");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Qashqadaryo viloyati");
        row2.add(button4);
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Surxondaryo viloyati");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Namangan viloyati");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Farg‘ona viloyati");
        row3.add(button7);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Andijon viloyati");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();
        button9.setText("Buxoro viloyati");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();
        button10.setText("Navoiy viloyati");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();
        button11.setText("Xorazm viloyati");
        row5.add(button11);
        rowList.add(row5);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage inglizchaBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("This bot helps you find a hotel");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Tashkent region");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Sirdaryo region");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Jizzax region");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Samarqand region");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Qashqadaryo region");
        row2.add(button4);
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Surxondaryo region");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Namangan region");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Farg‘ona region");
        row3.add(button7);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Andijon region");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();
        button9.setText("Buxoro region");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();
        button10.setText("Navoiy region");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();
        button11.setText("Xorazm region");
        row5.add(button11);
        rowList.add(row5);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage ruschaBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Этот бот поможет вам найти отель");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Ташкентская область");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Сырдарьинская область");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Джизакская область");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Самаркандская область");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Кашкадарьинская область");
        row2.add(button4);
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Сурхандарьинская область");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Наманганская область");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Ферганская область");
        row3.add(button7);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Андижанская область");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();
        button9.setText("Бухарская область");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();
        button10.setText("Навоийская область");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();
        button11.setText("Хорезмская область");
        row5.add(button11);
        rowList.add(row5);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage krilchaBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("“Ушбу бот меҳмонхона излашда ёрдам беради.”");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Тошкент вилояти");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Сирдарё вилояти");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Жиззах вилояти");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Самарқанд вилояти");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Қашқадарё вилояти");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Сурхондарё вилояти");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Наманган вилояти");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Фарғона вилояти");
        row3.add(button7);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Андижон вилояти");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();
        button9.setText("Бухоро вилояти");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();
        button10.setText("Навоий вилояти");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();
        button11.setText("Хоразм вилояти");
        row5.add(button11);
        rowList.add(row5);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }


//TOSHKEN---------------------------------------------------------------------------------------------------------------



    public SendMessage ToshkenBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tanlang");


        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Amirsoy Mountain Resort");
        button.setCallbackData("amirsoyId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Le Chalet by Amirsoy");
        button1.setCallbackData("amirsoy1Id");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("ARCHAZOR Mountain Resort");
        button2.setCallbackData("archazorId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Beldersay Hotel & Resort");
        button3.setCallbackData("bildirsoyId");
        row3.add(button3);
        rowList.add(row3);


        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Azia Chimgan Hotel");
        button4.setCallbackData("aziaId");
        row4.add(button4);
        rowList.add(row4);


        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Amirsoy Apple Dacha");
        button5.setCallbackData("amirsoy2Id");
        row5.add(button5);
        rowList.add(row5);


        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Apache dam olish maskani");
        button6.setCallbackData("apacheId");
        row6.add(button6);
        rowList.add(row6);


        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Sky Village, Chimgan");
        button7.setCallbackData("skyId");
        row7.add(button7);
        rowList.add(row7);


        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Nebesa Guest House");
        button8.setCallbackData("nebesaId");
        row8.add(button8);
        rowList.add(row8);


        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Panoramic Hotel");
        button9.setCallbackData("panoramicId");
        row9.add(button9);
        rowList.add(row9);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage inglizchatoshkenBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Search");


        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Amirsoy Mountain Resort");
        button.setCallbackData("amirsoyengId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Le Chalet by Amirsoy");
        button1.setCallbackData("amirsoyeng1Id");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("ARCHAZOR Mountain Resort");
        button2.setCallbackData("archazorengId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Beldersay Hotel & Resort");
        button3.setCallbackData("bildirsoyengId");
        row3.add(button3);
        rowList.add(row3);


        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Azia Chimgan Hotel");
        button4.setCallbackData("aziaengId");
        row4.add(button4);
        rowList.add(row4);


        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Amirsoy Apple ");
        button5.setCallbackData("amirsoyeng2Id");
        row5.add(button5);
        rowList.add(row5);


        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Apache ");
        button6.setCallbackData("apacheengId");
        row6.add(button6);
        rowList.add(row6);


        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Sky Village, Chimgan");
        button7.setCallbackData("skyengId");
        row7.add(button7);
        rowList.add(row7);


        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Nebesa Guest House");
        button8.setCallbackData("nebesaengId");
        row8.add(button8);
        rowList.add(row8);


        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Panoramic Hotel");
        button9.setCallbackData("panoramicengId");
        row9.add(button9);
        rowList.add(row9);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage ruschaToshkenBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("поиск");


        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Горный курорт Amirsoy");
        button.setCallbackData("amirsoyrusId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Le Chalet от Amirsoy");
        button1.setCallbackData("amirsoyrus1Id");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Горный курорт ARCHAZOR");
        button2.setCallbackData("archazorrusId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Отель и курорт Beldersay");
        button3.setCallbackData("bildirsoyrusId");
        row3.add(button3);
        rowList.add(row3);


        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Отель Azia Chimgan");
        button4.setCallbackData("aziaengId");
        row4.add(button4);
        rowList.add(row4);


        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Гостиница Amirsoy Apple");
        button5.setCallbackData("amirsoyrus2Id");
        row5.add(button5);
        rowList.add(row5);


        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Отель Apache ");
        button6.setCallbackData("apacherusId");
        row6.add(button6);
        rowList.add(row6);


        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Sky Отель, Chimgan");
        button7.setCallbackData("skyrusId");
        row7.add(button7);
        rowList.add(row7);


        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Nebesa Guest Отель");
        button8.setCallbackData("nebesarusId");
        row8.add(button8);
        rowList.add(row8);


        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Panoramic Отель");
        button9.setCallbackData("panoramicrusId");
        row9.add(button9);
        rowList.add(row9);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage krilchaToshkenBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Қидириш");


        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Амирсой Маунтин Ресорт");
        button.setCallbackData("amirsoyrusId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Ле Шале бай Амирсой");
        button1.setCallbackData("amirsoyrus1Id");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Арчазор Маунтин Ресорт");
        button2.setCallbackData("archazorrusId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Белдерсай Хотел ва Ресорт");
        button3.setCallbackData("bildirsoyrusId");
        row3.add(button3);
        rowList.add(row3);


        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Азия Чимган Хотел");
        button4.setCallbackData("aziaengId");
        row4.add(button4);
        rowList.add(row4);


        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Амирсой Эппл Дача");
        button5.setCallbackData("amirsoyrus2Id");
        row5.add(button5);
        rowList.add(row5);


        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Апаче дам олиш маскани ");
        button6.setCallbackData("apacherusId");
        row6.add(button6);
        rowList.add(row6);


        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Скай Вилладж, Чимган");
        button7.setCallbackData("skyrusId");
        row7.add(button7);
        rowList.add(row7);


        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Небеса Гуест Хаус");
        button8.setCallbackData("nebesarusId");
        row8.add(button8);
        rowList.add(row8);


        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Панорамик Хотел");
        button9.setCallbackData("panoramicrusId");
        row9.add(button9);
        rowList.add(row9);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }



//    SIRDARYO----------------------------------------------------------------------------------------------------------



    public SendMessage sirdaryoBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Qidirish");


        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Humo Hotel");
        button.setCallbackData("humoId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Safar-Obod Hotel");
        button1.setCallbackData("safarobodId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Sadaf Hotel");
        button2.setCallbackData("sadafId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Sayhun Hotel");
        button3.setCallbackData("sayhunId");
        row3.add(button3);
        rowList.add(row3);


        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Farovon Hotel");
        button4.setCallbackData("farovonId");
        row4.add(button4);
        rowList.add(row4);


        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Shohruх Hotel");
        button5.setCallbackData("shohruxId");
        row5.add(button5);
        rowList.add(row5);


        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Islombek Mehmonxonasi");
        button6.setCallbackData("islombekId");
        row6.add(button6);
        rowList.add(row6);


        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Guliston Mehmonxonasi");
        button7.setCallbackData("gulistonId");
        row7.add(button7);
        rowList.add(row7);


        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Sarvi Mehmonxonasi");
        button8.setCallbackData("sarviId");
        row8.add(button8);
        rowList.add(row8);


        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Dunyo Mehmonxonasi");
        button9.setCallbackData("dunyoId");
        row9.add(button9);
        rowList.add(row9);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage sirdaryoRuschaBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Поиск");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> r0 = new ArrayList<>();
        InlineKeyboardButton b0 = new InlineKeyboardButton();
        b0.setText("Отель Humo");
        b0.setCallbackData("humoRusId");
        r0.add(b0);
        rowList.add(r0);

        List<InlineKeyboardButton> r1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Отель Safar-Obod");
        b1.setCallbackData("safarobodRusId");
        r1.add(b1);
        rowList.add(r1);

        List<InlineKeyboardButton> r2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Отель Sadaf");
        b2.setCallbackData("sadafRusId");
        r2.add(b2);
        rowList.add(r2);

        List<InlineKeyboardButton> r3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Отель Sayhun");
        b3.setCallbackData("sayhunRusId");
        r3.add(b3);
        rowList.add(r3);

        List<InlineKeyboardButton> r4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Отель Farovon");
        b4.setCallbackData("farovonRusId");
        r4.add(b4);
        rowList.add(r4);

        List<InlineKeyboardButton> r5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Отель Shohrux");
        b5.setCallbackData("shohruxRusId");
        r5.add(b5);
        rowList.add(r5);

        List<InlineKeyboardButton> r6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Гостиница Islombek");
        b6.setCallbackData("islombekRusId");
        r6.add(b6);
        rowList.add(r6);

        List<InlineKeyboardButton> r7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Гостиница Guliston");
        b7.setCallbackData("gulistonRusId");
        r7.add(b7);
        rowList.add(r7);

        List<InlineKeyboardButton> r8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Гостиница Sarvi");
        b8.setCallbackData("sarviRusId");
        r8.add(b8);
        rowList.add(r8);

        List<InlineKeyboardButton> r9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("Гостиница Dunyo");
        b9.setCallbackData("dunyoRusId");
        r9.add(b9);
        rowList.add(r9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage sirdaryoEngBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Search");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> r0 = new ArrayList<>();
        InlineKeyboardButton b0 = new InlineKeyboardButton();
        b0.setText("Humo Hotel");
        b0.setCallbackData("humoEngId");
        r0.add(b0);
        rowList.add(r0);

        List<InlineKeyboardButton> r1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Safar-Obod Hotel");
        b1.setCallbackData("safarobodEngId");
        r1.add(b1);
        rowList.add(r1);

        List<InlineKeyboardButton> r2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Sadaf Hotel");
        b2.setCallbackData("sadafEngId");
        r2.add(b2);
        rowList.add(r2);

        List<InlineKeyboardButton> r3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Sayhun Hotel");
        b3.setCallbackData("sayhunEngId");
        r3.add(b3);
        rowList.add(r3);

        List<InlineKeyboardButton> r4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Farovon Hotel");
        b4.setCallbackData("farovonEngId");
        r4.add(b4);
        rowList.add(r4);

        List<InlineKeyboardButton> r5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Shohrux Hotel");
        b5.setCallbackData("shohruxEngId");
        r5.add(b5);
        rowList.add(r5);

        List<InlineKeyboardButton> r6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Islombek Hotel");
        b6.setCallbackData("islombekEngId");
        r6.add(b6);
        rowList.add(r6);

        List<InlineKeyboardButton> r7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Guliston Hotel");
        b7.setCallbackData("gulistonEngId");
        r7.add(b7);
        rowList.add(r7);

        List<InlineKeyboardButton> r8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Sarvi Hotel");
        b8.setCallbackData("sarviEngId");
        r8.add(b8);
        rowList.add(r8);

        List<InlineKeyboardButton> r9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("Dunyo Hotel");
        b9.setCallbackData("dunyoEngId");
        r9.add(b9);
        rowList.add(r9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage sirdaryoKrilchaBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Қидириш");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> r0 = new ArrayList<>();
        InlineKeyboardButton b0 = new InlineKeyboardButton();
        b0.setText("Ҳумо Хотел");
        b0.setCallbackData("humoKrilId");
        r0.add(b0);
        rowList.add(r0);

        List<InlineKeyboardButton> r1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Сафар-Обод Хотел");
        b1.setCallbackData("safarobodKrilId");
        r1.add(b1);
        rowList.add(r1);

        List<InlineKeyboardButton> r2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Садаф Хотел");
        b2.setCallbackData("sadafKrilId");
        r2.add(b2);
        rowList.add(r2);

        List<InlineKeyboardButton> r3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Сайҳун Хотел");
        b3.setCallbackData("sayhunKrilId");
        r3.add(b3);
        rowList.add(r3);

        List<InlineKeyboardButton> r4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Фаровон Хотел");
        b4.setCallbackData("farovonKrilId");
        r4.add(b4);
        rowList.add(r4);

        List<InlineKeyboardButton> r5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Шоҳрух Хотел");
        b5.setCallbackData("shohruxKrilId");
        r5.add(b5);
        rowList.add(r5);

        List<InlineKeyboardButton> r6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Исломбек Меҳмонхонаси");
        b6.setCallbackData("islombekKrilId");
        r6.add(b6);
        rowList.add(r6);

        List<InlineKeyboardButton> r7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Гулистон Меҳмонхонаси");
        b7.setCallbackData("gulistonKrilId");
        r7.add(b7);
        rowList.add(r7);

        List<InlineKeyboardButton> r8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Сарви Меҳмонхонаси");
        b8.setCallbackData("sarviKrilId");
        r8.add(b8);
        rowList.add(r8);

        List<InlineKeyboardButton> r9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("Дунё Меҳмонхонаси");
        b9.setCallbackData("dunyoKrilId");
        r9.add(b9);
        rowList.add(r9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }



//Jizzax----------------------------------------------------------------------------------------------------------------



    public SendMessage jizzaxBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Qidirish");


        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Grand Hotel Uzbekistan");
        button.setCallbackData("grandId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Grand Royal");
        button1.setCallbackData("royalId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("BEK PLUS Hotel");
        button2.setCallbackData("bekplusId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Jahon Grand Mehmonxonasi");
        button3.setCallbackData("jahonId");
        row3.add(button3);
        rowList.add(row3);


        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Turkiston Hotel");
        button4.setCallbackData("turkistonId");
        row4.add(button4);
        rowList.add(row4);


        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Afrosiyob Mehmonxonasi");
        button5.setCallbackData("afrosiyobId");
        row5.add(button5);
        rowList.add(row5);


        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Florence Hotel");
        button6.setCallbackData("florenceId");
        row6.add(button6);
        rowList.add(row6);


        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("DUNYO Hotel");
        button7.setCallbackData("dunyoId");
        row7.add(button7);
        rowList.add(row7);


        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("BMB Za’faron Hotel");
        button8.setCallbackData("bmbId");
        row8.add(button8);
        rowList.add(row8);


        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Toshkent Hotel");
        button9.setCallbackData("toshkenId");
        row9.add(button9);
        rowList.add(row9);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage jizzaxRuschaBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Поиск");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton b = new InlineKeyboardButton();
        b.setText("Гранд Джиззах Отель");
        b.setCallbackData("grandJizzaxRusId");
        row.add(b);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Джиззах Палас Отель");
        b1.setCallbackData("jizzaxPalaceRusId");
        row1.add(b1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Хаятт Инн Джиззах");
        b2.setCallbackData("hyattRusId");
        row2.add(b2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Отель Diyor");
        b3.setCallbackData("diyorRusId");
        row3.add(b3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Zomin Plaza Отель");
        b4.setCallbackData("zominRusId");
        row4.add(b4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Sipehr Hotel Jizzakh");
        b5.setCallbackData("sipehrRusId");
        row5.add(b5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Jizzax Deluxe Отель");
        b6.setCallbackData("deluxeRusId");
        row6.add(b6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Jizzax Stars Отель");
        b7.setCallbackData("starsRusId");
        row7.add(b7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Регистон Джиззах Отель");
        b8.setCallbackData("registonRusId");
        row8.add(b8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("Комфорт Джиззах Отель");
        b9.setCallbackData("comfortRusId");
        row9.add(b9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage jizzaxEngBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Search");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> r = new ArrayList<>();
        InlineKeyboardButton b = new InlineKeyboardButton();
        b.setText("Grand Jizzakh Hotel");
        b.setCallbackData("grandJizzaxEngId");
        r.add(b);
        rowList.add(r);

        List<InlineKeyboardButton> r1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Jizzakh Palace Hotel");
        b1.setCallbackData("jizzaxPalaceEngId");
        r1.add(b1);
        rowList.add(r1);

        List<InlineKeyboardButton> r2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Hyatt Inn Jizzakh");
        b2.setCallbackData("hyattEngId");
        r2.add(b2);
        rowList.add(r2);

        List<InlineKeyboardButton> r3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Diyor Hotel");
        b3.setCallbackData("diyorEngId");
        r3.add(b3);
        rowList.add(r3);

        List<InlineKeyboardButton> r4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Zomin Plaza Hotel");
        b4.setCallbackData("zominEngId");
        r4.add(b4);
        rowList.add(r4);

        List<InlineKeyboardButton> r5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Sipehr Hotel Jizzakh");
        b5.setCallbackData("sipehrEngId");
        r5.add(b5);
        rowList.add(r5);

        List<InlineKeyboardButton> r6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Jizzakh Deluxe Hotel");
        b6.setCallbackData("deluxeEngId");
        r6.add(b6);
        rowList.add(r6);

        List<InlineKeyboardButton> r7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Jizzakh Stars Hotel");
        b7.setCallbackData("starsEngId");
        r7.add(b7);
        rowList.add(r7);

        List<InlineKeyboardButton> r8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Registon Jizzakh Hotel");
        b8.setCallbackData("registonEngId");
        r8.add(b8);
        rowList.add(r8);

        List<InlineKeyboardButton> r9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("Comfort Jizzakh Hotel");
        b9.setCallbackData("comfortEngId");
        r9.add(b9);
        rowList.add(r9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage jizzaxKrilchaBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Қидириш");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> r = new ArrayList<>();
        InlineKeyboardButton b = new InlineKeyboardButton();
        b.setText("Гранд Жиззах Хотел");
        b.setCallbackData("grandJizzaxKrilId");
        r.add(b);
        rowList.add(r);

        List<InlineKeyboardButton> r1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Жиззах Палас Хотел");
        b1.setCallbackData("jizzaxPalaceKrilId");
        r1.add(b1);
        rowList.add(r1);

        List<InlineKeyboardButton> r2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Хаятт Инн Жиззах");
        b2.setCallbackData("hyattKrilId");
        r2.add(b2);
        rowList.add(r2);

        List<InlineKeyboardButton> r3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Диёр Хотел");
        b3.setCallbackData("diyorKrilId");
        r3.add(b3);
        rowList.add(r3);

        List<InlineKeyboardButton> r4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Зомин Плаза Хотел");
        b4.setCallbackData("zominKrilId");
        r4.add(b4);
        rowList.add(r4);

        List<InlineKeyboardButton> r5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Сипехр Хотел Жиззах");
        b5.setCallbackData("sipehrKrilId");
        r5.add(b5);
        rowList.add(r5);

        List<InlineKeyboardButton> r6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Жиззах Делюкс Хотел");
        b6.setCallbackData("deluxeKrilId");
        r6.add(b6);
        rowList.add(r6);

        List<InlineKeyboardButton> r7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Жиззах Старс Хотел");
        b7.setCallbackData("starsKrilId");
        r7.add(b7);
        rowList.add(r7);

        List<InlineKeyboardButton> r8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Регистон Жиззах Хотел");
        b8.setCallbackData("registonKrilId");
        r8.add(b8);
        rowList.add(r8);

        List<InlineKeyboardButton> r9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("Комфорт Жиззах Хотел");
        b9.setCallbackData("comfortKrilId");
        r9.add(b9);
        rowList.add(r9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }



//SAMARQAND-------------------------------------------------------------------------------------------------------------



    public SendMessage samarqandBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Qidirish");


        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Kosh Havuz Boutique Hotel");
        button.setCallbackData("koshId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Savitsky Plaza Hotel");
        button1.setCallbackData("savitskyId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Hilton Garden Inn Samarkand");
        button2.setCallbackData("hiltonId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Silk Road by Minyoun");
        button3.setCallbackData("silkId");
        row3.add(button3);
        rowList.add(row3);


        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Wellness Park Hotel Bactria");
        button4.setCallbackData("wellnessId");
        row4.add(button4);
        rowList.add(row4);


        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Izumrud Palace");
        button5.setCallbackData("izumrudId");
        row5.add(button5);
        rowList.add(row5);


        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Hanifa Boutique Hotel");
        button6.setCallbackData("hanifaId");
        row6.add(button6);
        rowList.add(row6);


        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Sangzor Boutique Hote");
        button7.setCallbackData("sangzorId");
        row7.add(button7);
        rowList.add(row7);


        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Bibikhanum Hotel");
        button8.setCallbackData("bibikhanumId");
        row8.add(button8);
        rowList.add(row8);


        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Continental Hotel Samarkand");
        button9.setCallbackData("continentalId");
        row9.add(button9);
        rowList.add(row9);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage samarqandRuschaBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Поиск");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Kosh Havuz Бутик Отель");
        button.setCallbackData("koshRusId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Savitsky Plaza Отель");
        button1.setCallbackData("savitskyRusId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Hilton Garden Inn Samarkand");
        button2.setCallbackData("hiltonRusId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Silk Road by Minyoun Отель");
        button3.setCallbackData("silkRusId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Wellness Park Hotel Bactria");
        button4.setCallbackData("wellnessRusId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Izumrud Palace Отель");
        button5.setCallbackData("izumrudRusId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Hanifa Бутик Отель");
        button6.setCallbackData("hanifaRusId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Sangzor Бутик Отель");
        button7.setCallbackData("sangzorRusId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Bibikhanum Отель");
        button8.setCallbackData("bibikhanumRusId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Continental Hotel Samarkand");
        button9.setCallbackData("continentalRusId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage samarqandEngBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Search");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Kosh Havuz Boutique Hotel");
        button.setCallbackData("koshEngId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Savitsky Plaza Hotel");
        button1.setCallbackData("savitskyEngId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Hilton Garden Inn Samarkand");
        button2.setCallbackData("hiltonEngId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Silk Road by Minyoun");
        button3.setCallbackData("silkEngId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Wellness Park Hotel Bactria");
        button4.setCallbackData("wellnessEngId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Izumrud Palace");
        button5.setCallbackData("izumrudEngId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Hanifa Boutique Hotel");
        button6.setCallbackData("hanifaEngId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Sangzor Boutique Hotel");
        button7.setCallbackData("sangzorEngId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Bibikhanum Hotel");
        button8.setCallbackData("bibikhanumEngId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Continental Hotel Samarkand");
        button9.setCallbackData("continentalEngId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage samarqandKrilchaBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Қидириш");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Кош Хавуз Бутик Хотел");
        button.setCallbackData("koshKrilId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Савицкий Плаза Хотел");
        button1.setCallbackData("savitskyKrilId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Хилтон Гарден Инн Самарканд");
        button2.setCallbackData("hiltonKrilId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Силк Роад бай Миниюн");
        button3.setCallbackData("silkKrilId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Велнесс Парк Хотел Бактрия");
        button4.setCallbackData("wellnessKrilId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Изумруд Палас");
        button5.setCallbackData("izumrudKrilId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Ханифа Бутик Хотел");
        button6.setCallbackData("hanifaKrilId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Сангзор Бутик Хотел");
        button7.setCallbackData("sangzorKrilId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Бибиханум Хотел");
        button8.setCallbackData("bibikhanumKrilId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Континентал Хотел Самарканд");
        button9.setCallbackData("continentalKrilId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }



//QASHQADARYO-----------------------------------------------------------------------------------------------------------



    public SendMessage qashqadaryoBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Qidirish");


        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Reikartz Qarshi");
        button.setCallbackData("reikartzId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Grand Sarbon Hotel");
        button1.setCallbackData("grandsarbonId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Grand Star Hotel");
        button2.setCallbackData("grandstarId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Saroy Palace Hotel");
        button3.setCallbackData("saroyId");
        row3.add(button3);
        rowList.add(row3);


        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Hotel Sultan");
        button4.setCallbackData("sultanId");
        row4.add(button4);
        rowList.add(row4);


        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Afsona Hotel");
        button5.setCallbackData("AfsonaId");
        row5.add(button5);
        rowList.add(row5);


        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Hotel Naxshab");
        button6.setCallbackData("naxshabId");
        row6.add(button6);
        rowList.add(row6);


        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Astra Hotel");
        button7.setCallbackData("AstraId");
        row7.add(button7);
        rowList.add(row7);


        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Royal Plaza Hotel");
        button8.setCallbackData("royalplazaId");
        row8.add(button8);
        rowList.add(row8);


        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Oqsaroy Hotel");
        button9.setCallbackData("oqsaroyId");
        row9.add(button9);
        rowList.add(row9);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage qashqadaryoRuschaBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Поиск");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Отель Reikartz Qarshi");
        button.setCallbackData("reikartzRusId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Гранд Сарбон Отель");
        button1.setCallbackData("grandSarbonRusId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Гранд Стар Отель");
        button2.setCallbackData("grandStarRusId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Отель Saroy Palace");
        button3.setCallbackData("saroyRusId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Отель Sultan");
        button4.setCallbackData("sultanRusId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Отель Afsona");
        button5.setCallbackData("afsonaRusId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Отель Naxshab");
        button6.setCallbackData("naxshabRusId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Отель Astra");
        button7.setCallbackData("astraRusId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Отель Royal Plaza");
        button8.setCallbackData("royalPlazaRusId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Отель Oqsaroy");
        button9.setCallbackData("oqsaroyRusId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage qashqadaryoEngBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Search");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Reikartz Qarshi");
        button.setCallbackData("reikartzEngId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Grand Sarbon Hotel");
        button1.setCallbackData("grandSarbonEngId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Grand Star Hotel");
        button2.setCallbackData("grandStarEngId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Saroy Palace Hotel");
        button3.setCallbackData("saroyEngId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Hotel Sultan");
        button4.setCallbackData("sultanEngId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Afsona Hotel");
        button5.setCallbackData("afsonaEngId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Hotel Naxshab");
        button6.setCallbackData("naxshabEngId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Astra Hotel");
        button7.setCallbackData("astraEngId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Royal Plaza Hotel");
        button8.setCallbackData("royalPlazaEngId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Oqsaroy Hotel");
        button9.setCallbackData("oqsaroyEngId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage qashqadaryoKrilchaBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Қидириш");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Reikartz Qarshi");
        button.setCallbackData("reikartzKrilId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Гранд Сарбон Хотел");
        button1.setCallbackData("grandSarbonKrilId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Гранд Стар Хотел");
        button2.setCallbackData("grandStarKrilId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Сарой Палас Хотел");
        button3.setCallbackData("saroyKrilId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Хотел Султон");
        button4.setCallbackData("sultanKrilId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Афсона Хотел");
        button5.setCallbackData("afsonaKrilId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Хотел Наксшаб");
        button6.setCallbackData("naxshabKrilId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Астра Хотел");
        button7.setCallbackData("astraKrilId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Роял Плаза Хотел");
        button8.setCallbackData("royalPlazaKrilId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Оқсарой Хотел");
        button9.setCallbackData("oqsaroyKrilId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }



//ANDIJON --------------------------------------------------------------------------------------------------------------



    public SendMessage andijonBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Qidirish");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Oltin Vodiy Hotel");
        button.setCallbackData("oltinvodiyId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Andijon Hotel");
        button1.setCallbackData("andijonhId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Bogishamol Hotel");
        button2.setCallbackData("bogishamolId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Royal Hotel");
        button3.setCallbackData("royalandijonId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Zargar Hotel");
        button4.setCallbackData("zargarId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Elite Hotel Andijan");
        button5.setCallbackData("eliteandijonId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Comfort Hotel");
        button6.setCallbackData("comfortandijonId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Atlas Hotel");
        button7.setCallbackData("atlasandijonId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Asia Andijan Hotel");
        button8.setCallbackData("asiaandijanId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Suzuk Ota Hotel");
        button9.setCallbackData("suzukotaId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage andijonEngBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Search");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Oltin Vodiy Hotel");
        button.setCallbackData("oltinvodiyEngId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Andijan Hotel");
        button1.setCallbackData("andijonhEngId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Bogishamol Hotel");
        button2.setCallbackData("bogishamolEngId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Royal Hotel");
        button3.setCallbackData("royalandijonEngId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Zargar Hotel");
        button4.setCallbackData("zargarEngId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Elite Hotel Andijan");
        button5.setCallbackData("eliteandijonEngId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Comfort Hotel");
        button6.setCallbackData("comfortandijonEngId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Atlas Hotel");
        button7.setCallbackData("atlasandijonEngId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Asia Andijan Hotel");
        button8.setCallbackData("asiaandijanEngId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Suzuk Ota Hotel");
        button9.setCallbackData("suzukotaEngId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage andijonRusBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("поиск");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Отель Олтин Водий");
        button.setCallbackData("oltinvodiyRusId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Отель Андижан");
        button1.setCallbackData("andijonhRusId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Отель Боги Шамол");
        button2.setCallbackData("bogishamolRusId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Роял Отель");
        button3.setCallbackData("royalandijonRusId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Отель Зергар");
        button4.setCallbackData("zargarRusId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Элит Отель Андижан");
        button5.setCallbackData("eliteandijonRusId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Комфорт Отель");
        button6.setCallbackData("comfortandijonRusId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Атлас Отель");
        button7.setCallbackData("atlasandijonRusId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Азия Андижан Отель");
        button8.setCallbackData("asiaandijanRusId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Сузук Ота Отель");
        button9.setCallbackData("suzukotaRusId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage andijonKrilBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Қидириш");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Олтин Водий Хотел");
        button.setCallbackData("oltinvodiyKrilId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Андижон Хотел");
        button1.setCallbackData("andijonhKrilId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Боғишамол Хотел");
        button2.setCallbackData("bogishamolKrilId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Роял Хотел");
        button3.setCallbackData("royalandijonKrilId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Заргар Хотел");
        button4.setCallbackData("zargarKrilId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Элит Хотел Андижон");
        button5.setCallbackData("eliteandijonKrilId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Комфорт Хотел");
        button6.setCallbackData("comfortandijonKrilId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Атлас Хотел");
        button7.setCallbackData("atlasandijonKrilId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Осиё Андижон Хотел");
        button8.setCallbackData("asiaandijanKrilId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Сузук Ота Хотел");
        button9.setCallbackData("suzukotaKrilId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }




// FARGONA ------------------------------------------------------------------------------------------------------------






    public SendMessage fargonaBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Qidirish");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Asia Fergana Hotel");
        button.setCallbackData("asiafargonaId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Grand Fergana Hotel");
        button1.setCallbackData("grandfargonaId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Sevinch Hotel");
        button2.setCallbackData("sevinchId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Club 777 Hotel");
        button3.setCallbackData("club777Id");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Silk Road Kokand Hotel");
        button4.setCallbackData("silkroadkokandId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Istiklol Hotel");
        button5.setCallbackData("istiklolId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Fergana Palace");
        button6.setCallbackData("palacefargonaId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Orom Hotel");
        button7.setCallbackData("oromId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Evos Fergana Hotel");
        button8.setCallbackData("evosfargonaId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Zilol Baxt Hotel");
        button9.setCallbackData("zilolbaxtId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage fargonaEngBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Search");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Asia Fergana Hotel");
        button.setCallbackData("asiafargonaEngId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Grand Fergana Hotel");
        button1.setCallbackData("grandfargonaEngId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Sevinch Hotel");
        button2.setCallbackData("sevinchEngId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Club 777 Hotel");
        button3.setCallbackData("club777EngId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Silk Road Kokand Hotel");
        button4.setCallbackData("silkroadkokandEngId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Istiqlol Hotel");
        button5.setCallbackData("istiklolEngId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Fergana Palace");
        button6.setCallbackData("palacefargonaEngId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Orom Hotel");
        button7.setCallbackData("oromEngId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Evos Fergana Hotel");
        button8.setCallbackData("evosfargonaEngId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Zilol Baxt Hotel");
        button9.setCallbackData("zilolbaxtEngId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage fargonaRusBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("поиск");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Отель Азия Фергана");
        button.setCallbackData("asiafargonaRusId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Гранд Фергана Отель");
        button1.setCallbackData("grandfargonaRusId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Отель Севинч");
        button2.setCallbackData("sevichRusId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Клуб 777 Отель");
        button3.setCallbackData("club777RusId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Шелковый путь Коканд Отель");
        button4.setCallbackData("silkroadkokandRusId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Истиклол Отель");
        button5.setCallbackData("istiklolRusId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Фергана Палас");
        button6.setCallbackData("palacefargonaRusId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Ором Отель");
        button7.setCallbackData("oromRusId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Эвос Фергана Отель");
        button8.setCallbackData("evosfargonaRusId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Зилол Бахт Отель");
        button9.setCallbackData("zilolbaxtRusId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage fargonaKrilBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Қидириш");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Осиё Фарғона Хотел");
        button.setCallbackData("asiafargonaKrilId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Гранд Фарғона Хотел");
        button1.setCallbackData("grandfargonaKrilId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Севинч Хотел");
        button2.setCallbackData("sevinchKrilId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Клуб 777 Хотел");
        button3.setCallbackData("club777KrilId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Ипак йўли Кўқон Хотел");
        button4.setCallbackData("silkroadkokandKrilId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Истиқлол Хотел");
        button5.setCallbackData("istiklolKrilId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Фарғона Палас");
        button6.setCallbackData("palacefargonaKrilId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Ором Хотел");
        button7.setCallbackData("oromKrilId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Эвос Фарғона Хотел");
        button8.setCallbackData("evosfargonaKrilId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Зилол Бахт Хотел");
        button9.setCallbackData("zilolbaxtKrilId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }





//    NAMANGAN ----------------------------------------------------------------------------------------------------------------------






    public SendMessage namanganBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Qidirish");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Hotel Shahriston");
        button.setCallbackData("shahristonId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Hotel Navbahor");
        button1.setCallbackData("navbahorId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Hotel Oltin");
        button2.setCallbackData("oltinId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Hotel Marvarid");
        button3.setCallbackData("marvaridId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Hotel Silk Road Namangan");
        button4.setCallbackData("silkroadnamanganId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Hotel Istiklol Namangan");
        button5.setCallbackData("istiklolnamanganId");
        row5.add(button5);
        rowList.add(row5);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage namanganEngBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Search");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Hotel Shahriston");
        button.setCallbackData("shahristonEngId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Hotel Navbahor");
        button1.setCallbackData("navbahorEngId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Hotel Oltin");
        button2.setCallbackData("oltinEngId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Hotel Marvarid");
        button3.setCallbackData("marvaridEngId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Hotel Silk Road Namangan");
        button4.setCallbackData("silkroadnamanganEngId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Hotel Istiklol Namangan");
        button5.setCallbackData("istiklolnamanganEngId");
        row5.add(button5);
        rowList.add(row5);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage namanganRusBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("поиск");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Отель Шахристон");
        button.setCallbackData("shahristonRusId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Отель Навбахор");
        button1.setCallbackData("navbahorRusId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Отель Олтин");
        button2.setCallbackData("oltinRusId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Отель Марварид");
        button3.setCallbackData("marvaridRusId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Отель Шёлковый путь Намангaн");
        button4.setCallbackData("silkroadnamanganRusId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Отель Истиклол Намaнгaн");
        button5.setCallbackData("istiklolnamanganRusId");
        row5.add(button5);
        rowList.add(row5);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage namanganKrilBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Қидириш");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Хотел Шаҳристон");
        button.setCallbackData("shahristonKrilId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Хотел Навбахор");
        button1.setCallbackData("navbahorKrilId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Хотел Олтин");
        button2.setCallbackData("oltinKrilId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Хотел Марварид");
        button3.setCallbackData("marvaridKrilId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Хотел Ипак йўли Наманган");
        button4.setCallbackData("silkroadnamanganKrilId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Хотел Истиқлол Наманган");
        button5.setCallbackData("istiklolnamanganKrilId");
        row5.add(button5);
        rowList.add(row5);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }



//    XORAZM------------------------------------------------------------------------------------------------------------



    public SendMessage xorazmBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Qidirish");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Khiva Palace Hotel");
        button.setCallbackData("khivaPalaceId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Malika Khiva Hotel");
        button1.setCallbackData("malikaKhivaId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Orient Star Khiva");
        button2.setCallbackData("orientStarId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Asia Khiva Hotel");
        button3.setCallbackData("asiaKhivaId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Garden City Hotel");
        button4.setCallbackData("gardenCityId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Hotel Zarafshon");
        button5.setCallbackData("zarafshonId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Ichan Kala Hotel");
        button6.setCallbackData("ichanKalaId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Hotel Shovot");
        button7.setCallbackData("shovotId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Hotel Xiva City");
        button8.setCallbackData("khivaCityId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Royal Khiva Hotel");
        button9.setCallbackData("royalKhivaId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage xorazmEngBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Search");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Khiva Palace Hotel");
        button.setCallbackData("khivaPalaceEngId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Malika Khiva Hotel");
        button1.setCallbackData("malikaKhivaEngId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Orient Star Khiva");
        button2.setCallbackData("orientStarEngId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Asia Khiva Hotel");
        button3.setCallbackData("asiaKhivaEngId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Garden City Hotel");
        button4.setCallbackData("gardenCityEngId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Hotel Zarafshon");
        button5.setCallbackData("zarafshonEngId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Ichan Kala Hotel");
        button6.setCallbackData("ichanKalaEngId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Hotel Shovot");
        button7.setCallbackData("shovotEngId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Hotel Xiva City");
        button8.setCallbackData("khivaCityEngId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Royal Khiva Hotel");
        button9.setCallbackData("royalKhivaEngId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage xorazmRusBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("поиск");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Отель Хива Палас");
        button.setCallbackData("khivaPalaceRusId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Отель Малика Хива");
        button1.setCallbackData("malikaKhivaRusId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Отель Ориент Стар Хива");
        button2.setCallbackData("orientStarRusId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Отель Азия Хива");
        button3.setCallbackData("asiaKhivaRusId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Отель Гарден Сити");
        button4.setCallbackData("gardenCityRusId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Отель Зарафшон");
        button5.setCallbackData("zarafshonRusId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Отель Ичан Кала");
        button6.setCallbackData("ichanKalaRusId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Отель Шовот");
        button7.setCallbackData("shovotRusId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Отель Хива Сити");
        button8.setCallbackData("khivaCityRusId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Отель Роял Хива");
        button9.setCallbackData("royalKhivaRusId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage xorazmKrilBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Қидириш");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Хотел Хива Палас");
        button.setCallbackData("khivaPalaceKrilId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Хотел Малика Хива");
        button1.setCallbackData("malikaKhivaKrilId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Хотел Ориент Стар Хива");
        button2.setCallbackData("orientStarKrilId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Хотел Азия Хива");
        button3.setCallbackData("asiaKhivaKrilId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Хотел Гарден Сити");
        button4.setCallbackData("gardenCityKrilId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Хотел Зарафшон");
        button5.setCallbackData("zarafshonKrilId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Хотел Ичан Кала");
        button6.setCallbackData("ichanKalaKrilId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Хотел Шовот");
        button7.setCallbackData("shovotKrilId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Хотел Хива Сити");
        button8.setCallbackData("khivaCityKrilId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Хотел Роял Хива");
        button9.setCallbackData("royalKhivaKrilId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }



//    NAVOIY------------------------------------------------------------------------------------------------------------



    public SendMessage navoiyBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Qidirish");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Navoiy Palace Hotel");
        button.setCallbackData("navoiyPalaceId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Marvarid Navoiy Hotel");
        button1.setCallbackData("marvaridNavoiyId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Orient Star Navoiy");
        button2.setCallbackData("orientStarNavoiyId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Asia Navoiy Hotel");
        button3.setCallbackData("asiaNavoiyId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Garden City Navoiy");
        button4.setCallbackData("gardenCityNavoiyId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Hotel Zarafshon Navoiy");
        button5.setCallbackData("zarafshonNavoiyId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Ichan Kala Navoiy Hotel");
        button6.setCallbackData("ichanKalaNavoiyId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Hotel Navruz");
        button7.setCallbackData("navruzId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Hotel City Navoiy");
        button8.setCallbackData("navoiCityId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Royal Navoiy Hotel");
        button9.setCallbackData("royalNavoiyId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage navoiyEngBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Search");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Navoiy Palace Hotel");
        button.setCallbackData("navoiyPalaceEngId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Marvarid Navoiy Hotel");
        button1.setCallbackData("marvaridNavoiyEngId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Orient Star Navoiy");
        button2.setCallbackData("orientStarNavoiyEngId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Asia Navoiy Hotel");
        button3.setCallbackData("asiaNavoiyEngId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Garden City Navoiy");
        button4.setCallbackData("gardenCityNavoiyEngId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Hotel Zarafshon Navoiy");
        button5.setCallbackData("zarafshonNavoiyEngId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Ichan Kala Navoiy Hotel");
        button6.setCallbackData("ichanKalaNavoiyEngId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Hotel Navruz");
        button7.setCallbackData("navruzEngId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Hotel City Navoiy");
        button8.setCallbackData("navoiCityEngId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Royal Navoiy Hotel");
        button9.setCallbackData("royalNavoiyEngId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage navoiyRuschaBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Поиск");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Отель Navoiy Palace");
        button.setCallbackData("navoiyPalaceRusId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Отель Marvarid Navoiy");
        button1.setCallbackData("marvaridNavoiyRusId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Отель Orient Star Navoiy");
        button2.setCallbackData("orientStarNavoiyRusId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Отель Asia Navoiy");
        button3.setCallbackData("asiaNavoiyRusId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Garden City Navoiy");
        button4.setCallbackData("gardenCityNavoiyRusId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Отель Zarafshon Navoiy");
        button5.setCallbackData("zarafshonNavoiyRusId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Отель Ichan Kala Navoiy");
        button6.setCallbackData("ichanKalaNavoiyRusId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Отель Navruz");
        button7.setCallbackData("navruzRusId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Отель City Navoiy");
        button8.setCallbackData("navoiCityRusId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Royal Navoiy Hotel");
        button9.setCallbackData("royalNavoiyRusId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage navoiyKrilchaBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Қидириш");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Отель Navoiy Palace");
        button.setCallbackData("navoiyPalaceKrilId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Отель Marvarid Navoiy");
        button1.setCallbackData("marvaridNavoiyKrilId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Отель Orient Star Navoiy");
        button2.setCallbackData("orientStarNavoiyKrilId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Отель Asia Navoiy");
        button3.setCallbackData("asiaNavoiyKrilId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Garden City Navoiy");
        button4.setCallbackData("gardenCityNavoiyKrilId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Отель Zarafshon Navoiy");
        button5.setCallbackData("zarafshonNavoiyKrilId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Отель Ichan Kala Navoiy");
        button6.setCallbackData("ichanKalaNavoiyKrilId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Отель Navruz");
        button7.setCallbackData("navruzKrilId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Отель City Navoiy");
        button8.setCallbackData("navoiCityKrilId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Royal Navoiy Hotel");
        button9.setCallbackData("royalNavoiyKrilId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }



//    BUXORO------------------------------------------------------------------------------------------------------------



    public SendMessage buxoroBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Qidirish");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Buxoro Palace Hotel");
        button.setCallbackData("buxoroPalaceId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Amir Temur Hotel Buxoro");
        button1.setCallbackData("amirTemurBuxoroId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Hotel Asia Buxoro");
        button2.setCallbackData("asiaBuxoroId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Hotel Zarafshon Buxoro");
        button3.setCallbackData("zarafshonBuxoroId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Oasis Hotel Buxoro");
        button4.setCallbackData("oasisBuxoroId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Hotel Minor Buxoro");
        button5.setCallbackData("minorBuxoroId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Garden Hotel Buxoro");
        button6.setCallbackData("gardenBuxoroId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Hotel Orient Buxoro");
        button7.setCallbackData("orientBuxoroId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Royal Buxoro Hotel");
        button8.setCallbackData("royalBuxoroId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Bibikhanum Hotel Buxoro");
        button9.setCallbackData("bibikhanumBuxoroId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage buxoroRuschaBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Поиск");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Отель Buxoro Palace");
        button.setCallbackData("buxoroPalaceRusId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Отель Amir Temur Buxoro");
        button1.setCallbackData("amirTemurBuxoroRusId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Отель Asia Buxoro");
        button2.setCallbackData("asiaBuxoroRusId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Отель Zarafshon Buxoro");
        button3.setCallbackData("zarafshonBuxoroRusId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Отель Oasis Buxoro");
        button4.setCallbackData("oasisBuxoroRusId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Отель Minor Buxoro");
        button5.setCallbackData("minorBuxoroRusId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Отель Garden Buxoro");
        button6.setCallbackData("gardenBuxoroRusId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Отель Orient Buxoro");
        button7.setCallbackData("orientBuxoroRusId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Отель Royal Buxoro");
        button8.setCallbackData("royalBuxoroRusId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Отель Bibikhanum Buxoro");
        button9.setCallbackData("bibikhanumBuxoroRusId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage buxoroEngBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Search");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Buxoro Palace Hotel");
        button.setCallbackData("buxoroPalaceEngId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Amir Temur Hotel Buxoro");
        button1.setCallbackData("amirTemurBuxoroEngId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Hotel Asia Buxoro");
        button2.setCallbackData("asiaBuxoroEngId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Hotel Zarafshon Buxoro");
        button3.setCallbackData("zarafshonBuxoroEngId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Oasis Hotel Buxoro");
        button4.setCallbackData("oasisBuxoroEngId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Hotel Minor Buxoro");
        button5.setCallbackData("minorBuxoroEngId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Garden Hotel Buxoro");
        button6.setCallbackData("gardenBuxoroEngId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Hotel Orient Buxoro");
        button7.setCallbackData("orientBuxoroEngId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Royal Buxoro Hotel");
        button8.setCallbackData("royalBuxoroEngId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Bibikhanum Hotel Buxoro");
        button9.setCallbackData("bibikhanumBuxoroEngId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage buxoroKrilchaBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Қидириш");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Buxoro Palace Hotel");
        button.setCallbackData("buxoroPalaceKrilId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Amir Temur Hotel Buxoro");
        button1.setCallbackData("amirTemurBuxoroKrilId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Hotel Asia Buxoro");
        button2.setCallbackData("asiaBuxoroKrilId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Hotel Zarafshon Buxoro");
        button3.setCallbackData("zarafshonBuxoroKrilId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Oasis Hotel Buxoro");
        button4.setCallbackData("oasisBuxoroKrilId");
        row4.add(button4);
        rowList.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Hotel Minor Buxoro");
        button5.setCallbackData("minorBuxoroKrilId");
        row5.add(button5);
        rowList.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Garden Hotel Buxoro");
        button6.setCallbackData("gardenBuxoroKrilId");
        row6.add(button6);
        rowList.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Hotel Orient Buxoro");
        button7.setCallbackData("orientBuxoroKrilId");
        row7.add(button7);
        rowList.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Royal Buxoro Hotel");
        button8.setCallbackData("royalBuxoroKrilId");
        row8.add(button8);
        rowList.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Bibikhanum Hotel Buxoro");
        button9.setCallbackData("bibikhanumBuxoroKrilId");
        row9.add(button9);
        rowList.add(row9);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }



//    SURXANDARYO--------------------------------------------------------------------------------------------------------



    public SendMessage surxondaryoBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Qidirish");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Surxon Hotel");
        button.setCallbackData("surxonId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Grand Hotel Termez");
        button1.setCallbackData("grandTermezId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Asia Hotel");
        button2.setCallbackData("asiaId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Istiqlol Hotel");
        button3.setCallbackData("istiqlolId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Diyor Hotel");
        button4.setCallbackData("diyorId");
        row4.add(button4);
        rowList.add(row4);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage surxondaryoRuschaBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Поиск");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Отель Surxon");
        button.setCallbackData("surxonRusId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Гранд Отель Termez");
        button1.setCallbackData("grandTermezRusId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Отель Asia");
        button2.setCallbackData("asiaRusId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Отель Istiqlol");
        button3.setCallbackData("istiqlolRusId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Отель Diyor");
        button4.setCallbackData("diyorRusId");
        row4.add(button4);
        rowList.add(row4);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage surxondaryoEngBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Search");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Surxon Hotel");
        button.setCallbackData("surxonEngId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Grand Hotel Termez");
        button1.setCallbackData("grandTermezEngId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Asia Hotel");
        button2.setCallbackData("asiaEngId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Istiqlol Hotel");
        button3.setCallbackData("istiqlolEngId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Diyor Hotel");
        button4.setCallbackData("diyorEngId");
        row4.add(button4);
        rowList.add(row4);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage surxondaryoKrilchaBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Қидириш");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Surxon Hotel");
        button.setCallbackData("surxonKrilId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Grand Hotel Termez");
        button1.setCallbackData("grandTermezKrilId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Asia Hotel");
        button2.setCallbackData("asiaKrilId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Istiqlol Hotel");
        button3.setCallbackData("istiqlolKrilId");
        row3.add(button3);
        rowList.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Diyor Hotel");
        button4.setCallbackData("diyorKrilId");
        row4.add(button4);
        rowList.add(row4);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);

        return sendMessage;
    }
}



