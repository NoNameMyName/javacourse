package org.nestedClasses.localInnerClasses;

public class LocalInner1 {
    public static void main(String[] args) {
        Math.getResult();
    }

}
class Math{
    public static void getResult(){
        class Devide{
            private int devided;
            private int devider;
            public int getDevided() {
                return devided;
            }

            public void setDevided(int devided) {
                this.devided = devided;
            }

            public int getDevider() {
                return devider;
            }

            public void setDevider(int devider) {
                this.devider = devider;
            }
            public int getChastnoe(){
                return devided / devider;
            }
            public int getOstatock(){
                return devided % devider;
            }

        }

        Devide devide = new Devide();
        devide.setDevided(25);
        devide.setDevider(6);
        System.out.println(devide.getChastnoe() + "." + devide.getOstatock());
    }
}
