package overriding;

class Car {

    protected void startEngine() {
        System.out.println("Starting Engine Class: Car");
    }
}

class Tesla extends Car {

    @Override
    public void startEngine() {
        System.out.println("startEngine Class: Tesla - ");
    }

    public void startParentEngine() {
        super.startEngine();
    }
}

class ModelX extends Tesla {
    @Override
    public void startEngine() {
        super.startParentEngine();
        System.out.println("startEngine Class: Tesla - ");
    }
}