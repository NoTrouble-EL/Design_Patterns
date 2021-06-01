package cn.xiaohupao.builder;

/**
 * @Author: xiaohupao
 * @Date: 2021/6/1 21:35
 */
public class Computer {

    private final String cpu;
    private final String ram;
    private final int usbCount;
    private final String keyboard;
    private final String display;

    private Computer(Builder builder){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.usbCount = builder.usbCount;
        this.keyboard = builder.keyboard;
        this.display = builder.display;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", usbCount=" + usbCount +
                ", keyboard='" + keyboard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }

    public static class Builder{
        private String cpu;
        private String ram;
        private int usbCount;
        private String keyboard;
        private String display;

        public Builder(String cpu, String ram){
            this.cpu = cpu;
            this.ram = ram;
        }

        public int getUsbCount() {
            return usbCount;
        }

        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }

        public String getKeyboard() {
            return keyboard;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public String getDisplay() {
            return display;
        }

        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
