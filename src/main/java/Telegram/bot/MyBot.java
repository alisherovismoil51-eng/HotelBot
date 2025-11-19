package Telegram.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        Mybotservis mybotservis = new Mybotservis();


        if (update.hasMessage() && update.getMessage().hasText()) {
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();

            String firstName = update.getMessage().getChat().getFirstName();
            String lastName = update.getMessage().getChat().getLastName();

            System.out.println("Firstname  :  " + firstName + "\nLastname : " + lastName + "\nChatId : " + chatId + "\nText : " + text);

            if (text.equals("/start")) {
                try {
                    execute(mybotservis.startBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        }


        if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            if (callbackQuery.getMessage() != null) {
                Long chatId = callbackQuery.getMessage().getChatId();

                if (data.equals("ozbekchaId")) {
                    try {
                        execute(mybotservis.uzbekchaBosilsa(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            if (callbackQuery.getMessage() != null) {
                Long chatId = callbackQuery.getMessage().getChatId();

                if (data.equals("РусскийId")) {
                    try {
                        execute(mybotservis.ruschaBosilsa(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }


        if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            if (callbackQuery.getMessage() != null) {
                Long chatId = callbackQuery.getMessage().getChatId();

                if (data.equals("englishId")) {
                    try {
                        execute(mybotservis.inglizBosilsa(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            if (callbackQuery.getMessage() != null) {
                Long chatId = callbackQuery.getMessage().getChatId();

                if (data.equals("ЎзбекчаId")) {
                    try {
                        execute(mybotservis.krilchaBosilsa(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }





    @Override
    public String getBotUsername() {
        return "@GrandImperial_hotelbot";
    }

    @Override
    public String getBotToken() {
        return "8552114504:AAGWPdO_ov08T7osat1pjAu4s-Cx5SYQnD4";
    }
}
