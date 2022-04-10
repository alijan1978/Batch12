package Class25;

import java.applet.Applet;

public class WatchTester {
    public static void main(String[] args) {
        AppleWatch appleWatch=new AppleWatch(2,16, 1.5,"Apple");
        appleWatch.showHealthTips();
        AppleWatch.displayTime();
    }
}
