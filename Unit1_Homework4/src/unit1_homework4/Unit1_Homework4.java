/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit1_homework4;

/**
 *
 * @author tyatya
 */
public class Unit1_Homework4 {
    public class Car {
        private int speed = 0;
        private double distance = 0;
        
        public void setSpeed(int speed){
            this.speed = speed;
        }
        public int getSpeed(){
            return this.speed;
        }
        public void setDistance(double distance) { 
            this.distance = distance;
        }
        public double getDistance(){
            return this.distance;

        }
        public void accelerate (int speed){
            if(speed >= 0){
                this.speed += speed;
            }
            if (this.speed < 0){
                this.speed = 0;
            }
        }
        public void travel (double hours){
            this.distance += this.speed * hours;
        }

        
    }
    
    public class Lab4{
        public static void main(String[] args){
            //1. Creat instance of the car class
            Car myCar = new Car();
            
            //2. Set the speed of myCar
            myCar.setSpeed(0);
            
            //3.Print current speed and total distance
            System.out.println("Current Speed: " + myCar.getSpeed() + "units/hours");
            System.out.println("Total Distance: " + myCar.getDistance() + "units");
            
            
            //4.Accelerate myCar by 50 units
            myCar.accelerate(50);
            
            //5. Travel a distance of 2.5
            myCar.travel(2.5);
            
            //6.Print current speed and total distanve traveled
            System.out.println("Current Speed after acceleration: " + myCar.getSpeed() + "units/hour");
            System.out.println("Total Distance after traveling: " + myCar.getDistance() + "units");
            
            
            //7.Decelerate myCar by 15  units
            myCar.decelerate(15);
            
            //8.Travel an additional distance of 1.5
            myCar.travel(1.5);
            
            //9.Print current speed and total distance traveled
            System.out.println("Current Speed after deceleration: " + myCar.getSpeed() + "units/hour");
            System.out.println("Total Distance after additional traveling: " + myCar.getDistance() + "units");
            
            
            
        }
    }
    
}
