package day37_Inheritance.SportTask;

public class Sport {

    public String name;
    public int numberOfPlayer;
    public int numberOfRefere;
    public String rules;

    public Sport(String name, int numberOfPlayer, int numberOfRefere, String rules) {
        this.name = name;
        this.numberOfPlayer = numberOfPlayer;
        this.numberOfRefere = numberOfRefere;
        this.rules = rules;
    }



    @Override
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayer=" + numberOfPlayer +
                ", numberOfRefere=" + numberOfRefere +
                ", rules='" + rules + '\'' +
                '}';
    }

    public void play(String play){
        System.out.println(name+numberOfPlayer+" is playing");

    }
}
/*

. Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfRefere, rules

			methods:
				setInfo()
				play()
				toString()

		2. create the following sub classes of Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball

			Add any missing variables or methods

			Note: you can search them on google



 */
