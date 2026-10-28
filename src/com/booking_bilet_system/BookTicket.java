package com.booking_bilet_system;

public class BookTicket {
    private static final boolean[] AVAILABLESPOTS = new boolean[10];
    private int spot = -1;

    public void book(){
        if(spot > -1){
            System.out.println("Вы уже забронировали билет!");
            return;
        }

        for (int i = 0; i < AVAILABLESPOTS.length; i++){
            if(!AVAILABLESPOTS[i]){
                AVAILABLESPOTS[i] = true;
                spot = i;
                System.out.println("Вы забронировали билет номер: " + i);
                break;
            }
        }

        if(spot == -1){
            System.out.println("Мест нет");
        }
    }

    public void returnBilet(){
        if (spot != -1){
            AVAILABLESPOTS[spot] = false;
            System.out.println("Вы вернули билет номер: " + spot);
            spot = -1;
        }
        else{
            System.out.println("У вас нет биллета для возврата!");
        }
    }

    public int getSpot(){
        return spot;
    }
}
