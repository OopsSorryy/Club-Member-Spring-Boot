package com.yunusemre.clubMember.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDto {

    private String eventName;

    private String datetime;

    private int clubId;




}