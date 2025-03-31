public class Card {
    private String value; // string because values are 1, 2, ... 10, J, Q, K, A
    private String type;
    
    public Card(String value, String type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public String toString() {
        return value + "-" + type;
    }

    
}
