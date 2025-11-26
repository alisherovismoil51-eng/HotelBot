package Bahrom;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {

    Mybotservis mybotservis = new Mybotservis();
    LOCATIO locatio = new LOCATIO();
    @Override
    public void onUpdateReceived(Update update) {



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


            if (text.equals("Toshkent viloyati")) {
                try {
                    execute(mybotservis.ToshkenBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("Tashkent region")) {
                try {
                    execute(mybotservis.inglizchatoshkenBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("Ташкентская область")) {
                try {
                    execute(mybotservis.ruschaToshkenBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Тошкент вилояти")) {
                try {
                    execute(mybotservis.krilchaToshkenBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Sirdaryo viloyati")) {
                try {
                    execute(mybotservis.sirdaryoBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Jizzax viloyati")) {
                try {
                    execute(mybotservis.jizzaxBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("Samarqand viloyati")) {
                try {
                    execute(mybotservis.samarqandBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }



            if (text.equals("Qashqadaryo viloyati")) {
                try {
                    execute(mybotservis.qashqadaryoBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Andijon viloyati")) {
                try {
                    execute(mybotservis.andijonBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Andijon region")) {
                try {
                    execute(mybotservis.andijonEngBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }



            if (text.equals("Андижанская область")) {
                try {
                    execute(mybotservis.andijonRusBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Андижон вилояти")) {
                try {
                    execute(mybotservis.andijonKrilBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("Farg‘ona viloyati")) {
                try {
                    execute(mybotservis.fargonaBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("Farg‘ona region")) {
                try {
                    execute(mybotservis.fargonaEngBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("Ферганская область")) {
                try {
                    execute(mybotservis.fargonaRusBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("Фарғона вилояти")) {
                try {
                    execute(mybotservis.fargonaKrilBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("Namangan viloyati")) {
                try {
                    execute(mybotservis.namanganBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("Namangan region")) {
                try {
                    execute(mybotservis.namanganEngBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("Наманганская область")) {
                try {
                    execute(mybotservis.namanganRusBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("Наманган вилояти")) {
                try {
                    execute(mybotservis.namanganKrilBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("Xorazm viloyati")) {
                try {
                    execute(mybotservis.xorazmBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("Xorazm region")) {
                try {
                    execute(mybotservis.xorazmEngBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Хорезмская область")) {
                try {
                    execute(mybotservis.xorazmRusBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Хоразм вилояти")) {
                try {
                    execute(mybotservis.xorazmKrilBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Navoiy viloyati")) {
                try {
                    execute(mybotservis.navoiyBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Navoiy region")) {
                try {
                    execute(mybotservis.navoiyEngBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Навоийская область")) {
                try {
                    execute(mybotservis.navoiyRuschaBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Навоий вилояти")) {
                try {
                    execute(mybotservis.navoiyKrilchaBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("Buxoro viloyati")) {
                try {
                    execute(mybotservis.buxoroBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("Бухарская область")) {
                try {
                    execute(mybotservis.buxoroRuschaBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Buxoro region")) {
                try {
                    execute(mybotservis.buxoroEngBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Бухоро вилояти")) {
                try {
                    execute(mybotservis.buxoroKrilchaBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Surxondaryo viloyati")) {
                try {
                    execute(mybotservis.surxondaryoBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Сурхандарьинская область")) {
                try {
                    execute(mybotservis.surxondaryoRuschaBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Surxondaryo region")) {
                try {
                    execute(mybotservis.surxondaryoEngBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Сурхондарё вилояти")) {
                try {
                    execute(mybotservis.surxondaryoKrilchaBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Қашқадарё вилояти")) {
                try {
                    execute(mybotservis.qashqadaryoRuschaBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Qashqadaryo region")) {
                try {
                    execute(mybotservis.qashqadaryoEngBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Қашқадарё вилояти")) {
                try {
                    execute(mybotservis.qashqadaryoKrilchaBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Самаркандская область")) {
                try {
                    execute(mybotservis.samarqandRuschaBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Samarqand region")) {
                try {
                    execute(mybotservis.samarqandEngBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Самарқанд вилояти")) {
                try {
                    execute(mybotservis.samarqandKrilchaBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Джизакская область")) {
                try {
                    execute(mybotservis.jizzaxRuschaBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Jizzax region")) {
                try {
                    execute(mybotservis.jizzaxEngBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Жиззах вилояти")) {
                try {
                    execute(mybotservis.jizzaxEngBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Сырдарьинская область")) {
                try {
                    execute(mybotservis.sirdaryoRuschaBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Sirdaryo region")) {
                try {
                    execute(mybotservis.sirdaryoEngBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Сирдарё вилояти")) {
                try {
                    execute(mybotservis.sirdaryoKrilchaBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Сирдарё вилояти")) {
                try {
                    execute(mybotservis.sirdaryoKrilchaBosilsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }












        }


        // MyBot.java ichida:

        if (update.hasCallbackQuery()) {
            String data = update.getCallbackQuery().getData();
            Long chatId = update.getCallbackQuery().getMessage().getChatId();

            if (data.equals("ozbekchaId")) {
                // "uz" kodini berib yuboramiz
                execute1(mybotservis.viloyatlarBosilsa(chatId, "uz"));
            }
            else if (data.equals("englishId")) {
                // "en" kodini berib yuboramiz
                execute1(mybotservis.viloyatlarBosilsa(chatId, "en"));
            }
            else if (data.equals("РусскийId")) {
                // "ru" kodini berib yuboramiz
                execute1(mybotservis.viloyatlarBosilsa(chatId, "ru"));
            }
            else if (data.equals("ЎзбекчаId")) { // Kirillcha
                // "uz_cyr" kodini berib yuboramiz
                execute1(mybotservis.viloyatlarBosilsa(chatId, "uz_cyr"));
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
                        execute(mybotservis.inglizchaBosilsa(chatId));
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


    // Bu metodni MyBot classining ichiga, eng pastiga joylashtiring
    public void execute1(SendMessage sendMessage) {
        try {
            // "super" bu TelegramLongPollingBot ning o'zining metodi
            super.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace(); // Xatolik bo'lsa konsolga chiqaradi
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

    public void sendMessage(Long chatId, String text) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText(text);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


}

