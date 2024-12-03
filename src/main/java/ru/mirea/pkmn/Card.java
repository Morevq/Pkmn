package ru.mirea.pkmn;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Card implements Serializable {
    public static final long serialVersionUID = 1L;
    PokemonStage pokemonStage;
    String name;
    int hp;
    EnergyType pokemonType;
    Card evolvesFrom;
    List<AttackSkill> skills;
    EnergyType weaknessType;
    EnergyType resistanceType;
    String retreatCost;
    String gameSet;
    char regulationMark;
    Student pokemonOwner;
    String number;
}
