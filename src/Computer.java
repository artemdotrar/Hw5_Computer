import java.util.Random;

public class Computer {
    String proc;
    int memory;
    int hdd;
    int resource;
    boolean isWorking;

    public Computer(String proc, int memory, int hdd, int resource) {
        this.proc = proc;
        this.memory = memory;
        this.hdd = hdd;
        this.resource = resource;
        this.isWorking = false;
    }

    public void printInf() {
        System.out.println(proc + "\t ОЗУ: " + memory + "\t жесткий диск: " + hdd + "\t ресурс работы: " + resource);
    }

    public void powerOn(int numOn) {
        if (isWorking) {
            System.out.println("Компьютер уже запущен");
            return;
        }
        if (resource <= 0) {
            System.out.println("Компьютер не может запуститься, закончлися ресурс");
            return;
        }
        Random r = new Random();
        int numRandom = r.nextInt(2);
        if (numRandom == numOn) {
            resource--;
            isWorking = true;
            System.out.println("Компьютер запустился");
        } else {
            resource = 0;
            System.out.println("Ошибка запуска! Комп погиб");
        }
    }

    public void powerOff(int numOff) {
        if (!isWorking) {
            System.out.println("Компьютер уже выключен");
            return;
        }
        Random r = new Random();
        int numRandom = r.nextInt(2);
        if (numRandom == numOff) {
            isWorking = false;
            System.out.println("Компьютер выключился");
        } else {
            isWorking = false;
            resource = 0;
            System.out.println("Ошибка выключения! Комп погиб");
        }
    }
}
