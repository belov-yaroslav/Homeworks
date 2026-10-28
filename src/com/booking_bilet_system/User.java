package com.booking_bilet_system;

public class User extends BookingSystem{
    private int spot = -1;

    public void book(){
        if(spot > -1){
            System.out.println("Вы уже забронировали билет!");
            return;
        }

        for (int i = 0; i < availableSpots.length; i++){
            if(!availableSpots[i]){
                availableSpots[i] = true;
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
            availableSpots[spot] = false;
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
