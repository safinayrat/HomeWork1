package com.safin.lanit.model;

import java.util.Objects;

public class Kotik {
  private static int quantityOfKotiks;
  private int prettiness;
  private int weight;
  private int satiety;
  private String name = "Kotik";
  private String meow = "meow";

  public Kotik() {
    quantityOfKotiks++;
  }

  public Kotik(int prettiness, int weight, int satiety, String name, String meow) {
    this.prettiness = prettiness;
    this.weight = weight;
    this.satiety = satiety;
    this.name = name;
    this.meow = meow.toLowerCase();
    quantityOfKotiks++;
  }

  public void setKotik(int prettiness, String name, int weight, String meow) {
    this.prettiness = prettiness;
    this.name = name;
    this.weight = weight;
    this.meow = meow.toLowerCase();
  }

  public void eat(int satiety) {
    this.satiety += satiety;
  }

  public void eat(int satiety, String foodName) {
    this.satiety += satiety;
  }

  public void eat() {
    eat(5, "Whiskas");
  }

  public boolean play() {
    if (isTheCatFull()) {
      System.out.println("Kotik is playing");
      satiety--;
      return true;
    }
    System.out.println("Kotik will not play, he is hungry. Please feed the kotik first");
    return false;
  }

  public boolean chaseMouse() {
    if (isTheCatFull()) {
      System.out.println("Kotik is chases mouse");
      satiety--;
      return true;
    }
    System.out.println("Kotik will not chases mouse, he is hungry. Please feed the kotik first");
    return false;
  }

  public boolean meow() {
    if (isTheCatFull()) {
      System.out.println("Kotik is saying 'meow'");
      satiety--;
      return true;
    }
    System.out.println("Kotik will not meow, he is hungry. Please feed the kotik first");
    return false;
  }

  public boolean sleep() {
    if (isTheCatFull()) {
      System.out.println("Kotik is sleeping");
      satiety--;
      return true;
    }
    System.out.println("Kotik will not sleep, he is hungry. Please feed the kotik first");
    return false;
  }

  public boolean purr() {
    if (isTheCatFull()) {
      System.out.println("Kotik is purr");
      satiety--;
      return true;
    }
    System.out.println("Kotik will not purr, he is hungry. Please feed the kotik first");
    return false;
  }

  private boolean isTheCatFull() {
    return getSatiety() > 0;
  }

  public static int getQuantityOfKotiks() {
    return quantityOfKotiks;
  }

  public int getPrettiness() {
    return prettiness;
  }

  public int getWeight() {
    return weight;
  }

  public int getSatiety() {
    return satiety;
  }

  public String getName() {
    return name;
  }

  public String getMeow() {
    return meow;
  }

  public void liveAnotherDay() {
    for (int i = 0; i < 24; i++) {
      int random = 1 + (int) (Math.random() * 6);
      if (random == 1) {
        if (!play()) {
          eat(1);
        }
      } else if (random == 2) {
        eat();
      } else if (random == 3) {
        if (!sleep()) {
          eat(1);
        }
      } else if (random == 4) {
        if (!chaseMouse()) {
          eat(1);
        }
      } else if (random == 5) {
        if (!purr()) {
          eat(1);
        }
      } else if (random == 6) {
        if (!meow()) {
          eat(1);
        }
      }
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Kotik kotik = (Kotik) o;
    return meow.equals(kotik.meow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meow);
  }
}
