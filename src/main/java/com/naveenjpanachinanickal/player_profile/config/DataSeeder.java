package com.naveenjpanachinanickal.player_profile.config;

import com.naveenjpanachinanickal.player_profile.entity.GameStats;
import com.naveenjpanachinanickal.player_profile.entity.Player;
import com.naveenjpanachinanickal.player_profile.repository.GameStatsRepository;
import com.naveenjpanachinanickal.player_profile.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor  // Lombok to generate constructor for fields with @Autowired
public class DataSeeder {

    private final PlayerRepository playerRepo;
    private final GameStatsRepository gameStatsRepo;

    @Bean
    public CommandLineRunner seedData() {
        return args -> {
            Player player = new Player(1L, "Lionel Messi", "PSG");
            playerRepo.save(player);

            GameStats stats = new GameStats(1L, 25, 10, 30, player);
            gameStatsRepo.save(stats);
        };
    }
}
