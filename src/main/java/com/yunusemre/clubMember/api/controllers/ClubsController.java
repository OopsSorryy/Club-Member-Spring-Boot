package com.yunusemre.clubMember.api.controllers;


import com.yunusemre.clubMember.business.abstracts.ClubsService;
import com.yunusemre.clubMember.business.abstracts.MembersService;
import com.yunusemre.clubMember.core.utilities.results.DataResult;
import com.yunusemre.clubMember.core.utilities.results.Result;
import com.yunusemre.clubMember.entities.concretes.Clubs;
import com.yunusemre.clubMember.entities.dtos.ClubsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/clubs")
@CrossOrigin(origins = "*")
public class ClubsController {

    private ClubsService clubsService;
    private MembersService membersService;

    @Autowired
    public ClubsController(ClubsService clubsService) {
        this.clubsService = clubsService;
    }

    @GetMapping("/getall")
    public DataResult<List<Clubs>> getAll() {
        return this.clubsService.getAll();
    }

    @GetMapping("/getByClubId")
    public DataResult<Clubs> getByClubId(@RequestParam int clubId) {
        return this.clubsService.getByClubId(clubId);
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody ClubsDto club) {
        Result res = this.clubsService.add(club);
        if (res.isSuccess()) return ResponseEntity.status(HttpStatus.CREATED).body(res);
        return ResponseEntity.badRequest().body(res);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestParam int clubId) {
        return this.clubsService.delete(clubId);

    }

    @PostMapping("/update")
    public Result update(@RequestBody Clubs clubs) {
        return this.clubsService.update(clubs);

    }

    @PatchMapping("/{clubId}/members/{memberId}")
    public ResponseEntity<?> enrolledMemberstoClub(@RequestParam int clubId, @RequestParam int memberId){
        Result res= this.clubsService.enrolledMember(clubId,memberId);
        if (res.isSuccess()) return ResponseEntity.status(HttpStatus.CREATED).body(res);
        return ResponseEntity.badRequest().body(res);
    }
}
