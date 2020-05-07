package Week12Challenge;

public class Shield extends CharacterDecorator {


    public Shield(GameCharacter character) {
        super(character);
    }
    @Override
    public double getMight() {
        return character.getMight() + 5;
    }

    @Override
    public String getName() {
        return character.getName() + ", Shield-Bearer";
    }
}
