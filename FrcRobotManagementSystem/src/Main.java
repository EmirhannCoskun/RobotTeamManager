import AbstractClasses.Komut;
import AbstractClasses.Motor;
import AbstractClasses.Sensor;
import Classes.*;
import Generics.KomutSirasi;
import MainSystem.RobotTakimi;

public class Main {
    public static void main(String[] args) {

        MecanumRobot mecanumRobot1 = new MecanumRobot("Mechanum",1);
        MecanumRobot mecanumRobot2 = new MecanumRobot("Unibon",2);

        ArmRobot armRobot1 = new ArmRobot("Bumblebee",1);
        ArmRobot armRobot2 = new ArmRobot("Armagedon",2);

        UltrasonikSensor ultrasonikSensor = new UltrasonikSensor(1,"Ultrasonik1");
        Kamera kamera = new Kamera(2,"Limelight");

        DcMotor dcMotor = new DcMotor(1);
        ServoMotor servoMotor = new ServoMotor(1);

        mecanumRobot1.sensorEkle(kamera);
        mecanumRobot2.sensorEkle(ultrasonikSensor);

        mecanumRobot1.motorEkle(dcMotor);
        mecanumRobot2.motorEkle(servoMotor);

        armRobot1.sensorEkle(ultrasonikSensor);
        armRobot2.sensorEkle(kamera);

        armRobot1.motorEkle(servoMotor);
        armRobot2.motorEkle(dcMotor);

        RobotTakimi takim1 = new RobotTakimi();
        takim1.robotEkle(armRobot1);
        takim1.robotEkle(mecanumRobot1);
        takim1.tumRobotlariGoster();

        RobotTakimi takim2 = new RobotTakimi();
        takim2.robotEkle(armRobot2);
        takim2.robotEkle(mecanumRobot2);
        takim2.tumRobotlariGoster();

        KomutSirasi komutSirasi = new KomutSirasi<>();

        komutSirasi.komutEkle(komutSirasi.bosMu());
        komutSirasi.komutEkle(komutSirasi.boyut());

        armRobot1.robotBilgisiYazdir();
        armRobot2.robotBilgisiYazdir();

        mecanumRobot1.robotBilgisiYazdir();
        mecanumRobot2.robotBilgisiYazdir();

        mecanumRobot1.ileriGit(55);
        mecanumRobot2.geriyeGit(25);

        armRobot1.sagaDon(35);
        armRobot2.solaDon(40);

        kamera.sensoruOku();
        ultrasonikSensor.sensoruOku();

        ultrasonikSensor.veriAl();
        kamera.veriAl();
    }
}
