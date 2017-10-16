import java.util.ArrayList;

/**
 * Created by btow on 12.10.2017.
 */
public class WordsList {

    private ArrayList<String> mStringArrayList;

    public WordsList(String inputString) {

        String curentWord = "";
        int beginIndex = 0, endIndex = inputString.indexOf(' ', beginIndex);

        while (endIndex > -1) {
            this.mStringArrayList.add(inputString.substring(beginIndex, endIndex));
            beginIndex = endIndex + 1;
            endIndex = inputString.indexOf(' ', beginIndex);
        }

    }

    public ArrayList<String> getWordsList() {
        return mStringArrayList;
    }
}
