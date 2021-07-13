public class IfSample {
    public static void main(String[] args) {
        // 試験の点数によって合格/補習/不合格かを判定するコード
        // 国語の点数
        int kokugo = 80;
        // 数学の点数
        int sugaku = 50;
        // 英語の点数
        int eigo = 60;
        // 合計点
        int goukei = kokugo + sugaku + eigo;

        // 条件式
        // 240点以上なら合格
        // 150点~240点未満なら補習
        // 150点未満なら封合格
        if(goukei >= 240) { // 条件式1
            System.out.println("合格");
        } else if(goukei >= 150) { // 条件式2
            System.out.println("補習");
        } else { // 条件式3
            System.out.println("不合格");
        }

    }
}