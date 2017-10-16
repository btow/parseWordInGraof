import java.util.ArrayList;

/**
 * Created by btow on 12.10.2017.
 */
public class WordMatrixArrayList {

    private ArrayList<RuWordMatrix> mWordMatrixArrayList;

    public WordMatrixArrayList(final String inputString) {

        this.mWordMatrixArrayList = new ArrayList<>();

        WordsList wordsList = new WordsList(inputString);

        for (String curentWord :
                wordsList.getWordsList()) {

            (this.mWordMatrixArrayList).add(new RuWordMatrix(curentWord));
        }
    }

}
