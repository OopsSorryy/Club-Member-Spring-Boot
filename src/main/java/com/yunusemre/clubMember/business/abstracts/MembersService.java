package com.yunusemre.clubMember.business.abstracts;



import com.yunusemre.clubMember.core.utilities.results.DataResult;
import com.yunusemre.clubMember.core.utilities.results.Result;
import com.yunusemre.clubMember.entities.concretes.Members;
import com.yunusemre.clubMember.entities.dtos.MemberDto;

import java.util.List;

public interface MembersService {
    DataResult<List<Members>> getAll();

    Result add(MemberDto memberDto);
    Result update(Members members);
    Result delete(Members members);

    DataResult<Members> getByMemberId(int memberId);
    DataResult<Members> getByMemberName(String memberName);



    DataResult<List<Members>> getByClubIdIn(List<Integer> clubs);

    DataResult<List<Members>> getByMemberNameContains(String memberName);

    DataResult<List<Members>> getByMemberNameStartsWith(String memberName);


}
