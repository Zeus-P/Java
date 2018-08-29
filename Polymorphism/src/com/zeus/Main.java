package com.zeus;

class Movie{
    private String name;

    public Movie(String name){
        this.name=name;
    }
    public String plot(){
        return "No Plot Here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
       return  "A shark eats lots of people";
    }
}
class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");

    }

    @Override
    public String plot() {
        return "Aliens Attempt to take over planet earth";
    }
}
class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape the maze.";
    }
}
class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Fores Try to take over the universe";
    }
}
class Forgetable extends Movie{
    public Forgetable() {
        super("Forgetable");
    }
    //No Plot Method
}
public class Main {

    public static void main(String[] args) {
        for(int i =1;i<11;i++){
            Movie movie = randomMovie();
            System.out.println("Movie #"+i+" is : "+movie.getName()+"\n"+
            "Plot : "+movie.plot()+"\n");
            Movie obj = new Jaws(); //We Can Make Objects of Parent Class type.
            System.out.println(obj.plot());
            Forgetable forg = new Forgetable();
            System.out.println(forg.plot());
            Movie mov = new Movie("Ptiya");
            System.out.println(mov.plot());
            Jaws jaw = new Jaws();
            System.out.println(jaw.plot());

        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;  //Just To Make It In range 1 to  5
        System.out.println("The random Number generated is : " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay ();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;

    }
}
