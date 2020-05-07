package Week12Challenge;

public class Poisoned extends CharacterDecorator {


    public Poisoned(GameCharacter character) {
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", Poisoned";
    }

    @Override
    public double getMight() {
        return character.getMight() - 3;
    }
}
