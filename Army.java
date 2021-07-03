public class Army {
    private Army[][] Weapon= new Army[2][3];

    public Army() {
        int Number = 6;
        for (int i=0;i<=Weapon.length;i++){
            for (int j =0;j<Weapon[i].length;j++){
                Weapon[i][j]=new Gun("可移动","可攻击","火炮");
               // System.out.println(Weapon[i][j]);
            }
        }
    }
public void print(){
    for (int i=0;i<=Weapon.length;i++){
        for (int j =0;j<Weapon[i].length;j++){

             System.out.println(Weapon[i][j]);
        }
    }
}
    /*public Army(Army[][] weapon) {
        Weapon = weapon;
    }
    public void addWeapon(Gun wa ){
        for(int i=0;i<Weapon.length;i++){
            for (int j =0;j<Weapon[i].length;j++){
                if (Weapon[i][j]=("不可移动","不可攻击","匕首")){
                    Weapon[i][j]=

                }
            }
        }

    }*/

}
