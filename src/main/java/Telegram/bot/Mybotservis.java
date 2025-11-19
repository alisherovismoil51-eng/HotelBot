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
        button.setText("Русский");
        button.setCallbackData("РусскийId");
        row.add(button);
        rowList.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("O'zbekcha");
        button1.setCallbackData("ozbekchaId");
        row1.add(button1);
        rowList.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Ўзбекча");
        button2.setCallbackData("ЎзбекчаId");
        row2.add(button2);
        rowList.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("English");
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
        sendMessage.setText("Ushbu Bot mehmonhona izlashda yordam beradi");

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



    public SendMessage ruschaBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Ushbu Bot mehmonhona izlashda yordam beradi");

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

    public SendMessage inglizBosilsa(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Ushbu Bot mehmonhona izlashda yordam beradi");

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
}