package apreview;
abstract class Phone implements Comparable<Phone> {
    protected int phoneNum;
    // CONSTRUCTORS
    // CONCRETE METHODS

    public abstract void message();

    public abstract int compareTo(Phone other);
}

class Galaxy extends Phone {

    @Override
    public int compareTo(Phone o) {
        if (this.phoneNum == o.phoneNum)
            return 0;
        if (this.phoneNum > o.phoneNum)
            return -1;
        return 1;
    }

    @Override
    public void message() {
        System.out.println("Using messenger app!");
    }
    public static void main(String[] args) {
        //Phone bob = new Phone(); //Cannot instantiate the type Phone
        //Phone sam = new Galaxy(); //Compiles
    }
}


