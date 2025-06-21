package com.hspedu.P07_interface;

public class Interface01 {
    public static void main(String[] args) {
        //
        Camera camera = new Camera();
        Mp3 mp3 = new Mp3();
        Laptop laptop = new Laptop();

        laptop.slot(camera);
        System.out.println("================");
        laptop.slot(mp3);

        // 接口数组
        UsbInterface[] usbInterfaces = new UsbInterface[2];
        usbInterfaces[0] = new Camera();
        usbInterfaces[1] = new Mp3();

        for (UsbInterface usbInterface : usbInterfaces) {
            usbInterface.work();
            if (usbInterface instanceof Camera) {
                ((Camera) usbInterface).film();
            } else if (usbInterface instanceof Mp3) {
                ((Mp3) usbInterface).record();
            }
        }

    }
}


class Camera implements UsbInterface {

    public void film() {
        System.out.println("相机正在拍摄视频 ...");
    }

    @Override
    public void start() {
        System.out.println("相机已连接");
    }

    @Override
    public void work() {
        System.out.println("相机正在传输照片 ...");
    }

    @Override
    public void stop() {
        System.out.println("相机已断开连接");
    }
}

class Mp3 implements UsbInterface {

    public void record() {
        System.out.println("Mp3 正在录音 ...");
    }

    @Override
    public void start() {
        System.out.println("MP3 已连接");
    }

    @Override
    public void work() {
        System.out.println("MP3 正在传输歌曲 ...");
    }

    @Override
    public void stop() {
        System.out.println("MP3 已断开连接");
    }
}

class Laptop {
    public void slot(UsbInterface usbInterface) {
        usbInterface.start();
        usbInterface.work();
        usbInterface.stop();
    }
}