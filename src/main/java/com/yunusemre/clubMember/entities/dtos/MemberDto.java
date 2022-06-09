package com.yunusemre.clubMember.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {

    private int memberId;
    private String memberName;
    private String email;
    private String gender;
    private String department;
    private String position;
    private List<ClubsDto> clubs;
}

