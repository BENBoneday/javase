//import java.util.Objects;

import java.util.Objects;

public class  Gun extends Weapon implements Moveable,Shootable{
    private String motion;
    private String fight;
    private String name;

    public Gun() {
    }

    public Gun(String motion, String fight, String name) {
        this.motion = motion;
        this.fight = fight;
        this.name = name;
    }

    public String getMotion() {
        return motion;
    }

    public void setMotion(String motion) {
        this.motion = motion;
    }

    public String getFight() {
        return fight;
    }

    public void setFight(String fight) {
        this.fight = fight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "motion='" + motion + '\'' +
                ", fight='" + fight + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gun)) return false;
        Gun gun = (Gun) o;
        return Objects.equals(motion, gun.motion) &&
                Objects.equals(fight, gun.fight) &&
                Objects.equals(name, gun.name);
    }


}

