package com.spring.professional.exam.tutorial.module08.question01.service;

import com.google.common.collect.Sets;
import com.spring.professional.exam.tutorial.module08.question01.ds.Guest;
import com.spring.professional.exam.tutorial.module08.question01.ds.Reservation;
import com.spring.professional.exam.tutorial.module08.question01.ds.Room;
import com.spring.professional.exam.tutorial.module08.question01.repository.ReservationRepository;
import com.spring.professional.exam.tutorial.module08.question01.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BookingService {

  private ReservationRepository reservationRepository;
  private RoomRepository roomRepository;

  public Optional<Room> findAvailableRoom(LocalDate date) {
    Set<Room> allRooms = roomRepository.findAll();
    Set<Reservation> reservationsOnDate = reservationRepository.findAllByReservationDate(date);

    Set<Room> roomsReservedAtDate = reservationsOnDate.stream()
                                                      .map(Reservation::getRoom)
                                                      .collect(Collectors.toSet());

    Set<Room> roomsAvailableAtDate = Sets.difference(allRooms, roomsReservedAtDate)
                                         .immutableCopy();

    return roomsAvailableAtDate.stream()
                               .findAny();
  }

  public Optional<Reservation> bookRoom(String roomName, Guest guest, LocalDate date) {
    return bookRoom(roomRepository.findByName(roomName).orElseThrow(), guest, date);
  }

  public Optional<Reservation> bookRoom(Room room, Guest guest, LocalDate date) {
    return isRoomAvailableAtDate(room, date) ?
            Optional.of(reservationRepository.save(new Reservation(room, guest, date))) :
            Optional.empty();
  }

  private boolean isRoomAvailableAtDate(Room room, LocalDate date) {
    return !reservationRepository.existsByRoomAndReservationDate(room, date);
  }
}
