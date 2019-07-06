package com.dsimon;

//class Movie {
//    private String name;
//
//    public Movie(String name) {
//        this.name = name;
//    }
//
//    public String plot() {
//        return "No plot here";
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//class Jaws extends Movie {
//    public Jaws() {
//        super("Jaws");
//    }
//
//    @Override
//    public String plot() {
//        return "A shark eats lots of people";
//    }
//}
//
//class IndependenceDay extends Movie {
//    public IndependenceDay() {
//        super("Independence Day");
//    }
//
//    @Override
//    public String plot() {
//        return "Aliens attempt to take over the Earth";
//    }
//}
//
//class MazeRunner extends Movie {
//    public MazeRunner() {
//        super("Maze Runner");
//    }
//
//    @Override
//    public String plot() {
//        return "Kids try and escape a maze";
//    }
//}
//
//class StarWars extends Movie {
//    public StarWars() {
//        super("Star Wars");
//    }
//
//    @Override
//    public String plot() {
//        return "Imperial forces try to take over the universe";
//    }
//}
//
//class ForgettableMovie extends Movie {
//    public ForgettableMovie() {
//        super("Forgettable");
//    }
//}

class Car {
    private int horsepower;
    private int cylinders;
    private int wheels;

    public Car(int horsepower, int cylinders) {
        this.horsepower = horsepower;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

    public void accelerate() {
        System.out.println("Accelerating");
    }

    public void brake() {
        System.out.println("Braking");
    }
}

class DumpTruck extends Car {
    public DumpTruck() {
        super(1000, 10);
    }

    @Override
    public void startEngine() {
        System.out.println("CHUG CHUG");
    }

    @Override
    public void accelerate() {
        System.out.println("CHUG CHUG CHUG CHUG");
    }

    @Override
    public void brake() {
        System.out.println("Screeeech");
    }
}

class RegularCar extends Car {
    public RegularCar() {
        super(100, 4);
    }

    @Override
    public void startEngine() {
        System.out.println("chuchcuhuhhh vroooo");
    }

    @Override
    public void accelerate() {
        System.out.println("Vrooooom");
    }

    @Override
    public void brake() {
        System.out.println("Scree");
    }
}

class RaceCar extends Car {
    public RaceCar() {
        super(10000000, 10000);
    }

    @Override
    public void startEngine() {
        System.out.println("REVVVVVVVV");
    }

    @Override
    public void accelerate() {
        System.out.println("VROOOOOOOMMMM VROOOOOMMM");
    }

    @Override
    public void brake() {
        System.out.println("SCREEEEEEECH EXPLOSION");
    }
}

public class Main {

    public static void main(String[] args) {
//        for(int i = 1; i < 11; i++) {
//            Movie movie = randomMovie();
//            System.out.println("Movie #" + i + " : " + movie.getName() + "\n"
//                                + "Plot: " + movie.plot() + "\n");
//        }

        for (int i = 1; i < 5; i++) {
            Car car = randomCar();
            car.startEngine();
            car.accelerate();
            car.brake();
        }

    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;

        switch (randomNumber) {
            case 1:
                return new DumpTruck();
            case 2:
                return new RegularCar();
            case 3:
                return new RaceCar();
        }
        return null;
    }

//    public static Movie randomMovie() {
//        int randomNumber = (int) (Math.random() * 5) + 1;
//        System.out.println("Random number generated was " + randomNumber);
//        switch (randomNumber) {
//            case 1:
//                return new Jaws();
//            case 2:
//                return new IndependenceDay();
//            case 3:
//                return new MazeRunner();
//            case 4:
//                return new StarWars();
//            case 5:
//                return new ForgettableMovie();
//        }
//        return null;
//    }
}










































