package com.yunusemre.clubMember.dataAccess.abstracts;

import com.yunusemre.clubMember.entities.concretes.Clubs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubsDao extends JpaRepository<Clubs,Integer> {
    Clubs getByClubId(int clubId);
    Clubs getByClubName(String clubName);


}