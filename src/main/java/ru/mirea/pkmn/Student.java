package ru.mirea.pkmn;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student implements Serializable {
    public static final long serialVersionUID = 1L;
    String firstName;
    String surName;
    String patronicName;
    String group;
}