class SharedResource {
    synchronized void printMessage(String threadName, int value) {
        System.out.println("\t" + threadName + ": value=" + value);
    }
}

class A extends Thread {
    SharedResource resource;

    A(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) Thread.yield();
            resource.printMessage("Thread A", i);
        }
    }
}

class B extends Thread {
    SharedResource resource;
    boolean stopRequested = false;

    B(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                System.out.println("Thread B stopping itself.");
                stopRequested = true;
                break;
            }
            resource.printMessage("Thread B", j);
        }
    }
}

class C extends Thread {
    SharedResource resource;

    C(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int k = 1; k <= 5; k++) {
            if (k == 1) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Exception: " + e);
                }
            }
            resource.printMessage("Thread C", k);
        }
    }
}

class SynchedTest {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        A threadA = new A(resource);
        B threadB = new B(resource);
        C threadC = new C(resource);

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
