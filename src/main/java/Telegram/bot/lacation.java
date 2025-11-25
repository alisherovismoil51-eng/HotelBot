package Telegram.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {

                myBotService = new MyBotService();
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()){

            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();

            if (text.equals("/start")){
                try {
                    execute(myBotService.kirish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("/location")){
                try {
                    execute(myBotService.sendLocation(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("location")){
                try {
                    execute(myBotService.shareLocation(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


        }

    }

    @Override
    public String getBotUsername() {
        return "@GrandImperial_hotelbot";;
    }

    @Override
    public String getBotToken() {
        return "8552114504:AAGWPdO_ov08T7osat1pjAu4s-Cx5SYQnD4";
    }
}
