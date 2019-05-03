package apreview;
public class Machine {
    private PaperRoll paper;

    public Machine(PaperRoll roll) {
        paper = roll;
    }

    public PaperRoll getPaperRoll() {
        return paper;
    }

    /**
     * Returns the current partial roll and replaces it with the new roll,
     * 
     * @param pRoll a new full PaperRoll
     * @return the old nearly empty PaperRoll
     */
    public PaperRoll replacePaper(PaperRoll pRoll) {
        /* to be implemented in part (a) */
        PaperRoll temp = paper;
        paper = pRoll;
        return temp;
    }
    /* Additional implementation not shown */
}