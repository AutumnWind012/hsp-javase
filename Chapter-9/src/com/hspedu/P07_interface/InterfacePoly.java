package com.hspedu.P07_interface;

public class InterfacePoly {
    public static void main(String[] args) {
        IWireless iWireless = new Wifi();
        iWireless = new Bluetooth();

        IChild ih = new Momo();
        IParent ia = new Momo();
    }
}



interface IWireless {}
class Wifi implements IWireless{}
class Bluetooth implements IWireless{}



interface IParent {
    void hi();
}
interface IChild extends IParent{ }
class Momo implements IChild {
    @Override
    public void hi() {

    }
}

