/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apuntesdejava.myRecipes;

import net.java.html.json.Model;
import net.java.html.json.Property;

/**
 *
 * @author dsilva
 */
@Model(targetId = "person", className = "Person",properties={
    @Property(name = "name",type=String.class),
    @Property(name = "age",type=int.class)
    
})
public class ViewModel {
    
}
