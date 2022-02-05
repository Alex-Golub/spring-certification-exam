package com.spring.professional.exam.tutorial.module08.question02.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class GuestSharableDataService {

  private GuestRegistrationService guestRegistrationService;

  public String getGuestSharableData() {
    return guestRegistrationService.listGuests().stream()
                                   .map(guest -> String.join(" ", guest.getFirstName(), guest.getLastName()))
                                   .collect(Collectors.joining(", "));
  }
}
