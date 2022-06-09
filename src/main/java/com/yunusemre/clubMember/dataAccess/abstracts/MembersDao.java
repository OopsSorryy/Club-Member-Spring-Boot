package com.yunusemre.clubMember.dataAccess.abstracts;

import com.yunusemre.clubMember.entities.concretes.Members;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MembersDao extends JpaRepository<Members,Integer> {
    Members getByMemberId(int memberId);

    Members getByMemberName(String memberName);


    List<Members> getByClubsIn(List<Integer> clubs);

    List<Members> getByMemberNameContains(String memberName);

    List<Members> getByMemberNameStartsWith(String memberName);
}