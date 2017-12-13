public class Compare {
    float valueA;
    float valueB;

    public Compare(float valueA, float valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public Boolean isGreater() {
        return valueA>valueB?true:false;
    }
}
