package apreview;
import java.util.*;

public class PrintingFactory {
    // All machines available in the company
    private Machine[] machines;
    // The available full paper rolls (1000 meters each)
    private ArrayList<PaperRoll> newRolls = new ArrayList<PaperRoll>();
    // The used paper roll remnants (less than 4,0 meters each)
    private ArrayList<PaperRoll> usedRolls = new ArrayList<PaperRoll>();

    public PrintingFactory(int numMachines) {
        machines = new Machine[numMachines];
    }

    /**
     * Replaces the PaperRoll for any machine that has a PaperRoll with less than
     * 4.0 meters of paper remaining, The used roll is added to usedRolls, A new
     * roll is removed from newRolls, Precondition: newRolls is not empty.
     */
    public void replacePaperRolls(PaperRoll roll) {
        /* to be implemented in part (b) */
        for (int i = 0; i < machines.length; i++)
            if (machines[i].getPaperRoll().getMeters() < 4)
                usedRolls.add(machines[i].replacePaper(newRolls.remove(0)));
    }

    /**
     * Returns the total amount of paper that has been used.
     * 
     * @return the total amount of paper that has been used from the PaperRolls in
     *         the usedRolls list plus the paper that has been used from the
     *         PaperRolls on the machines.
     */
    public double getPaperUsed() {
        /* to be implemented in part (c) */
        double total = 0;
        for (Machine temp : machines)
            total += 1000 - temp.getPaperRoll().getMeters();
        for (PaperRoll waste : usedRolls)
            total += 1000 - waste.getMeters();
        return total;
    }
    /* Additional implementation not shown */
}