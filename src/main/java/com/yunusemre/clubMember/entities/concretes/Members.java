package com.yunusemre.clubMember.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "members")

public class Members {

    @Id
    @Column(name = "members_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId;

    @Column(name = "member_name")
    private String memberName;

    @Column(name = "gender")
    private String gender;



    @Column(name = "email")
    private String email;

    @Column(name = "department")
    private String department;

    @Column(name = "position")
    private String position;


    @JsonIgnore
    @ManyToMany(mappedBy = "members",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Clubs> clubs;

    @JsonIgnore
    @ManyToMany(mappedBy = "members",cascade = CascadeType.ALL)
    private List<Event> events;




}
