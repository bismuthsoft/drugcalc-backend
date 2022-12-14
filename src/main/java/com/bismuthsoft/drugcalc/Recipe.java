package com.bismuthsoft.drugcalc;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Recipe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<RecipeIngredient> ingredients;

    @OneToMany(cascade = CascadeType.ALL)
    private List<RecipeContainer> containers;
}
