package com.yunusemre.clubMember.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "clubs")

@JsonIgnoreProperties({"hibernateLazyInitializer","handler","budget"})
public class Clubs {

    @Id
    @Column(name = "club_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clubId;

    @Column(name = "club_name")
    private String clubName;

    @OneToOne(mappedBy = "clubs")
    private Budget budget;


    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(
            name = "club_member",
            joinColumns = @JoinColumn(name = "club_id"),
            inverseJoinColumns = @JoinColumn(name = "member_id"))
    private List<Members> members;


    @OneToMany(mappedBy = "clubs",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Event> events;

    public void enrollMembers(Members member){
        members.add(member);
    }

}
