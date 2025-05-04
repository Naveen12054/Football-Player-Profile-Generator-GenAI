package com.naveenjpanachinanickal.player_profile.repository;

import com.naveenjpanachinanickal.player_profile.entity.GameStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameStatsRepository extends JpaRepository<GameStats, Long> {
}