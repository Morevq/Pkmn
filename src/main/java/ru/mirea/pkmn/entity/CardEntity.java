package ru.mirea.pkmn.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.type.SqlTypes;
import ru.mirea.pkmn.AttackSkill;
import ru.mirea.pkmn.SkillDeserializer;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "card")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardEntity {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column
    private String name;

    @Column(columnDefinition = "smallint")
    private short hp;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "evolves_from")
    private CardEntity evolvesFrom;

    @Column(name = "game_set")
    private String gameSet;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pokemon_owner")
    private StudentEntity pokemonOwner;

    @Column
    private String stage;

    @Column(name = "retreat_cost")
    private String retreatCost;

    @Column(name = "weakness_type")
    private String weaknessType;

    @Column(name = "resistance_type")
    private String resistanceType;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "attack_skills")
    @JsonDeserialize(using = SkillDeserializer.class)
    private List<AttackSkill> skills;

    @Column(name = "pokemon_type")
    private String pokemonType;

    @Column(name = "regulation_mark")
    private char regulationMark;

    @Column(name = "card_number")
    private String cardNumber;
}