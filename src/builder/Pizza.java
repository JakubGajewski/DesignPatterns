package builder;

import java.util.Objects;

public class Pizza {
    private final Size size;
    private final String crust;
    private final String sauce;
    private final String meat;
    private final String vegetable;

    public static class Builder {
        //There is no pizza without the following three:
        private Size size;
        private String crust;
        private String sauce;

        //Two optional ingredients:
        private String meat = null;
        private String vegetable = null;

        public Builder (Size size, String crust, String sauce) {
            this.size = size;
            this.crust = crust;
            this.sauce = sauce;
        }

        public Builder meat (String typeOfMeat) {
            meat = typeOfMeat;
            return this;
        }

        public Builder vegetable (String typeOfVegetable) {
            vegetable = typeOfVegetable;
            return this;
        }

        public Pizza build() {
            return new Pizza (this);
        }
    }

    private Pizza (Builder builder) {
        size = builder.size;
        crust = builder.crust;
        sauce = builder.sauce;
        meat = builder.meat;
        vegetable = builder.vegetable;
    }

    public Size getSize() {
        return size;
    }

    public String getCrust() {
        return crust;
    }

    public String getSauce() {
        return sauce;
    }

    public String getMeat() {
        return meat;
    }

    public String getVegetable() {
        return vegetable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return size == pizza.size &&
                Objects.equals(crust, pizza.crust) &&
                Objects.equals(sauce, pizza.sauce) &&
                Objects.equals(meat, pizza.meat) &&
                Objects.equals(vegetable, pizza.vegetable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, crust, sauce, meat, vegetable);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", crust='" + crust + '\'' +
                ", sauce='" + sauce + '\'' +
                ", meat='" + meat + '\'' +
                ", vegetable='" + vegetable + '\'' +
                '}';
    }
}
