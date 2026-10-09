package frc.robot.parameters;

import edu.wpi.first.wpilibj.util.Color8Bit;

public enum Colors {
    Red(255,0,0),
    Green(0,255,0),
    Blue(0,0,255),
    Black(0,0,0),
    White(255,255,255),
    Yellow(255,255,0);

    private Color8Bit color8Bit;

    public Colors(int red, int green, int blue){
        this.color8Bit = new Color8Bit(red, green, blue);
    }
    // public Colors(Color8Bits Color8Bit){
    //     this.color8Bit = Color8Bit;
    // }
    public Color8Bit get_color(){
        return color8Bit;
    }
    public int get_Red(){
        return color8Bit.red;
    }
    public int get_Green(){
        return color8Bit.green;
    }
    public int get_Blue(){
        return color8Bit.blue;
    }
    
}

