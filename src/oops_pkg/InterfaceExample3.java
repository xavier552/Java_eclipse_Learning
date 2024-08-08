package oops_pkg;

// Interface defining the basic TV remote functionalities
interface iTvRemote {
    void display();
}

// Interface extending iTvRemote with additional features
interface iSmartTvRemote extends iTvRemote {
    void Features();
}

// TV class implementing the smart TV remote functionalities
class TV implements iSmartTvRemote {

    @Override
    public void display() {
        System.out.println("Display of Smart TV Remote");
    }

    @Override
    public void Features() {
        System.out.println("Features of Smart TV Remote");
    }
}

// Main class to demonstrate the functionality
public class InterfaceExample3 {
    public static void main(String[] args) {
        TV obj = new TV();
        obj.display();
        obj.Features();
    }
}
