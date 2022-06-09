package com.yunusemre.clubMember.business.abstracts;


import com.yunusemre.clubMember.core.utilities.results.DataResult;
import com.yunusemre.clubMember.core.utilities.results.Result;
import com.yunusemre.clubMember.entities.concretes.Event;
import com.yunusemre.clubMember.entities.dtos.EventDto;

import java.util.List;

public interface EventService {

    DataResult<List<Event>> getAll();
    Result eventEnrolledMember(int memberId, int eventId);

    Result enrolledClub(int eventId,int clubId);


    Result add(EventDto eventDto);
    Result update(Event event);
    Result delete(Event event);
}
