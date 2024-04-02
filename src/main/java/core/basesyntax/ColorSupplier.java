package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Colors getRandomColor() {
        Random random = new Random();
        Colors[] colors = Colors.values();
        return colors[random.nextInt(colors.length)];
    }
}
