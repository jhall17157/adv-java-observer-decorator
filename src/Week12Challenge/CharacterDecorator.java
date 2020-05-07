package Week12Challenge;

public abstract class CharacterDecorator implements GameCharacter {

    protected GameCharacter character;

    public CharacterDecorator(GameCharacter character) {
        this.character = character;
    }
}
