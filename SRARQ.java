import java.util.Scanner;

public class SRARQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter window size: ");
        int w = sc.nextInt();

        System.out.println("Enter number of frames to transmit: ");
        int f = sc.nextInt();
        int[] frames = new int[50];

        System.out.println("Enter frame elements");

        for (int i = 1; i <= f; i++) {
            frames[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("\nWith sliding window protocol the frames will be sent in the following manner");
        System.out.println(
                "\nAfter sending " + w + " frames at each stage sender waits for acknowledgement sent by the receiver");

        for (int i = 1; i <= f; i++) {
            if (i % w == 0) {
                System.out.println(frames[i]);
                System.out.println("Acknowledgement of above frames sent is received by sender");
            } else {
                System.out.println(frames[i] + " ");
            }
        }

        if (f % w != 0) {
            System.out.println("\nAcknowledgement of above frames sent is received by sender\n");
        }
    }
}
