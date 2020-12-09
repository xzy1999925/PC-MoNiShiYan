public class Test{
                    public static void main (String args[]){
       CPU cpu = new CPU ();
       cpu.setSpeed(2200);
       HardDisk disk = new HardDisk();
       disk.setAmount(200);
       PC pc = new PC();
       pc.setCPU(cpu);
       pc.HardDisk(disk);
       pc.show();
       }
 }


public class PC{
        CPU cpu = new CPU();
         HardDisk disk = new HardDisk();
         void setCPU(CPU c){
         this.cpu = c;
       
    }    
public void show() {
System.out.println("cpu的速度"+cpu.speed);
System.out.println("硬盘的容量"+HD.amount);

    }
}


public class HardDisk{
     int amount;
     public void setAmount(int m){
     this.amount=m;
     }
     int getAmount(){
     return amount;
     }
}

结果：
cpu的速度2200
硬盘的容量200