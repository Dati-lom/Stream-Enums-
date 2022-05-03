package pgdp.adventuin;

import pgdp.color.ExceptionUtil;
import pgdp.color.RgbColor;

public class Adventuin {
    private final String name;
    private final int height;

    private final RgbColor color;
    private final HatType hatType;
    private final Language language;

    public Adventuin(String name, int height, RgbColor color, HatType hatType, Language language) {
        this.name = name;
        this.height = height;
        this.color = color;
        this.hatType = hatType;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public RgbColor getColor() {
        return color;
    }

    public HatType getHatType() {
        return hatType;
    }

    public Language getLanguage() {
        return language;
    }


    @Override
    public String toString() {
        return "Adventuin{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", color=" + color +
                ", hatType=" + hatType +
                ", language=" + language +
                '}';
    }
}
