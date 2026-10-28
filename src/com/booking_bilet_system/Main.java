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
        BookTicket user1 = new BookTicket();
        BookTicket user2 = new BookTicket();
        BookTicket user3 = new BookTicket();
        BookTicket user4 = new BookTicket();
        BookTicket user5 = new BookTicket();
        BookTicket user6 = new BookTicket();
        BookTicket user7 = new BookTicket();
        BookTicket user8 = new BookTicket();
        BookTicket user9 = new BookTicket();
        BookTicket user10 = new BookTicket();
        BookTicket user11 = new BookTicket();
        user1.book();
        user2.book();
        user3.book();
        user4.book();
        user5.book();
        user6.book();
        user7.book();
        user8.book();
        user9.book();
        user10.book();
        user11.book();
        user3.returnBilet();
        user11.book();

    }
}
