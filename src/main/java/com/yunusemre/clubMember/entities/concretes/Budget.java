package com.yunusemre.clubMember.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "budget")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Budget {

    @Id
    @Column(name = "budget_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int budgetId;

    @Column(name = "amount")
    private String amount;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "club_id")
    private Clubs clubs;




}