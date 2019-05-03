package apreview;
public class Parabola{
    private int a,b,c;
    public Parabola(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getAxis(){
        return -1*b/(2*a);
    }
    public boolean isOnGraph(int x, int y){
        return y == a*x*x + b*x + c;
    }
}