package com.spring.professional.exam.tutorial.module08.question01.configuration;

import com.spring.professional.exam.tutorial.module08.question01.ds.Room;
import com.spring.professional.exam.tutorial.module08.question01.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@AllArgsConstructor
public class DefaultDataConfiguration {

  public static final String GREEN_ROOM = "Green Room";
  public static final String YELLOW_ROOM = "Yellow Room";
  public static final String BLUE_ROOM = "Blue Room";

  private RoomRepository roomRepository;

  @PostConstruct
  private void registerHotelRooms() {
    registerRoom(new Room(GREEN_ROOM, "A01"));
    registerRoom(new Room(YELLOW_ROOM, "A02"));
    registerRoom(new Room(BLUE_ROOM, "B01"));
  }

  private void registerRoom(Room room) {
    roomRepository.save(room);
  }
}
