import java.awt.print.Printable;
import java.util.Scanner;

/**
 * @author shi
 * @create 2021/11/2 13:52
 */
public class Tv {
    String tv;
    Scanner input = new Scanner(System.in);
    void TvSystem() {
        int switch1 = 0;

        System.out.println("输入\n 0.关机\n 1.开机");
        int i = 0;
        do {
            if (i != 0) {
                System.out.println("请不要胡乱输入，请重新输入：");
            }
            switch1 = input.nextInt();
            i++;
        } while (switch1 != 0 && switch1 != 1);
        boolean f = true;
        int num = 100;
        while (switch1 != 0) {
            if(f)
                System.out.println("我们以用有 1-5 五个频道，请输入您要观看的频道(输入0关机)：");
            f = true;
            num = input.nextInt();
            if (num == 1) {
                System.out.println("少儿频道");
                if(judge()==0) break;
                else continue;
            } else if (num == 2) {
                System.out.println("体育频道");
                if(judge()==0) break;
                else continue;
            } else if (num == 3) {
                System.out.println("科学频道");
                if(judge()==0) break;
                else continue;
            } else if (num == 4){
                System.out.println("音乐频道");
                if(judge()==0) break;
                else continue;
            }else if (num == 5) {
                System.out.println("电影频道");
                if(judge()==0) break;
                else continue;
            }else if(num ==0)
                break;
            else {
                f = false;
                System.out.println("请重新输入");
            }
        }
        System.out.println("感谢您的使用");
    }

    int judge(){
        System.out.println();
        System.out.println("是否继续观看？\n 0.否\n 1.是");
        int num = input.nextInt();
        while(num!=0 && num!=1){
            System.out.println("请不要胡乱输入，请重新输入：");
            num = input.nextInt();
        }
        return num;
    }
}
