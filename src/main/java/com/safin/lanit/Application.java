package com.safin.lanit;

import com.safin.lanit.model.Kotik;

public class Application {
  public static void main(String[] args) {
    Kotik firstKotik = new Kotik(10, 5, 3, "Pushok", "Meow");
    Kotik secondKotik = new Kotik();
    secondKotik.setKotik(10, "Murzik", 5, "meow");
    firstKotik.liveAnotherDay();
    System.out.println(firstKotik.getName());
    System.out.println(firstKotik.getWeight());
    System.out.println(firstKotik.equals(secondKotik));
    System.out.println(Kotik.getQuantityOfKotiks());
  }
}
