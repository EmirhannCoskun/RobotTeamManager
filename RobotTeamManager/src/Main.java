import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Team team6038 = new Team("İtobot", 6038);

        MecanumRobot mecanumRobot6038 = new MecanumRobot("Minibug", 202506, 90, 4);
        ArmRobot armRobot6038 = new ArmRobot("Bumblebee", 6038, 100, 3.50, true);
        team6038.robotEkle(mecanumRobot6038);
        team6038.robotEkle(armRobot6038);

        Motor motor1 = new Motor(1, 1.0, true);
        mecanumRobot6038.motorEkle(motor1);

        Motor motor2 = new Motor(2, 0.0, false);
        armRobot6038.motorEkle(motor2);

        Sensor sensor1 = new Sensor("Ultrasonik", 5.0, true);
        armRobot6038.sensorEkle(sensor1);

        Sensor sensor2 = new Sensor("Kamera", 0.0, false);
        mecanumRobot6038.sensorEkle(sensor2);

        Oyuncu oyuncu1 = new Oyuncu("Yahya", 6038, "Driver");
        Oyuncu oyuncu2 = new Oyuncu("Samet", 6038, "Driver");

        team6038.oyuncuEkle(oyuncu1);
        team6038.oyuncuEkle(oyuncu2);

        mecanumRobot6038.ileriGit();
        mecanumRobot6038.geriyeGit();
        armRobot6038.koluKaldir();
        armRobot6038.koluIndir();
        team6038.takimBilgisiYazdir();
        mecanumRobot6038.bataryaKontrol();
    }
}