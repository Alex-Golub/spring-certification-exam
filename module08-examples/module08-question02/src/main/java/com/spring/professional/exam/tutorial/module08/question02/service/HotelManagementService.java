package com.spring.professional.exam.tutorial.module08.question02.service;

import com.spring.professional.exam.tutorial.module08.question02.ds.Room;
import com.spring.professional.exam.tutorial.module08.question02.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@AllArgsConstructor
public class HotelManagementService {

  private RoomRepository roomRepository;

  public void registerRoom(Room room) {
    roomRepository.save(room);
  }

  public Set<Room> listRooms() {
    return roomRepository.findAll();
  }
}
