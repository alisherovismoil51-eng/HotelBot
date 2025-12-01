package Telegram.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {

    Mybotservis mybotservis = new Mybotservis();
    Telegram.bot.LOCATIO locatio = new Telegram.bot.LOCATIO();
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

        if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();

                Long chatId = callbackQuery.getMessage().getChatId();

                if (data.equals("ozbekchaId")) {
                    try {
                        execute(mybotservis.uzbekchaBosilsa(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }

                if (data.equals("РусскийId")) {
                    try {
                        execute(mybotservis.ruschaBosilsa(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }

                if (data.equals("englishId")) {
                    try {
                        execute(mybotservis.inglizchaBosilsa(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }

                if (data.equals("ЎзбекчаId")) {
                    try {
                        execute(mybotservis.krilchaBosilsa(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }





            if (data.equals("amirsoyId")) {
                try {
                    execute(locatio.amirsoyMountainResort(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (data.equals("amirsoy1Id")) {
                try {
                    execute(locatio.leChaletmalumot(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (data.equals("archazorId")) {
                try {
                    execute(locatio.archazorMountainResort(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (data.equals("bildirsoyId")) {
                try {
                    execute(locatio.beldersayHotelResort(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (data.equals("aziaId")) {
                try {
                    execute(locatio.aziaChimganHotel(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (data.equals("amirsoy2Id")) {
                try {
                    execute(locatio.amirsoyAppleDacha(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (data.equals("apacheId")) {
                try {
                    execute(locatio.apacheDamOlish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (data.equals("skyId")) {
                try {
                    execute(locatio.skyVillageChimgan(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (data.equals("nebesaId")) {
                try {
                    execute(locatio.nebesaGuestHouse(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (data.equals("panoramicId")) {
                try {
                    execute(locatio.panoramicHotel(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }



            if (data.equals("humoId")) {
                try {
                    execute(locatio.humoId(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            else if (data.equals("safarobodId")) {
                try {
                    execute(locatio.safarobodId(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            else if (data.equals("sadafId")) {
                try {
                    execute(locatio.sadafId(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            else if (data.equals("sayhunId")) {
                try {
                    execute(locatio.sayhunId(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            else if (data.equals("farovonId")) {
                try {
                    execute(locatio.farovonId(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            else if (data.equals("shohruxId")) {
                try {
                    execute(locatio.shohruxId(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            else if (data.equals("islombekId")) {
                try {
                    execute(locatio.islombekId(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            else if (data.equals("gulistonId")) {
                try {
                    execute(locatio.gulistonId(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            else if (data.equals("sarviId")) {
                try {
                    execute(locatio.sarviId(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            else if (data.equals("dunyoId")) {
                try {
                    execute(locatio.dunyoId(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
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

