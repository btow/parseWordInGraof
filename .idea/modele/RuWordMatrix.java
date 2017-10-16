import java.util.HashMap;

/**
 * Created by btow on 12.10.2017.
 */
public class RuWordMatrix {

    private HashMap<Integer, Integer> mCharsCodeToMatrixsIndex;
    private Integer[][] mRuWordMatrix;
    private String mStringWord;

    public RuWordMatrix(final String stringWord) {

        this.mCharsCodeToMatrixsIndex = new HashMap<>();
        Integer matrixIndex = 0;

        for (Integer charsCode = Integer.valueOf("А"); charsCode < Integer.valueOf("Я"); charsCode++) {

            this.mCharsCodeToMatrixsIndex.put(charsCode, matrixIndex);
            matrixIndex++;
        }

        this.mStringWord = stringWord.toUpperCase();
        this.mRuWordMatrix = new Integer[mCharsCodeToMatrixsIndex.size()][mCharsCodeToMatrixsIndex.size()];

        int wordsCharsIndex = 0;

        for (Character charsCode :
                this.mStringWord.toCharArray()) {
            this.mRuWordMatrix
                    [this.mCharsCodeToMatrixsIndex.get(Integer.valueOf(charsCode)).intValue()]
                    [wordsCharsIndex] = 1;
            wordsCharsIndex++;
        }
    }
}
