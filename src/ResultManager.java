import java.util.ArrayList;

public class ResultManager {

    private ArrayList<Result> results = new ArrayList<>();

    public void addResult(Result result) {
        results.add(result);
        System.out.println("Result added successfully!");
    }

    public void viewResults() {
        if (results.isEmpty()) {
            System.out.println("No results available.");
            return;
        }

        for (Result result : results) {
            result.display();
        }
    }
}