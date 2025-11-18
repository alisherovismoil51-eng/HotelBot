package Telegram.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MyBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {

            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();

            String firstName = update.getMessage().getChat().getFirstName();
            String lastName = update.getMessage().getChat().getLastName();

            System.out.println("Firstname  :  " + firstName +
                    "\nLastname : " + lastName +
                    "\nChatId : " + chatId +
                    "\nText : " + text);
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
