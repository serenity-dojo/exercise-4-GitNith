package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {
    @Test
    public void creating_a_dog() {
        Dog rocky = new Dog("Rocky", "Bone", 5);
        Assert.assertEquals(rocky.getName(), "Fido");
        Assert.assertEquals(rocky.getFavoriteToy(), "Bone");
        Assert.assertEquals(rocky.getAge(), 5);
    }

    @Test
    public void creating_a_cat() {
        Dog rocky = new Dog("Lily", "Ball", 2);
        Assert.assertEquals("Lily",rocky.getName());
        Assert.assertEquals("Ball",rocky.getFavoriteToy(), "Ball");
        Assert.assertEquals(2,rocky.getAge());
    }

    @Test
    public void whenAnimalsPlay() {
        Pet fido = new Dog("Fido", "Bone", 5);
        Pet spot = new Cat("Spot", "String", 5);
        Pet hazel = new Hamster("Hazel", "Wheel", 1);

        Assert.assertEquals("plays with bone",fido.play());
        System.out.println(fido.name + fido.play());
        Assert.assertEquals("plays with string",spot.play());
        Assert.assertEquals("runs in wheel",hazel.play());
    }
}