package com.yunusemre.clubMember.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClubsWithMembersDto {



    private int memberId;

    private String memberName;

    private String gender;


    private String email;


    private String department;


    private String position;

    private int clubId;

    private int eventId;



}
