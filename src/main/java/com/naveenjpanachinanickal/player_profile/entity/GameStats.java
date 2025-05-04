package com.naveenjpanachinanickal.player_profile.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GameStats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate the ID
    private Long id;

    private int goals;
    private int assists;
    private int matchesPlayed;

    @ManyToOne
    private Player player; // Many-to-one relationship with Player
}
