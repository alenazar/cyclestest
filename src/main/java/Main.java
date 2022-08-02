import ru.netology.sqr.javaqamvn2.services.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();
        int numberOfSquares = service.squareRootsCounter(300, 500);
        System.out.println(numberOfSquares);
    }
}
