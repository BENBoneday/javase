public class Vehicle
{
	
		double speed;
		int power;
		void speedUp(int s){
			speed += s;
		}
		void speedDown(int d){
			speed -= d;
		}
		void setPower(int p){
			power = p;
		}
		int getPower(){
			return power;
		}
		double getSpeed(){
			return speed;
		}
	}
