package Week12Challenge;

public class Character implements GameCharacter {

    private String name;
    private double might;

    public Character (String name) {
        this.name = name;
        this.might = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMight() {
        return might;
    }
}
