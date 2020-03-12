package academy.everyonecodes.amazinggoodbyeworld.ServiceClasses;

public class AmazingGoodbyeWorld {
    private final World world;
    private final Goodbye goodbye;

    public AmazingGoodbyeWorld(World world, Goodbye goodbye) {
        this.world = world;
        this.goodbye = goodbye;
    }

    public String get() {
        return goodbye.get() + " " + world.get();
    }
}
