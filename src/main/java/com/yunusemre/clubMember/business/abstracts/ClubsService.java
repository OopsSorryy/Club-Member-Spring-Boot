package com.yunusemre.clubMember.business.abstracts;




import com.yunusemre.clubMember.core.utilities.results.DataResult;
import com.yunusemre.clubMember.core.utilities.results.Result;
import com.yunusemre.clubMember.entities.concretes.Clubs;
import com.yunusemre.clubMember.entities.dtos.ClubsDto;

import java.util.List;

public interface ClubsService {
    DataResult<List<Clubs>> getAll();
    DataResult<Clubs> getByClubId(int clubId);
    Result enrolledMember(int memberId, int clubId);
//    Result UnenrolledMember(int memberId,int clubId);



//    Result add(int memberId,int clubId);
    Result add(ClubsDto clubsAddDto);
    Result update(Clubs clubs);
    Result delete(int clubId);
}
