package com.bootcamp.lab3.lab33;

public class PlayableTest {
    public static void main(String[] args) {
        IPlayable[] devices = new IPlayable[3];

        devices[0] = new Guitar();
        devices[1] = new VideoGame("Super Mario");
        devices[2] = new Guitar();

        System.out.println("=====Choi do choi=====\n");

        for (IPlayable device : devices) {
            device.play();
        }

        testDevice(new Guitar());
        testDevice(new VideoGame("Pacman"));

    }

    public static void testDevice(IPlayable device) {
        System.out.println("\n--- Testing device ---");
        device.play();
        device.stop(); 
    }

}
