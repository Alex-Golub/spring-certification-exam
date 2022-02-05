package com.spring.professional.exam.tutorial.module08.question02.service;

import com.spring.professional.exam.tutorial.module08.question02.ds.Guest;
import com.spring.professional.exam.tutorial.module08.question02.repository.GuestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GuestRegistrationService {

  private GuestRepository guestRepository;

  public Guest registerGuest(Guest guest) {
    if (guest.getId() != null) {
      throw new IllegalArgumentException(String.format("Guest [%s] already has ID assigned", guest));
    }

    return guestRepository.save(guest);
  }

  public List<Guest> listGuests() {
    return guestRepository.findAll();
  }
}
