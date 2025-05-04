package com.naveenjpanachinanickal.player_profile.repository;

import com.naveenjpanachinanickal.player_profile.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
