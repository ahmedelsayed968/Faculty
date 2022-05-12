package Chapter13Interfaces;

public class Apple extends Fruit{

    /*Fruit fruit = new Fruit() {
        @Override
        public String howToEat() {
            return "Apple : make apple cider";
        }
    };
*/

    @Override
    public String howToEat() {
        return "Apple : make apple cider";
    }
}
