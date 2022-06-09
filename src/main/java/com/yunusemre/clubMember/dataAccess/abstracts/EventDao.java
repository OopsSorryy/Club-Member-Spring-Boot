package com.yunusemre.clubMember.dataAccess.abstracts;

import com.yunusemre.clubMember.entities.concretes.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventDao extends JpaRepository<Event,Integer> {
    Event getByEventId(int eventId);

    Event getByEventName(String eventName);


}
