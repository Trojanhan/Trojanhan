package com.trojanhan;

/**
 * Units of energy
 * Created by Oleksandr Dolyna on 26.06.2016.
 */
public enum EnergyUnit {
    CALORIE {
        @Override
        public float toCalorie(float calories) {
            return calories;
        }

        @Override
        public float toKiloCalorie(float calories) {
            return calories / 1000;
        }

        @Override
        public float toJoule(float calories) {
            return calories * 4.184F;
        }

        @Override
        public float toKiloJoule(float calories) {
            return toJoule(calories) / 1000;
        }
    },
    KILOCALORIE {
        @Override
        public float toCalorie(float kiloCalories) {
            return kiloCalories * 1000;
        }

        @Override
        public float toKiloCalorie(float kiloCalories) {
            return kiloCalories;
        }

        @Override
        public float toJoule(float kiloCalories) {
            return CALORIE.toJoule(toCalorie(kiloCalories));
        }

        @Override
        public float toKiloJoule(float kiloCalories) {
            return toJoule(kiloCalories) / 1000;
        }
    },
    JOULE {
        @Override
        public float toCalorie(float joule) {
            return joule / CALORIE.toJoule(1);
        }

        @Override
        public float toKiloCalorie(float joule) {
            return toCalorie(joule) / 1000;
        }

        @Override
        public float toJoule(float joule) {
            return joule;
        }

        @Override
        public float toKiloJoule(float joule) {
            return joule / 1000;
        }
    },
    KILOJOULE {
        @Override
        public float toCalorie(float kiloJoule) {
            return JOULE.toCalorie(toJoule(kiloJoule));
        }

        @Override
        public float toKiloCalorie(float kiloJoule) {
            return toCalorie(kiloJoule) / 1000;
        }

        @Override
        public float toJoule(float kiloJoule) {
            return kiloJoule * 1000;
        }

        @Override
        public float toKiloJoule(float kiloJoule) {
            return kiloJoule;
        }
    };

    public float toCalorie(float quantity) {
        throw new AbstractMethodError();
    }

    public float toKiloCalorie(float quantity) {
        throw new AbstractMethodError();
    }

    public float toJoule(float quantity) {
        throw new AbstractMethodError();
    }

    public float toKiloJoule(float quantity) {
        throw new AbstractMethodError();
    }
}
