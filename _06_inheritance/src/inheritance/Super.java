package inheritance;

public class Super extends Object {
    protected double weight, height;

    Super(){
        System.out.println("Super 클래스의 기본생성자");
    }

    Super(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public void disp(){
        System.out.println("몸무게 = " + weight);
        System.out.println("키 = " + height);

    }
}
