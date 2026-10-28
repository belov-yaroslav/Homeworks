package com.booking_bilet_system;

//Условие
//
//Реализовать систему бронирования билетов на концерт.
//
//У концерта имеется ограниченное количество мест. Пользователь может забронировать билет, если остались свободные места.
//
//Необходимо предусмотреть:
//- Хранение количества свободных мест.
//- Бронирование билета.
//- Отмену бронирования.
//- Запрет бронирования сверх доступного количества.



public class Main {
    public static void main(String[] args) {
        User User1 = new User();
        User User2 = new User();
        User User3 = new User();
        User User4 = new User();
        User User5 = new User();
        User User6 = new User();
        User User7 = new User();
        User User8 = new User();
        User User9 = new User();
        User User10 = new User();
        User User11 = new User();
        User1.book();
        User2.book();
        User3.book();
        User4.book();
        User5.book();
        User6.book();
        User7.book();
        User8.book();
        User9.book();
        User10.book();
        User11.book();
        User3.returnBilet();
        User11.book();

    }
}
