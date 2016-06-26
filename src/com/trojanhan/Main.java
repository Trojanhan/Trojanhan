package com.trojanhan;

import java.util.Objects;

public class Main {

    public String result;

    public static void main(String[] args) {
        // Test for energy unit
        Main instance = new Main();

        for (EnergyUnit unit : EnergyUnit.values()) {
            instance.result = "";
            instance.testConversion(unit);

            System.out.print(unit + " Test results: ");

            if (instance.result.isEmpty()) {
                System.out.println("Ok! ");
            } else {
                System.out.println(instance.result);
            }
        }
    }

    private void testConversion(EnergyUnit unit) {

        switch (unit) {
            case CALORIE:
                int calories = 1000000; // Calories is:
                assertEquals(1000000, // Calories
                        (int) EnergyUnit.CALORIE.toCalorie(calories));
                assertEquals(1000,    // KiloCalories
                        (int) EnergyUnit.CALORIE.toKiloCalorie(calories));
                assertEquals(4184000, // Joules
                        (int) EnergyUnit.CALORIE.toJoule(calories));
                assertEquals(4184,    // KiloJoules
                        (int) EnergyUnit.CALORIE.toKiloJoule(calories));
            case KILOCALORIE:
                int kiloCalories = 2000; // KiloCalories is:
                assertEquals(2000,    // KiloCalories
                        (int) EnergyUnit.KILOCALORIE.toKiloCalorie(kiloCalories));
                assertEquals(2000000, // Calories
                        (int) EnergyUnit.KILOCALORIE.toCalorie(kiloCalories));
                assertEquals(8368000, // Joules
                        (int) EnergyUnit.KILOCALORIE.toJoule(kiloCalories));
                assertEquals(8368,    // KiloJoules
                        (int) EnergyUnit.KILOCALORIE.toKiloJoule(kiloCalories));
            case JOULE:
                int joules = 8368000; // Joules is:
                assertEquals(8368000, // Joules
                        (int) EnergyUnit.JOULE.toJoule(joules));
                assertEquals(8368,    // KiloJoules
                        (int) EnergyUnit.JOULE.toKiloJoule(joules));
                assertEquals(2000000, // Calories
                        (int) EnergyUnit.JOULE.toCalorie(joules));
                assertEquals(2000,    // KiloCalories
                        (int) EnergyUnit.JOULE.toKiloCalorie(joules));
            case KILOJOULE:
                int kiloJoules = 4184; // KiloJoules is:
                assertEquals(4184000, // Joules
                        (int) EnergyUnit.KILOJOULE.toJoule(kiloJoules));
                assertEquals(4184,    // KiloJoules
                        (int) EnergyUnit.KILOJOULE.toKiloJoule(kiloJoules));
                assertEquals(1000000, // Calories
                        (int) EnergyUnit.KILOJOULE.toCalorie(kiloJoules));
                assertEquals(1000,    // KiloCalories
                        (int) EnergyUnit.KILOJOULE.toKiloCalorie(kiloJoules));
            default:
                assertTrue(unit.toString() + " has no test!", false);
        }
    }

    private void assertEquals(int expected, int actual) {
        if (expected != actual) {
            result += "\n Error! expected = " + expected + ", actual = " + actual;
        }
    }

    private void assertTrue(String message, boolean bool) {
        if (!bool) {
            result += "\n" + message;
        }
    }
}