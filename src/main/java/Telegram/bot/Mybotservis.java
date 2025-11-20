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
}