public class HisCounter {
    private int getValue(value) {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void addOne(int val) {
        val = val + 1;
    }

    public void increase(HisCounter cntObj) {
        int v = cntObj.getValue() + 1;
        cntObj.setValue(v);
    }

    public static void main(String[] args) {
        // int val = 10;
        // HisCounter.addOne(val);

        // System.out.println(val);
        HisCounter mc = new HisCounter();
        mc.setValue(10);
        HisCounter.increase(mc);
        System.out.println(mc.getValue());
    }

}
