public class ex3 {
    public static void main(String[] args) {
       // iは1から9を繰り返す
       for(int i = 1; i < 10; i++) {
        // jも1から9を繰り返す
        for(int j = 1; j < 10; j++) {
            // 計算結果を表示
            System.out.print(i * j);
            // 空白を出力
            System.out.print(" ");
        }
        // ○○の段が終了した時用の改行
        System.out.println("");
    }
    }
}
